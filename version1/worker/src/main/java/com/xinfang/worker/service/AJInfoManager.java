package com.xinfang.worker.service;

import com.xinfang.worker.dao.entity.AJID;
import com.xinfang.worker.dao.entity.AJInfo;
import com.xinfang.worker.dao.entity.AJListInfo;
import com.xinfang.worker.dao.entity.AJState;
import com.xinfang.worker.dao.mappers.AJInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service
public class AJInfoManager {
    @Resource
    private AJInfoMapper ajInfoMapper;

    public ArrayList<AJListInfo> getAJListInfoByIdnum(String idnum){
        ArrayList<AJID> ajids=ajInfoMapper.getAJByIdnum(idnum);
        ArrayList<AJListInfo> ajListInfos=new ArrayList<AJListInfo>();
        for(AJID ajid:ajids){
            AJListInfo ajListInfo=ajInfoMapper.getAjListById(ajid.getAjid());
            if(ajListInfo!=null){
                ajListInfos.add(ajListInfo);
            }

        }
        return ajListInfos;
    }

    public AJInfo getAjInfoById(String ajid){
        return ajInfoMapper.getAjInfoById(ajid);
    }

    public String getAJStateById(String ajid){
        return ajInfoMapper.getAjStateById(ajid).getAjstate();
    }
}
