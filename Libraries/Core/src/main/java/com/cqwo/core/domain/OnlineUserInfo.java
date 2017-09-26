/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//在线用户表
public class OnlineUserInfo implements Serializable {

    /**
     * 在线id
     **/
    private int olid;
    /**
     * 用户id
     **/
    private int uid;
    /**
     * 用户sessionid
     **/
    private String sid;
    /**
     * 用户昵称
     **/
    private String nickname;
    /**
     * 用户ip
     **/
    private String ip;
    /**
     * 用户所在区域id
     **/
    private int regionid;
    /**
     * 最后更新时间
     **/
    private Date updatetime;

    public OnlineUserInfo(int olid, int uid, String sid, String nickname, String ip, int regionid, Date updatetime) {
        this.olid = olid;
        this.uid = uid;
        this.sid = sid;
        this.nickname = nickname;
        this.ip = ip;
        this.regionid = regionid;
        this.updatetime = updatetime;
    }

    public OnlineUserInfo() {
    }

    public int getOlid() {
        return olid;
    }

    public void setOlid(int olid) {
        this.olid = olid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "OnLineUserInfo{" + "olid=" + olid + ", uid=" + uid + ", sid='" + sid + '\'' + ", nickname='" + nickname + '\'' + ", ip='" + ip + '\'' + ", regionid=" + regionid + ", updatetime=" + updatetime + '}';
    }
}
