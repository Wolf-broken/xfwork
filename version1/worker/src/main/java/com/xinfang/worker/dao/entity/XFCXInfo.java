package com.xinfang.worker.dao.entity;

public class XFCXInfo {
    private String title;
    private String type;
    private String time;

    public XFCXInfo(){

    }

    public XFCXInfo(String title){
        this.title=title;
    }

    public XFCXInfo(String title, String type, String time){
        this.title=title;
        this.type=type;
        this.time=time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
