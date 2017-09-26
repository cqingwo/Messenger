/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//在线时间表
public class OnlineTimeInfo implements Serializable {

    /**
     * 用户id
     **/
    private int uid;
    /**
     * 总在线时间
     **/
    private int total;
    /**
     * 今年在线时间
     **/
    private int year;
    /**
     * 本月在线时间
     **/
    private int month;
    /**
     * 本周在线时间
     **/
    private int week;
    /**
     * 今天在线时间
     **/
    private int day;
    /**
     * 最后更新时间
     **/
    private Date updatetime;

    public OnlineTimeInfo(int uid, int total, int year, int month, int week, int day, Date updatetime) {
        this.uid = uid;
        this.total = total;
        this.year = year;
        this.month = month;
        this.week = week;
        this.day = day;
        this.updatetime = updatetime;
    }

    public OnlineTimeInfo() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "OnlinetimeInfo{" + "uid=" + uid + ", total=" + total + ", year=" + year + ", month=" + month + ", week=" + week + ", day=" + day + ", updatetime=" + updatetime + '}';
    }
}
