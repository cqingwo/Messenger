/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//广告位置表
public class AdvertPositionInfo implements Serializable {

    /**
     * 广告位置id
     **/
    private int adposid;
    /**
     * 排序
     **/
    private int displayorder;
    /**
     * 广告位置标题
     **/
    private String title;
    /**
     * 广告位置描述
     **/
    private String description;


    public AdvertPositionInfo() {
    }

    public AdvertPositionInfo(int adposid, int displayorder, String title, String description) {
        this.adposid = adposid;
        this.displayorder = displayorder;
        this.title = title;
        this.description = description;
    }

    public int getAdposid() {
        return adposid;
    }

    public void setAdposid(int adposid) {
        this.adposid = adposid;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AdvertPositionInfo{" + "adposid=" + adposid + ", displayorder=" + displayorder + ", title='" + title + '\'' + ", description='" + description + '\'' + '}';
    }


}