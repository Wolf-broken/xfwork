package com.xinfang.worker.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RequestUtil {

    public static String request(String url, JSONObject params){
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(params.toString(), headers);

        ResponseEntity<String> response = client.exchange(url, method, entity, String.class);

        return response.getBody();
    }


}
