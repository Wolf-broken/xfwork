package com.xinfang.worker.dao.mappers;

import com.xinfang.worker.dao.entity.OperateLog;
import com.xinfang.worker.dao.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface BackstageMapper {

    @Select("select * from userinfo where email = #{email}")
    public UserInfo getUserInfo(String email);

    @Select("select * from operatelog")
    public ArrayList<OperateLog> getAllOperateLog();

    @Insert("insert into operatelog values(#{username}, #{type}, #{time})")
    public void addOperateLog(OperateLog operateLog);

}
