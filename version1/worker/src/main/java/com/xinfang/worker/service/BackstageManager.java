package com.xinfang.worker.service;

import com.xinfang.worker.dao.entity.OperateLog;
import com.xinfang.worker.dao.entity.UserInfo;
import com.xinfang.worker.dao.mappers.BackstageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class BackstageManager {
    @Resource
    private BackstageMapper backstageMapper;

    public UserInfo getUserInfo(String email){
        return backstageMapper.getUserInfo(email);
    }

    public ArrayList<OperateLog> getAllOperateLog(){
        return backstageMapper.getAllOperateLog();
    }

    public void addOperateLog(OperateLog operateLog){
        backstageMapper.addOperateLog(operateLog);
    }

}
