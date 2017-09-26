/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by cqnews on 2017/4/14.
 */
public class PartUserInfo implements Serializable {
    /**
     * 用户id
     */
    private int uid;

    private String username;//用户名称

    private String email;//邮箱

    private String mobile;//手机

    private String password;//密码

    private int userrid;//用户等级id

    private int storeid;//店铺id

    private int mallagid;//商城管理员组id

    private String nickname;//昵称

    private String avatar;//头像

    private int paycredits;//支付积分

    private int rankcredits;//等级积分

    private int verifyemail;//是否验证邮箱

    private int verifymobile;//是否验证手机

    private Date liftbantime = new Date(1987,12,26);//解禁时间

    private String salt;//盐值

    public PartUserInfo() {
    }

    public PartUserInfo(String mobile, String passowrd) {
        this.mobile = mobile;
        this.password = passowrd;
    }

    public PartUserInfo(int uid, String username, String email, String mobile, String password, int userrid, int storeid, int mallagid, String nickname, String avatar, int paycredits, int rankcredits, int verifyemail, int verifymobile, Date liftbantime, String salt) {
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.userrid = userrid;
        this.storeid = storeid;
        this.mallagid = mallagid;
        this.nickname = nickname;
        this.avatar = avatar;
        this.paycredits = paycredits;
        this.rankcredits = rankcredits;
        this.verifyemail = verifyemail;
        this.verifymobile = verifymobile;
        this.liftbantime = liftbantime;
        this.salt = salt;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserrid() {
        return userrid;
    }

    public void setUserrid(int userrid) {
        this.userrid = userrid;
    }

    public int getStoreid() {
        return storeid;
    }

    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }

    public int getMallagid() {
        return mallagid;
    }

    public void setMallagid(int mallagid) {
        this.mallagid = mallagid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public int getVerifyemail() {
        return verifyemail;
    }

    public void setVerifyemail(int verifyemail) {
        this.verifyemail = verifyemail;
    }

    public int getVerifymobile() {
        return verifymobile;
    }

    public void setVerifymobile(int verifymobile) {
        this.verifymobile = verifymobile;
    }

    public Date getLiftbantime() {
        return liftbantime;
    }

    public void setLiftbantime(Date liftbantime) {
        this.liftbantime = liftbantime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "UserInfo{" + "uid=" + uid + ", username='" + username + '\'' + ", email='" + email + '\'' + ", mobile='" + mobile + '\'' + ", password='" + password + '\'' + ", userrid=" + userrid + ", storeid=" + storeid + ", mallagid=" + mallagid + ", nickname='" + nickname + '\'' + ", avatar='" + avatar + '\'' + ", paycredits=" + paycredits + ", rankcredits=" + rankcredits + ", verifyemail=" + verifyemail + ", verifymobile=" + verifymobile + ", liftbantime=" + liftbantime + ", salt='" + salt + '\'' + '}';
    }
}
