/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//积分日志表
public class CreditLogInfo implements Serializable {

    /**
     * 日志id
     **/
    private int logid;
    /**
     * 用户id
     **/
    private int uid;
    /**
     * 支付积分
     **/
    private int paycredits;
    /**
     * 等级积分
     **/
    private int rankcredits;
    /**
     * 动作
     **/
    private int action;
    /**
     * 动作代码
     **/
    private int actioncode;
    /**
     * 动作时间
     **/
    private Date actiontime;
    /**
     * 动作描述
     **/
    private String actiondes;
    /**
     * 操作者id
     **/
    private int operator;

    public CreditLogInfo() {
    }

    public CreditLogInfo(int logid, int uid, int paycredits, int rankcredits, int action, int actioncode, Date actiontime, String actiondes, int operator) {
        this.logid = logid;
        this.uid = uid;
        this.paycredits = paycredits;
        this.rankcredits = rankcredits;
        this.action = action;
        this.actioncode = actioncode;
        this.actiontime = actiontime;
        this.actiondes = actiondes;
        this.operator = operator;
    }

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPaycredits() {
        return paycredits;
    }

    public void setPaycredits(int paycredits) {
        this.paycredits = paycredits;
    }

    public int getRankcredits() {
        return rankcredits;
    }

    public void setRankcredits(int rankcredits) {
        this.rankcredits = rankcredits;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getActioncode() {
        return actioncode;
    }

    public void setActioncode(int actioncode) {
        this.actioncode = actioncode;
    }

    public Date getActiontime() {
        return actiontime;
    }

    public void setActiontime(Date actiontime) {
        this.actiontime = actiontime;
    }

    public String getActiondes() {
        return actiondes;
    }

    public void setActiondes(String actiondes) {
        this.actiondes = actiondes;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "CreditLogInfo{" + "logid=" + logid + ", uid=" + uid + ", paycredits=" + paycredits + ", rankcredits=" + rankcredits + ", action=" + action + ", actioncode=" + actioncode + ", actiontime=" + actiontime + ", actiondes='" + actiondes + '\'' + ", operator=" + operator + '}';
    }


}