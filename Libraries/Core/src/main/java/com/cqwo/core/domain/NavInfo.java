/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//导航表
public class NavInfo implements Serializable {

    /**
     * 导航id
     **/
    private int id;
    /**
     * 父id
     **/
    private int pid;
    /**
     * 级别
     **/
    private int layer;
    /**
     * 名称
     **/
    private String name;
    /**
     * 标题
     **/
    private String title;
    /**
     * 链接地址
     **/
    private String url;
    /**
     * 链接打开目标
     **/
    private int target;
    /**
     * 排序
     **/
    private int displayorder;

    public NavInfo() {
    }

    public NavInfo(int id, int pid, int layer, String name, String title, String url, int target, int displayorder) {
        this.id = id;
        this.pid = pid;
        this.layer = layer;
        this.name = name;
        this.title = title;
        this.url = url;
        this.target = target;
        this.displayorder = displayorder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        int pid = this.pid;
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public String toString() {
        return "NavInfo{" + "id=" + id + ", pid=" + pid + ", layer=" + layer + ", name='" + name + '\'' + ", title='" + title + '\'' + ", url='" + url + '\'' + ", target=" + target + ", displayorder=" + displayorder + '}';
    }
}
