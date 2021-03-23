package com.xinfang.worker.dao.entity;

public class AJListInfo {
    private String ajid;
    private String ajcause;
    private String dsr;
    private String ajtime;

    public AJListInfo(){
        
    }
    public AJListInfo(String ajid){
        this.ajid=ajid;
    }

    public String getAjid() {
        return ajid;
    }
    public void setAjid(String ajid) {
        this.ajid = ajid;
    }

    public String getAjcause() {
        return ajcause;
    }

    public void setAjcause(String ajcause) {
        this.ajcause = ajcause;
    }

    public String getDsr() {
        return dsr;
    }
    public void setDsr(String dsr) {
        this.dsr = dsr;
    }

    public String getAjtime() {
        return ajtime;
    }
    public void setAjtime(String ajtime) {
        this.ajtime = ajtime;
    }
}
