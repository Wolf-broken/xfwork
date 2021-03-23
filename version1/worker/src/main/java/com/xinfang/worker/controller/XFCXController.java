package com.xinfang.worker.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xinfang.worker.dao.entity.XFCXInfo;
import com.xinfang.worker.service.XFCXInfoManager;
import com.xinfang.worker.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.processors.JsDateJsonBeanProcessor;
import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.assertj.core.util.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Collection;
import java.util.Scanner;

@Slf4j
@RestController
@RequestMapping(value = "XFCXController")
public class XFCXController {

    @Autowired
    public XFCXInfoManager xfcxInfoManager;

    private static final String JPG = "image/jpeg;charset=GB2312";

    public static final float DEFAULT_DPI = 105;

    @RequestMapping(value = "getListInfo", method = RequestMethod.POST)
    public String getListInfo(HttpServletResponse response, HttpServletRequest request) throws Exception {
        
        String jsonStr=JSON.toJSONString(xfcxInfoManager.getListInfos());
        ResponseUtil.write(response, jsonStr);


        return null;
    }

    @RequestMapping(value = "addFile", method = RequestMethod.POST)
    public String addFile(HttpServletResponse response, HttpServletRequest request) throws Exception {

        Collection<Part> parts = request.getParts();
        String title= null;
        String time = null;
        String type = null;

        for(Part part:parts){
            System.out.println(part.getName());
            InputStream stream = part.getInputStream();

            if(part.getName().equals("lawTitle")){
                title = new Scanner(stream).useDelimiter("\\Z").next();
            }
            else if(part.getName().equals("lawTime")){
                time = new Scanner(stream).useDelimiter("\\Z").next();
            }
            else if(part.getName().equals("lawType")){
                type = new Scanner(stream).useDelimiter("\\Z").next();
            }
            else if(part.getName().equals("lawFile")){
                String path="D:\\projRes\\upload\\"+title+".pdf";

                FileOutputStream fos = null;
                try{
                    fos=new FileOutputStream(new File(path));
                    int b = 0;
                    while((b = stream.read())!=-1){
                        fos.write(b);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    try{
                        fos.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println(title);
        System.out.println(time);
        System.out.println(type);

        XFCXInfo xfcxInfo = new XFCXInfo(title, type, time);
        xfcxInfoManager.addXFCXInfo(xfcxInfo);

        ResponseUtil.write(response, "OK in xfcx addfile");
        return null;
    }

    @RequestMapping(value = "deleteFile", method = RequestMethod.POST)
    public String deleteFile(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        String title = jsonObject.getString("title");
        xfcxInfoManager.deleteXFCX(title);

//        File file = new File(title+".pdf");
//        file.delete();

        String retStr = "delete file ok";

        ResponseUtil.write(response, retStr);

        return null;
    }

    @RequestMapping(value = "getFileInfo", method = RequestMethod.POST)
    public void getFileInfo(@RequestBody JSONObject jsonObject, HttpServletRequest request, HttpServletResponse response) throws Exception{
        String filename= jsonObject.getString("filename");
        filename="xffiles/"+filename+".pdf";
        ClassPathResource res=new ClassPathResource(filename);

        ///////
        /// in linux res.getFile doesn't exist
        ////  solve way

        String tempPath =System.getProperty("java.io.tmpdir") + System.currentTimeMillis()+".pdf";
        File file = new File(tempPath);
        IOUtils.copy(res.getInputStream(),new FileOutputStream(file));

        ///
        ////

        //File file = res.getFile();

        PDDocument doc = PDDocument.load(file);
        PDFRenderer renderer = new PDFRenderer(doc);
        int pageCount = doc.getNumberOfPages();

        BufferedImage image = renderer.renderImageWithDPI(0, DEFAULT_DPI, ImageType.RGB);
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();
        doc.close();

        JSONObject info=new JSONObject();

        info.put("totalpage", pageCount);
        info.put("pageWidth", imageWidth);
        info.put("pageHeight", imageHeight);

        ResponseUtil.write(response, info);
    }


    @RequestMapping(value = "getFile", method = RequestMethod.POST)
    public void getFile(@RequestBody JSONObject jsonObject, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String filename= jsonObject.getString("filename");
        filename="xffiles/"+filename+".pdf";
        ClassPathResource res=new ClassPathResource(filename);


        ///////
        /// in linux res.getFile doesn't exist
        ////  solve way

        String tempPath =System.getProperty("java.io.tmpdir") + System.currentTimeMillis()+".pdf";
        File file = new File(tempPath);
        IOUtils.copy(res.getInputStream(),new FileOutputStream(file));

        ///
        ////


//        File file = res.getFile();
//
//        if(!file.exists()){
//            return;
//        }

        int frompage=Integer.parseInt(jsonObject.getString("frompage"));
        int topage=Integer.parseInt(jsonObject.getString("topage"));

        response.reset(); // 非常重要
        response.setContentType(JPG);

        OutputStream out = response.getOutputStream();

        // 图像合并使用参数
        int width = 0; // 总宽度
        int[] singleImgRGB; // 保存一张图片中的RGB数据
        int shiftHeight = 0;
        BufferedImage imageResult = null;// 保存每张图片的像素值
        PDDocument doc = PDDocument.load(file);
        PDFRenderer renderer = new PDFRenderer(doc);


        for (int i = frompage, len=topage-frompage; i < topage; i++) {

            BufferedImage image = renderer.renderImageWithDPI(i, DEFAULT_DPI, ImageType.RGB);
            int imageHeight = image.getHeight();
            int imageWidth = image.getWidth();
            if (i == frompage) {// 计算高度和偏移量
                width = imageWidth;// 使用第一张图片宽度;
                // 保存每页图片的像素值
                imageResult = new BufferedImage(width, imageHeight * len, BufferedImage.TYPE_INT_RGB);
            } else {
                shiftHeight += imageHeight; // 计算偏移高度
            }
            singleImgRGB = image.getRGB(0, 0, width, imageHeight, null, 0, width);
            imageResult.setRGB(0, shiftHeight, width, imageHeight, singleImgRGB, 0, width); // 写入流中
        }
        doc.close();
        ImageIO.write(imageResult, "jpg", out);// 写图片

    }
}
