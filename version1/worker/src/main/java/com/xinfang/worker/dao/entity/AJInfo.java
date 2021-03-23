package com.xinfang.worker.dao.entity;

public class AJInfo {
    private String ajid;
    private String ajname;
    private String ajtype;
    private String ajcourt;
    private String isappeal;

    public AJInfo(){

    }

    public String getAjid() {
        return ajid;
    }

    public void setAjid(String ajid) {
        this.ajid = ajid;
    }

    public String getAjname() {
        return ajname;
    }

    public void setAjname(String ajname) {
        this.ajname = ajname;
    }

    public String getAjtype() {
        return ajtype;
    }

    public void setAjtype(String ajtype) {
        this.ajtype = ajtype;
    }

    public String getAjcourt() {
        return ajcourt;
    }

    public void setAjcourt(String ajcourt) {
        this.ajcourt = ajcourt;
    }

    public String getIsappeal() {
        return isappeal;
    }

    public void setIsappeal(String isappeal) {
        this.isappeal = isappeal;
    }
}
