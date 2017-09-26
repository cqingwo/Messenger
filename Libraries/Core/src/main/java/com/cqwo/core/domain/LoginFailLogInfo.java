/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//登陆失败日志表
public class LoginFailLogInfo implements Serializable {

    /**
     * 日志id
     **/
    private int id;
    /**
     * 登陆ip
     **/
    private long loginip;
    /**
     * 失败次数
     **/
    private int failtimes;
    /**
     * 最后登陆时间
     **/
    private Date lastlogintime;

    public LoginFailLogInfo() {
    }

    public LoginFailLogInfo(long loginip, int failtimes, Date lastlogintime) {
        this.loginip = loginip;
        this.failtimes = failtimes;
        this.lastlogintime = lastlogintime;
    }

    public LoginFailLogInfo(int id, long loginip, int failtimes, Date lastlogintime) {
        this.id = id;
        this.loginip = loginip;
        this.failtimes = failtimes;
        this.lastlogintime = lastlogintime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getLoginip() {
        return loginip;
    }

    public void setLoginip(long loginip) {
        this.loginip = loginip;
    }

    public int getFailtimes() {
        return failtimes;
    }

    public void setFailtimes(int failtimes) {
        this.failtimes = failtimes;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Override
    public String toString() {
        return "LoginFailLogInfo{" + "id=" + id + ", loginip=" + loginip + ", failtimes=" + failtimes + ", lastlogintime=" + lastlogintime + '}';
    }


}