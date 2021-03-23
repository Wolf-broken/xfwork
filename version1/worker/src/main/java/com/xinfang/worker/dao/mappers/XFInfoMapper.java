package com.xinfang.worker.dao.mappers;

import com.xinfang.worker.dao.entity.XFAJInfo;
import com.xinfang.worker.dao.entity.XFInfo;
import com.xinfang.worker.dao.entity.XFOtherInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface XFInfoMapper {

    @Insert("insert into xfdjinfo values " +
            "(#{xfid}, #{xfsub}, #{xfpcount}, #{firstPid}, #{firstPname}, #{firstPcontact}, #{firstPemail}, #{firstPaddress}, #{nodedata})")
    public int addXFDJInfo(XFInfo xfInfo);

    @Insert("insert into xfother values " +
            "(#{xfid}, #{otherPid}, #{otherPname}, #{otherPcontact})")
    public int addOtherInfo(XFOtherInfo xfOtherInfo);

    @Insert("insert into xfajinfo values "+
            "(#{xfid}, #{ajid}, #{ajtype}, #{ajcause})")
    public int addXFAJInfo(XFAJInfo xfajInfo);

    @Select("select * from xfdjinfo where xfid=#{xfid}")
    public XFInfo getXFDJInfo(String xfid);

    @Select("select * from xfother where xfid=#{xfid}")
    public XFOtherInfo[] getXFOtherInfo(String xfid);

    @Select("select * from xfajinfo where xfid=#{xfid}")
    public XFAJInfo getXFAJInfo(String xfid);


    @Select("select num from phno")
    public int getPhNo();

    @Update("update phno set num=num+1")
    public int updatePhNo();

}
