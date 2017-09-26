/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//商城管理日志表
public class AdminLogInfo implements Serializable {

    /**
     * 日志id
     **/
    private int logid;
    /**
     * 用户id
     **/
    private int uid;
    /**
     * 用户昵称
     **/
    private String nickname;
    /**
     * 管理员组id
     **/
    private int mallagid;
    /**
     * 管理员组标题
     **/
    private String mallagtitle;
    /**
     * 操作
     **/
    private String operation;
    /**
     * 描述
     **/
    private String description;
    /**
     * 操作ip
     **/
    private String ip;
    /**
     * 操作时间
     **/
    private Date operatetime;

    public AdminLogInfo() {
    }

    public AdminLogInfo(int uid, String nickname, int mallagid, String mallagtitle, String operation, String description, String ip, Date operatetime) {
        this.uid = uid;
        this.nickname = nickname;
        this.mallagid = mallagid;
        this.mallagtitle = mallagtitle;
        this.operation = operation;
        this.description = description;
        this.ip = ip;
        this.operatetime = operatetime;
    }

    public AdminLogInfo(int logid, int uid, String nickname, int mallagid, String mallagtitle, String operation, String description, String ip, Date operatetime) {
        this.logid = logid;
        this.uid = uid;
        this.nickname = nickname;
        this.mallagid = mallagid;
        this.mallagtitle = mallagtitle;
        this.operation = operation;
        this.description = description;
        this.ip = ip;
        this.operatetime = operatetime;
    }

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMallagid() {
        return mallagid;
    }

    public void setMallagid(int mallagid) {
        this.mallagid = mallagid;
    }

    public String getMallagtitle() {
        return mallagtitle;
    }

    public void setMallagtitle(String mallagtitle) {
        this.mallagtitle = mallagtitle;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    @Override
    public String toString() {
        return "AdminLogInfo{" + "logid=" + logid + ", uid=" + uid + ", nickname='" + nickname + '\'' + ", mallagid=" + mallagid + ", mallagtitle='" + mallagtitle + '\'' + ", operation='" + operation + '\'' + ", description='" + description + '\'' + ", ip='" + ip + '\'' + ", operatetime=" + operatetime + '}';
    }


}