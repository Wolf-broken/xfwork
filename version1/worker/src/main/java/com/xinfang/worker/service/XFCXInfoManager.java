package com.xinfang.worker.service;

import com.xinfang.worker.dao.entity.XFCXInfo;
import com.xinfang.worker.dao.mappers.XFCXInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class XFCXInfoManager {
    @Resource
    private XFCXInfoMapper xfcxInfoMapper;

    public ArrayList<XFCXInfo> getListInfos(){
        return xfcxInfoMapper.getListInfos();
    }

    public void addXFCXInfo(XFCXInfo xfcxInfo){
        xfcxInfoMapper.addXFCXInfo(xfcxInfo);
    }

    public void deleteXFCX(String title){
        xfcxInfoMapper.deleteXFCX(title);
    }
}
