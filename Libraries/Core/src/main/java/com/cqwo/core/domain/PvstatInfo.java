/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//pv统计表
public class PvstatInfo implements Serializable {

    /**
     * 记录id
     **/
    private int recordid;
    /**
     * 店铺id
     **/
    private int storeid;
    /**
     * 分类
     **/
    private String category;
    /**
     * 分类值
     **/
    private String value;
    /**
     * 数量
     **/
    private int count;

    public PvstatInfo(int recordid, int storeid, String category, String value, int count) {
        this.recordid = recordid;
        this.storeid = storeid;
        this.category = category;
        this.value = value;
        this.count = count;
    }

    public PvstatInfo() {
    }

    public int getRecordid() {
        return recordid;
    }

    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    public int getStoreid() {
        return storeid;
    }

    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "PvstatInfo{" +
                "recordid=" + recordid +
                ", storeid=" + storeid +
                ", category='" + category + '\'' +
                ", value='" + value + '\'' +
                ", count=" + count +
                '}';
    }
}
