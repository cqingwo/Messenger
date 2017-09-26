/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//友情链接表
public class FriendLinkInfo implements Serializable {

    /**
     * 自增id
     **/
    private int id;
    /**
     * 名称
     **/
    private String name;
    /**
     * 标题
     **/
    private String title;
    /**
     * logo
     **/
    private String logo;
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

    public FriendLinkInfo() {
    }

    public FriendLinkInfo(int id, String name, String title, String logo, String url, int target, int displayorder) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.logo = logo;
        this.url = url;
        this.target = target;
        this.displayorder = displayorder;
    }

    public FriendLinkInfo(String name, String title, String logo, String url, int target, int displayorder) {
        this.id = 0;
        this.name = name;
        this.title = title;
        this.logo = logo;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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
        return "FriendLinkInfo{" + "id=" + id + ", name='" + name + '\'' + ", title='" + title + '\'' + ", logo='" + logo + '\'' + ", url='" + url + '\'' + ", target=" + target + ", displayorder=" + displayorder + '}';
    }
}