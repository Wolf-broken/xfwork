package com.xinfang.worker.dao.entity;

public class XFAJInfo {
    private String xfid;
    private String ajid;
    private String ajtype;
    private String ajcause;

    public XFAJInfo(){

    }

    public XFAJInfo(String xfid, String ajid, String ajtype, String ajcause){
        this.xfid=xfid;
        this.ajid=ajid;
        this.ajtype=ajtype;
        this.ajcause=ajcause;
    }

    public String getXfid() {
        return xfid;
    }

    public void setXfid(String xfid) {
        this.xfid = xfid;
    }

    public String getAjid() {
        return ajid;
    }

    public void setAjid(String ajid) {
        this.ajid = ajid;
    }

    public String getAjtype() {
        return ajtype;
    }

    public void setAjtype(String ajtype) {
        this.ajtype = ajtype;
    }

    public String getAjcause() {
        return ajcause;
    }

    public void setAjcause(String ajcause) {
        this.ajcause = ajcause;
    }
}
