/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import javax.xml.crypto.Data;

/**
 * Created by 青沃科技 on 2017/4/21.
 */
public class Sutents {

    /**
     * 用户id
     **/
    private int uid;
    /**
     * 用户名称
     **/
    private String username;
    /**
     * 邮箱
     **/
    private String email;
    /**
     * 手机
     **/
    private String mobile;
    /**
     * 密码
     **/
    private String password;
    /**
     * 用户等级id
     **/
    private int userrid;
    /**
     * 店铺id
     **/
    private int storeid;
    /**
     * 商城管理员组id
     **/
    private int mallagid;
    /**
     * 昵称
     **/
    private String nickname;
    /**
     * 头像
     **/
    private String avatar;
    /**
     * 支付积分
     **/
    private int paycredits;
    /**
     * 等级积分
     **/
    private int rankcredits;
    /**
     * 是否验证邮箱
     **/
    private int verifyemail;
    /**
     * 是否验证手机
     **/
    private int verifymobile;
    /**
     * 解禁时间
     **/
    private Data liftbantime;
    /**
     * 盐值
     **/
    private String salt;

    public Sutents(int uid, String username, String email, String mobile, String password, int userrid, int storeid, int mallagid, String nickname, String avatar, int paycredits, int rankcredits, int verifyemail, int verifymobile, Data liftbantime, String salt) {
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

    public Sutents() {
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

    public Data getLiftbantime() {
        return liftbantime;
    }

    public void setLiftbantime(Data liftbantime) {
        this.liftbantime = liftbantime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", userrid=" + userrid +
                ", storeid=" + storeid +
                ", mallagid=" + mallagid +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", paycredits=" + paycredits +
                ", rankcredits=" + rankcredits +
                ", verifyemail=" + verifyemail +
                ", verifymobile=" + verifymobile +
                ", liftbantime=" + liftbantime +
                ", salt='" + salt + '\'' +
                '}';
    }
}
