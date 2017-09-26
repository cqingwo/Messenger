/*
 * Copyright (C) 2017. 
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//事件日志表
public class EventLogInfo implements Serializable {

    /**
     * 自增id
     **/
    private int id;
    /**
     * 键值
     **/
    private String key;
    /**
     * 标题
     **/
    private String title;
    /**
     * 服务器
     **/
    private String server;
    /**
     * 执行时间
     **/
    private Date executetime;

    public EventLogInfo() {
    }

    public EventLogInfo(int id, String key, String title, String server, Date executetime) {
        this.id = id;
        this.key = key;
        this.title = title;
        this.server = server;
        this.executetime = executetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Date getExecutetime() {
        return executetime;
    }

    public void setExecutetime(Date executetime) {
        this.executetime = executetime;
    }

    @Override
    public String toString() {
        return "EventLogInfo{" + "id=" + id + ", key='" + key + '\'' + ", title='" + title + '\'' + ", server='" + server + '\'' + ", executetime=" + executetime + '}';
    }
    
}