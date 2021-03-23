package com.xinfang.worker.service;

import com.xinfang.worker.dao.entity.QA;
import com.xinfang.worker.dao.mappers.QAMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class QAManager {
    @Resource
    private QAMapper qaMapper;

    public QA getQAById(String qid){
        return qaMapper.getQAById(qid);
    }

    public ArrayList<QA> getAllQA(){
        return qaMapper.getAllQA();
    }

    public void updateQA(String qid, int views, int useful){
        qaMapper.updateQA(qid, views, useful);
    }

    public String addQA(String question, String answer){
        ArrayList<String> qids = qaMapper.getAllId();
        int maxqid=Integer.MIN_VALUE;
        for(String qid:qids){
            int id = Integer.parseInt(qid);
            if(maxqid<id){
                maxqid=id;
            }
        }

        maxqid+=1;
        String qid = String.valueOf(maxqid);
        System.out.println("qid: "+qid);
        System.out.println("question: "+question);
        System.out.println("answer: "+answer);

        qaMapper.addQA(qid, question, answer, 0, 0);

        return "OK";
    }

    public void deleteQA(String qid){
        qaMapper.deleteQA(qid);
    }

}
