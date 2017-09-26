/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//商城管理动作表
public class AdminActionInfo implements Serializable {

    /**
     * 动作id
     **/
    private int aid;
    /**
     * 动作标题
     **/
    private String title;
    /**
     * 动作代码
     **/
    private String action;
    /**
     * 父id
     **/
    private int parentid;
    /**
     * 排序
     **/
    private int displayorder;

    public AdminActionInfo() {
    }

    public AdminActionInfo(String title, String action, int parentid, int displayorder) {
        this.title = title;
        this.action = action;
        this.parentid = parentid;
        this.displayorder = displayorder;
    }

    public AdminActionInfo(int aid, String title, String action, int parentid, int displayorder) {
        this.aid = aid;
        this.title = title;
        this.action = action;
        this.parentid = parentid;
        this.displayorder = displayorder;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public String toString() {
        return "AdminActionInfo{" + "aid=" + aid + ", title='" + title + '\'' + ", action='" + action + '\'' + ", parentid=" + parentid + ", displayorder=" + displayorder + '}';
    }

}