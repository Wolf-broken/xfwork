package com.xinfang.worker.dao.mappers;

import com.xinfang.worker.dao.entity.AJID;
import com.xinfang.worker.dao.entity.AJInfo;
import com.xinfang.worker.dao.entity.AJListInfo;
import com.xinfang.worker.dao.entity.AJState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface AJInfoMapper {

    @Select("select * from aj_id where idnum = #{idnum}")
    public ArrayList<AJID> getAJByIdnum(String idnum);

    @Select("select * from ajlistinfo where ajid = #{ajid}")
    public AJListInfo getAjListById(String ajid);

    @Select("select * from ajinfo where ajid = #{ajid}")
    public AJInfo getAjInfoById(String ajid);

    @Select("select * from aj_state where ajid = #{ajid}")
    public AJState getAjStateById(String ajid);
}
