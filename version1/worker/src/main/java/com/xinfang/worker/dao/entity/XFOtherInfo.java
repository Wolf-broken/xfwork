package com.xinfang.worker.dao.entity;

import com.alibaba.fastjson.JSONObject;

public class XFOtherInfo {
    private String xfid;
    private String otherPid;
    private String otherPname;
    private String otherPcontact;

    public XFOtherInfo() {

    }

    public XFOtherInfo(String xfid, JSONObject otherPinfo){
        this.xfid=xfid;
        this.otherPid=otherPinfo.getString("idnum");
        this.otherPname=otherPinfo.getString("name");
        this.otherPcontact=otherPinfo.getString("contact");
    }

    public String getXfid() {
        return xfid;
    }

    public void setXfid(String xfid) {
        this.xfid = xfid;
    }

    public String getOtherPid() {
        return otherPid;
    }

    public void setOtherPid(String otherPid) {
        this.otherPid = otherPid;
    }

    public String getOtherPname() {
        return otherPname;
    }

    public void setOtherPname(String otherPname) {
        this.otherPname = otherPname;
    }

    public String getOtherPcontact() {
        return otherPcontact;
    }

    public void setOtherPcontact(String otherPcontact) {
        this.otherPcontact = otherPcontact;
    }
}
