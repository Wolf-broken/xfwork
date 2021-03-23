package com.xinfang.worker.service;

import com.xinfang.worker.dao.entity.XFAJInfo;
import com.xinfang.worker.dao.entity.XFInfo;
import com.xinfang.worker.dao.entity.XFOtherInfo;
import com.xinfang.worker.dao.mappers.XFInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class XFInfoManager {
    @Resource
    private XFInfoMapper xfInfoMapper;

    public void addXFDJInfo(XFInfo xfInfo){
        xfInfoMapper.addXFDJInfo(xfInfo);
    }

    public void addOtherInfo(XFOtherInfo xfOtherInfo){
        xfInfoMapper.addOtherInfo(xfOtherInfo);
    }

    public void addXFAJInfo(XFAJInfo xfajInfo){
        xfInfoMapper.addXFAJInfo(xfajInfo);
    }

    public XFInfo getXFDJInfo(String xfid){
        return xfInfoMapper.getXFDJInfo(xfid);
    }

    public XFAJInfo getXFAJInfo(String xfid){
        return xfInfoMapper.getXFAJInfo(xfid);
    }

    public XFOtherInfo[] getXFOtherInfo(String xfid){
        return  xfInfoMapper.getXFOtherInfo(xfid);
    }

    public int getPhNo(){
        return xfInfoMapper.getPhNo();
    }

    public void updatePhNo(){
        xfInfoMapper.updatePhNo();
    }

}
