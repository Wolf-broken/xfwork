package com.xinfang.worker.dao.mappers;

import com.xinfang.worker.dao.entity.XFCXInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface XFCXInfoMapper {
    @Select("select * from xfcxinfo")
    public ArrayList<XFCXInfo> getListInfos();

    @Insert("insert into xfcxinfo values(#{title}, #{type}, #{time})")
    public void addXFCXInfo(XFCXInfo xfcxInfo);

    @Delete("delete from xfcxinfo where title=#{title}")
    public int deleteXFCX(String title);
}
