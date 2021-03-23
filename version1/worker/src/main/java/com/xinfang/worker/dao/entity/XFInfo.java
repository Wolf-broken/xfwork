package com.xinfang.worker.dao.entity;

import com.alibaba.fastjson.JSONObject;

public class XFInfo {
    private String xfid;
    private String xfsub;
    private String xfpcount;
    private String firstPid;
    private String firstPname;
    private String firstPcontact;
    private String firstPemail;
    private String firstPaddress;
    private String nodedata;

    public XFInfo(){

    }

    public XFInfo(String xfid, String xfsub, String xfpcount, JSONObject firstPinfo, String nodedata){
        this.xfid=xfid;
        this.xfsub=xfsub;
        this.xfpcount=xfpcount;
        this.firstPid=firstPinfo.getString("idnum");
        this.firstPname=firstPinfo.getString("name");
        this.firstPcontact=firstPinfo.getString("contact");
        this.firstPemail=firstPinfo.getString("email");
        this.firstPaddress=firstPinfo.getString("address");
        this.nodedata=nodedata;
    }

    public String getXfid() {
        return xfid;
    }

    public void setXfid(String xfid) {
        this.xfid = xfid;
    }

    public String getXfsub() {
        return xfsub;
    }

    public void setXfsub(String xfsuub) {
        this.xfsub = xfsub;
    }

    public String getXfpcount() {
        return xfpcount;
    }

    public void setXfpcount(String xfpcount) {
        this.xfpcount = xfpcount;
    }

    public String getFirstPid() {
        return firstPid;
    }

    public void setFirstPid(String firstPid) {
        this.firstPid = firstPid;
    }

    public String getFirstPname() {
        return firstPname;
    }

    public void setFirstPname(String firstPname) {
        this.firstPname = firstPname;
    }

    public String getFirstPcontact() {
        return firstPcontact;
    }

    public void setFirstPcontact(String firstPcontact) {
        this.firstPcontact = firstPcontact;
    }

    public String getFirstPemail() {
        return firstPemail;
    }

    public void setFirstPemail(String firstPemail) {
        this.firstPemail = firstPemail;
    }

    public String getFirstPaddress() {
        return firstPaddress;
    }

    public void setFirstPaddress(String firstPaddress) {
        this.firstPaddress = firstPaddress;
    }

    public String getNodedata() {
        return nodedata;
    }

    public void setNodedata(String nodedata) {
        this.nodedata = nodedata;
    }
}
