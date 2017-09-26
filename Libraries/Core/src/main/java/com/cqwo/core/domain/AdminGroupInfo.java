/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//商城管理组表
public class AdminGroupInfo implements Serializable {

    /**
     * 管理员组id
     **/
    private int agid;
    /**
     * 标题
     **/
    private String title;
    /**
     * 动作列表
     **/
    private String actionlist;

    public AdminGroupInfo() {
    }

    public AdminGroupInfo(String title, String actionlist) {
        this.title = title;
        this.actionlist = actionlist;
    }

    public AdminGroupInfo(int agid, String title, String actionlist) {
        this.agid = agid;
        this.title = title;
        this.actionlist = actionlist;
    }

    public int getAgid() {
        return agid;
    }

    public void setAgid(int agid) {
        this.agid = agid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActionlist() {
        return actionlist;
    }

    public void setActionlist(String actionlist) {
        this.actionlist = actionlist;
    }

    @Override
    public String toString() {
        return "AdminGroupInfo{" + "agid=" + agid + ", title='" + title + '\'' + ", actionlist='" + actionlist + '\'' + '}';
    }


}