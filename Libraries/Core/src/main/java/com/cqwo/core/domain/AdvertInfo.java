/*
 * Copyright (C) 2017. 
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//广告表
public class AdvertInfo implements Serializable {

    /**
     * 广告id
     **/
    private int adid;
    /**
     * 点击数
     **/
    private int clickcount;
    /**
     * 广告位置id
     **/
    private int adposid;
    /**
     * 状态
     **/
    private int state;
    /**
     * 开始时间
     **/
    private Date starttime;
    /**
     * 结束时间
     **/
    private Date endtime;
    /**
     * 排序
     **/
    private int displayorder;
    /**
     * 标题
     **/
    private String title;
    /**
     * 图片
     **/
    private String image;
    /**
     * 链接地址
     **/
    private String url;
    /**
     * 扩展字段1
     **/
    private String extfield1;
    /**
     * 扩展字段2
     **/
    private String extfield2;
    /**
     * 扩展字段3
     **/
    private String extfield3;
    /**
     * 扩展字段4
     **/
    private String extfield4;
    /**
     * 扩展字段5
     **/
    private String extfield5;

    public AdvertInfo(int adid) {
        this.adid = adid;
    }

    public AdvertInfo(int adid, int clickcount, int adposid, int state, Date starttime, Date endtime, int displayorder, String title, String image, String url, String extfield1, String extfield2, String extfield3, String extfield4, String extfield5) {
        this.adid = adid;
        this.clickcount = clickcount;
        this.adposid = adposid;
        this.state = state;
        this.starttime = starttime;
        this.endtime = endtime;
        this.displayorder = displayorder;
        this.title = title;
        this.image = image;
        this.url = url;
        this.extfield1 = extfield1;
        this.extfield2 = extfield2;
        this.extfield3 = extfield3;
        this.extfield4 = extfield4;
        this.extfield5 = extfield5;
    }

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public int getClickcount() {
        return clickcount;
    }

    public void setClickcount(int clickcount) {
        this.clickcount = clickcount;
    }

    public int getAdposid() {
        return adposid;
    }

    public void setAdposid(int adposid) {
        this.adposid = adposid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExtfield1() {
        return extfield1;
    }

    public void setExtfield1(String extfield1) {
        this.extfield1 = extfield1;
    }

    public String getExtfield2() {
        return extfield2;
    }

    public void setExtfield2(String extfield2) {
        this.extfield2 = extfield2;
    }

    public String getExtfield3() {
        return extfield3;
    }

    public void setExtfield3(String extfield3) {
        this.extfield3 = extfield3;
    }

    public String getExtfield4() {
        return extfield4;
    }

    public void setExtfield4(String extfield4) {
        this.extfield4 = extfield4;
    }

    public String getExtfield5() {
        return extfield5;
    }

    public void setExtfield5(String extfield5) {
        this.extfield5 = extfield5;
    }

    @Override
    public String toString() {
        return "AdvertInfo{" + "adid=" + adid + ", clickcount=" + clickcount + ", adposid=" + adposid + ", state=" + state + ", starttime=" + starttime + ", endtime=" + endtime + ", displayorder=" + displayorder + ", title='" + title + '\'' + ", image='" + image + '\'' + ", url='" + url + '\'' + ", extfield1='" + extfield1 + '\'' + ", extfield2='" + extfield2 + '\'' + ", extfield3='" + extfield3 + '\'' + ", extfield4='" + extfield4 + '\'' + ", extfield5='" + extfield5 + '\'' + '}';
    }
}