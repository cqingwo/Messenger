package com.cqwo.core.domain;

import java.util.Date;

/**
 * Created by cqnews on 2017/3/23.
 */
public class SMSInfo {

    /**
     * 短信ID
     */
    private int id; // 短信ID
    /**
     * 用户ID
     */
    private int uid; // 用户ID
    /**
     * 短信类型
     */
    private int type; // 短信类型
    /**
     * Code
     */
    private String code; // Code
    /**
     * 发送的地址
     */
    private String to; // 发送的地址
    /**
     * 发送内容
     */
    private String body; // 发送内容
    /**
     * 手机发送短信时间
     */
    private Date sendtime; // 手机发送短信时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }



}
