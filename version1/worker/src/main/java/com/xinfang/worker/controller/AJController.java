package com.xinfang.worker.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xinfang.worker.dao.entity.AJInfo;
import com.xinfang.worker.dao.entity.AJListInfo;
import com.xinfang.worker.service.AJInfoManager;
import com.xinfang.worker.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping(value = "AJController")
public class AJController {
    @Autowired
    public AJInfoManager ajInfoManager;

    @RequestMapping(value = "getListInfo", method = RequestMethod.POST)
    public String getListInfo(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        String idnum = jsonObject.getString("idnum");

        ArrayList<AJListInfo> ajListInfos=ajInfoManager.getAJListInfoByIdnum(idnum);

        String jsonStr = JSON.toJSON(ajListInfos).toString();
        ResponseUtil.write(response, jsonStr);

        return null;
    }

    @RequestMapping(value = "getInfo", method = RequestMethod.POST)
    public String getInfo(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        String ajid = jsonObject.getString("ajid");
        AJInfo ajInfo=ajInfoManager.getAjInfoById(ajid);

        String jsonStr = JSON.toJSON(ajInfo).toString();
        ResponseUtil.write(response, jsonStr);

        return null;
    }

    @RequestMapping(value = "getState", method = RequestMethod.POST)
    public String getState(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        String ajid = jsonObject.getString("ajid");
        String ajstate=ajInfoManager.getAJStateById(ajid);

        ResponseUtil.write(response, ajstate);

        return null;
    }
}
