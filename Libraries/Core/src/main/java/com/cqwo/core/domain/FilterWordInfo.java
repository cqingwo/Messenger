/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//筛选词表
public class FilterWordInfo implements Serializable {

    /**
     * 自增id
     **/
    private int id;
    /**
     * 匹配词
     **/
    private String match;
    /**
     * 替换词
     **/
    private String replace;

    public FilterWordInfo() {
    }

    public FilterWordInfo(int id, String match, String replace) {
        this.id = id;
        this.match = match;
        this.replace = replace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getReplace() {
        return replace;
    }

    public void setReplace(String replace) {
        this.replace = replace;
    }

    @Override
    public String toString() {
        return "FilterWordInfo{" + "id=" + id + ", match='" + match + '\'' + ", replace='" + replace + '\'' + '}';
    }
}