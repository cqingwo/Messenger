/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//新闻类型表
public class NewTypeInfo implements Serializable {

    /**
     * 新闻类型id
     **/
    private int newtypeid;
    /**
     * 名称
     **/
    private String name;
    /**
     * 排序
     **/
    private int displayorder;

    public NewTypeInfo(int newtypeid, String name, int displayorder) {
        this.newtypeid = newtypeid;
        this.name = name;
        this.displayorder = displayorder;
    }

    public NewTypeInfo() {
    }

    public int getNewtypeid() {
        return newtypeid;
    }

    public void setNewtypeid(int newtypeid) {
        this.newtypeid = newtypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public String toString() {
        return "NewtypeInfo{" +
                "newtypeid=" + newtypeid +
                ", name='" + name + '\'' +
                ", displayorder=" + displayorder +
                '}';
    }
}
