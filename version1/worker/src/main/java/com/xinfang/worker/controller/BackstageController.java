package com.xinfang.worker.controller;

import com.alibaba.fastjson.JSONObject;
import com.xinfang.worker.dao.entity.OperateLog;
import com.xinfang.worker.dao.entity.UserInfo;
import com.xinfang.worker.service.BackstageManager;
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
@RequestMapping(value = "BackstageController")
public class BackstageController {

    @Autowired
    public BackstageManager backstageManager;

    @RequestMapping(value = "getUserInfo", method = RequestMethod.POST)
    public void getUserInfo(@RequestBody JSONObject reqBody, HttpServletResponse response, HttpServletRequest request) throws Exception{
        String email = reqBody.getString("email");
        UserInfo userInfo = backstageManager.getUserInfo(email);

        String jsonStr = JSONObject.toJSONString(userInfo);

        ResponseUtil.write(response, jsonStr);
    }

    @RequestMapping(value = "getAllOperateLog", method = RequestMethod.POST)
    public void getAllOperateLog(HttpServletResponse response, HttpServletRequest request) throws Exception{
        ArrayList<OperateLog> operateLogs = backstageManager.getAllOperateLog();

        String jsonStr = JSONObject.toJSONString(operateLogs);

        ResponseUtil.write(response, jsonStr);

    }

    @RequestMapping(value = "addOperateLog", method = RequestMethod.POST)
    public void addOperateLog(@RequestBody JSONObject reqBody, HttpServletResponse response, HttpServletRequest request) throws Exception{

        String username = reqBody.getString("username");
        String type = reqBody.getString("type");
        String time = reqBody.getString("time");

        OperateLog operateLog = new OperateLog(username, type, time);

        backstageManager.addOperateLog(operateLog);

        ResponseUtil.write(response, "add Operate log ok");

    }


}
