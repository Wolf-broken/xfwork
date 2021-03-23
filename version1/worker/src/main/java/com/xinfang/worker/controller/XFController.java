package com.xinfang.worker.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xinfang.worker.dao.entity.AJListInfo;
import com.xinfang.worker.dao.entity.XFAJInfo;
import com.xinfang.worker.dao.entity.XFInfo;
import com.xinfang.worker.dao.entity.XFOtherInfo;
import com.xinfang.worker.service.XFInfoManager;
import com.xinfang.worker.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Slf4j
@RestController
@RequestMapping(value = "XFController")
public class XFController {

    @Autowired
    public XFInfoManager xfInfoManager;

    @RequestMapping(value = "addInfo", method = RequestMethod.POST)
    public String addInfo(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        int phno=xfInfoManager.getPhNo();
        String phStr=String.format("%08d",phno);
        phStr="XF"+phStr;

        String xfid=phStr;
        JSONObject firstPinfo=jsonObject.getJSONObject("firstXFPerson");
        JSONArray otherPinfoArray=jsonObject.getJSONArray("otherInfoArray");
        String nodedata=jsonObject.getString("nodedata");
        String xfPcount=jsonObject.getString("xfPcount");
        String xfsub=jsonObject.getString("xftype");
        String ajid = jsonObject.getString("ajid");
        String ajtype = jsonObject.getString("ajtype");
        String ajcause = jsonObject.getString("ajcause");

        XFInfo xfInfo = new XFInfo(xfid,xfsub,xfPcount,firstPinfo,nodedata);
        XFAJInfo xfajInfo = new XFAJInfo(xfid, ajid, ajtype, ajcause);

        xfInfoManager.addXFDJInfo(xfInfo);
        xfInfoManager.addXFAJInfo(xfajInfo);

        for(int i=0;i<otherPinfoArray.size();++i) {
            JSONObject otherinfo = (JSONObject) otherPinfoArray.get(i);

            xfInfoManager.addOtherInfo(new XFOtherInfo(xfid, otherinfo));
        }

        ResponseUtil.write(response, phStr);

        xfInfoManager.updatePhNo();

        return null;
    }

    @RequestMapping(value = "getInfo")
    public String getInfo(@RequestBody JSONObject reqBody, HttpServletRequest request, HttpServletResponse response) throws  Exception{

        String xfid = reqBody.getString("xfid");

        JSONObject resMsg = new JSONObject();
        resMsg.put("code",200);

        JSONObject resData = new JSONObject();
        resData.put("XFDJInfo", xfInfoManager.getXFDJInfo(xfid));
        resData.put("XFAJInfo", xfInfoManager.getXFAJInfo(xfid));
        resData.put("XFOtherInfo", xfInfoManager.getXFOtherInfo(xfid));

        resMsg.put("data", resData);

        ResponseUtil.write(response, resMsg);
        return null;
    }
}
