package com.xinfang.worker.dao.entity;

public class OperateLog {

    private String username;
    private String type;
    private String time;

    public OperateLog(){

    }

    public OperateLog(String username, String type, String time){
        this.username=username;
        this.type=type;
        this.time=time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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


