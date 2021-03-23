package com.xinfang.worker.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xinfang.worker.dao.entity.QA;
import com.xinfang.worker.service.QAManager;
import com.xinfang.worker.util.RequestUtil;
import com.xinfang.worker.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping(value = "QAController")
public class QAController {
    @Autowired
    public QAManager qaManager;

    @RequestMapping(value = "getAllQA", method = RequestMethod.POST)
    public void getAllQA(HttpServletResponse response, HttpServletRequest request) throws Exception {

        ArrayList<QA> qas=qaManager.getAllQA();

        JSONArray qaInfos = new JSONArray();

        for(QA qa : qas){
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("qid", qa.getQid());
            jsonObject.put("question",qa.getQuestion());

            String[] ans=qa.getAnswer().split("\n");
            jsonObject.put("answer",ans);
            jsonObject.put("views",qa.getViews());
            jsonObject.put("useful", qa.getUseful());
            qaInfos.add(jsonObject);
        }

        ResponseUtil.write(response, qaInfos);
    }

    @RequestMapping(value = "updateQA", method = RequestMethod.POST)
    public void updateQA(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {
        String qid = jsonObject.getString("qid");
        int views = jsonObject.getInteger("views");
        int useful = jsonObject.getInteger("useful");

        qaManager.updateQA(qid, views, useful);
        String ok="OK";

        ResponseUtil.write(response, ok);
    }

    @RequestMapping(value = "addQA", method = RequestMethod.POST)
    public void addQA(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        String question = jsonObject.getString("question");
        String answer = jsonObject.getString("answer");

        String resStr = qaManager.addQA(question, answer);

//        String url = "http://localhost:8000/trans";
//
//        String resStr = RequestUtil.request(url, jsonObject);

        ResponseUtil.write(response, resStr);
    }

    @RequestMapping(value = "deleteQA", method = RequestMethod.POST)
    public void deleteQA(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {

        String qid = jsonObject.getString("qid");;
        String resStr = "deleteOK";
        qaManager.deleteQA(qid);

//        String url = "http://localhost:8000/trans";
//
//        String resStr = RequestUtil.request(url, jsonObject);

        ResponseUtil.write(response, resStr);
    }

    @RequestMapping(value = "searchQA", method = RequestMethod.POST)
    public void searchQA(@RequestBody JSONObject jsonObject, HttpServletResponse response, HttpServletRequest request) throws Exception {
        String searchStr = jsonObject.getString("question");

        String url = "http://localhost:8000/search?question=";
        url+=searchStr;

        String resStr = RequestUtil.request(url, jsonObject);

        JSONObject resObj = JSON.parseObject(resStr);

        JSONArray resultArray = new JSONArray();

        JSONObject match = resObj.getJSONObject("result");
        String[] ans=match.getString("answer").split("\n");
        match.put("answer", ans);
        resultArray.add(match);

        JSONArray recommend = resObj.getJSONArray("recommend");

        for(int i=0;i<recommend.size();++i){
            JSONObject rec = recommend.getJSONObject(i);

            String[] recans=rec.getString("answer").split("\n");
            rec.put("answer", recans);

            resultArray.add(rec);
        }

        ResponseUtil.write(response, resultArray);

    }
}
