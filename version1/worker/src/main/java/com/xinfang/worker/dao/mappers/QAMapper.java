package com.xinfang.worker.dao.mappers;

import com.xinfang.worker.dao.entity.QA;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface QAMapper {
    @Select("select * from qa where qid = #{qid}")
    public QA getQAById(String qid);

    @Select("select * from qa")
    public ArrayList<QA> getAllQA();

    @Update("update qa set views=#{views}, useful=#{useful} where qid=#{qid}")
    public int updateQA(String qid, int views, int useful);

    @Select("select qid from qa")
    public ArrayList<String> getAllId();

    @Insert("insert into qa values(#{qid}, #{question}, #{answer}, #{views}, #{useful})")
    public void addQA(String qid, String question, String answer, int views, int useful);

    @Delete("delete from qa where qid=#{qid}")
    public int deleteQA(String qid);

}
