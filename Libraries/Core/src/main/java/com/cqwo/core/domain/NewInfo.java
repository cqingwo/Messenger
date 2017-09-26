/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//新闻表
public class NewInfo implements Serializable {

    /**
     * 新闻id
     **/
    private int newsid;
    /**
     * 新闻类型id
     **/
    private int newstypeid;
    /**
     * 是否展示
     **/
    private int isshow;
    /**
     * 是否置顶
     **/
    private int istop;
    /**
     * 是否置首
     **/
    private int ishome;
    /**
     * 排序
     **/
    private int displayorder;
    /**
     * 添加时间
     **/
    private Date addtime;
    /**
     * 标题
     **/
    private String title;
    /**
     * 链接地址
     **/
    private String url;
    /**
     * 新闻内容
     **/
    private String body;

    public NewInfo(int newsid, int newstypeid, int isshow, int istop, int ishome, int displayorder, Date addtime, String title, String url, String body) {
        this.newsid = newsid;
        this.newstypeid = newstypeid;
        this.isshow = isshow;
        this.istop = istop;
        this.ishome = ishome;
        this.displayorder = displayorder;
        this.addtime = addtime;
        this.title = title;
        this.url = url;
        this.body = body;
    }

    public NewInfo() {
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public int getNewstypeid() {
        return newstypeid;
    }

    public void setNewstypeid(int newstypeid) {
        this.newstypeid = newstypeid;
    }

    public int getIsshow() {
        return isshow;
    }

    public void setIsshow(int isshow) {
        this.isshow = isshow;
    }

    public int getIstop() {
        return istop;
    }

    public void setIstop(int istop) {
        this.istop = istop;
    }

    public int getIshome() {
        return ishome;
    }

    public void setIshome(int ishome) {
        this.ishome = ishome;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "NewInfo{" +
                "newsid=" + newsid +
                ", newstypeid=" + newstypeid +
                ", isshow=" + isshow +
                ", istop=" + istop +
                ", ishome=" + ishome +
                ", displayorder=" + displayorder +
                ", addtime=" + addtime +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
