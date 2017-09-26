package com.cqwo.core.domain;

import java.io.Serializable;
import java.util.Date;

//用户表
public class Users2Info implements Serializable {

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
    private Date liftbantime;
    /**
     * 盐值
     **/
    private String salt;
}