package com.xinfang.worker.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class StringUtil {

    public  static  String[]  getIdList(String ids){
        List<String>  IdList = new ArrayList<String>();
        Pattern p = Pattern.compile(",\\d;");
        String[] idArray = p.split(ids);
        return idArray;
    }
    public static String getId(String id){
        return  null;
    }





}
