/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//帮助表
public class HelpInfo implements Serializable {

    /**
     * 帮助id
     **/
    private int id;
    /**
     * 父id
     **/
    private int pid;
    /**
     * 标题
     **/
    private String title;
    /**
     * 链接地址
     **/
    private String url;
    /**
     * 描述
     **/
    private String description;
    /**
     * 排序
     **/
    private int displayorder;

    public HelpInfo() {
    }

    public HelpInfo(int pid, String title, String url, String description, int displayorder) {
        this.pid = pid;
        this.title = title;
        this.url = url;
        this.description = description;
        this.displayorder = displayorder;
    }

    public HelpInfo(int id, int pid, String title, String url, String description, int displayorder) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.url = url;
        this.description = description;
        this.displayorder = displayorder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public String toString() {
        return "HelpInfo{" + "id=" + id + ", pid=" + pid + ", title='" + title + '\'' + ", url='" + url + '\'' + ", description='" + description + '\'' + ", displayorder=" + displayorder + '}';
    }

    
}