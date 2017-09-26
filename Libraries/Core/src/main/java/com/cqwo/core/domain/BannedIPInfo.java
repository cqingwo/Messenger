/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//禁止ip表
public class BannedIPInfo implements Serializable {

    /**
     * 自增id
     **/
    private int id;
    /**
     * ip地址
     **/
    private String ip;
    /**
     * 解禁时间
     **/
    private Date liftbantime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLiftbantime() {
        return liftbantime;
    }

    public void setLiftbantime(Date liftbantime) {
        this.liftbantime = liftbantime;
    }

    public BannedIPInfo() {
    }

    public BannedIPInfo(int id, String ip, Date liftbantime) {
        this.id = id;
        this.ip = ip;
        this.liftbantime = liftbantime;
    }


    @Override
    public String toString() {
        return "BannedIPInfo{" + "id=" + id + ", ip='" + ip + '\'' + ", liftbantime=" + liftbantime + '}';
    }
}