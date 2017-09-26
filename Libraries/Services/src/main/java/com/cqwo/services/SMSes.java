/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.config.info.SMSConfigInfo;
import com.cqwo.core.domain.SMSType;
import com.cqwo.core.sms.CWMSMS;
import com.cqwo.core.sms.ISMSStrategy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cqnews on 2017/4/11.
 */
@Service
public class SMSes{


    @Resource
    private CWMSMS cwmsms;

    @Resource(name = "SMSStrategy")
    private ISMSStrategy _ismsstrategy;

    private SMSConfigInfo _smsconfiginfo;

    private Lock lock = new ReentrantLock();

    public SMSes() {

    }

    /// <summary>
    /// 重置短信配置
    /// </summary>
    public void ResetSMS()
    {
        // 定义锁对象

        /**
        lock.lock();
            _smsconfiginfo = CWMConfig.;

        _ismsstrategy.Url = _smsconfiginfo.Url;
            _ismsstrategy.UserId = _smsconfiginfo.UserId;
            _ismsstrategy.Account = _smsconfiginfo.Account;
            _ismsstrategy.Password = _smsconfiginfo.Password;
            _ismsstrategy.Sign = _smsconfiginfo.Sign;
        lock.unlock();
         **/
    }

    /// <summary>
    /// 重置商城信息
    /// </summary>
    public void ResetMall()
    {
        lock.lock();
            //_mallconfiginfo = CWMConfig.MallConfig;
        lock.unlock();
    }

    /// <summary>
    /// 发送找回密码短信
    /// </summary>
    /// <param name="to">接收手机</param>
    /// <param name="code">验证值</param>
    /// <param name="uid">用户ID</param>
    /// <returns></returns>
    public boolean SendFindPwdMobile(String to, String code,int uid)
    {
        String body = _smsconfiginfo.getFindpwdbody();

        body.replace("{mallname}", _smsconfiginfo.getSign());
        body.replace("{code}", code);
        return _ismsstrategy.Send(uid, SMSType.FindPwd.value(), code, to, body.toString());
    }


    /// <summary>
    /// 安全中心发送验证手机短信
    /// </summary>
    /// <param name="to">接收手机</param>
    /// <param name="code">验证值</param>
    /// <param name="uid">用户ID</param>
    /// <returns></returns>
    public boolean SendSCVerifySMS(String to, String code, int uid)
    {
        String body = _smsconfiginfo.getScverifybody();
        body.replace("{mallname}", _smsconfiginfo.getSign());
        body.replace("{code}", code);
        return _ismsstrategy.Send(uid, SMSType.SCVerify.value(), code, to, body.toString());
    }

    /// <summary>
    /// 安全中心发送确认更新手机短信
    /// </summary>
    /// <param name="to">接收手机</param>
    /// <param name="code">验证值</param>
    /// <param name="uid">用户ID</param>
    /// <returns></returns>
    public boolean SendSCUpdateSMS(String to, String code, int uid)
    {
        String body = _smsconfiginfo.getScupdatebody();
        body.replace("{mallname}", _smsconfiginfo.getSign());
        body.replace("{code}", code);
        return _ismsstrategy.Send(uid, SMSType.SCUpdate.value(), code, to, body.toString());
    }

    /// <summary>
    /// 发送注册欢迎短信
    /// </summary>
    /// <param name="to">接收手机</param>
    /// <param name="uid">用户ID</param>
    /// <returns></returns>
    public boolean SendWebcomeSMS(String to,int uid)
    {
        String body = _smsconfiginfo.getWebcomebody();
        body.replace("{mallname}", _smsconfiginfo.getSign());
        body.replace("{regtime}", new Date().toString());
        body.replace("{mobile}", to);
        return _ismsstrategy.Send(uid, SMSType.Welcome.value(), "", to, body.toString());
    }



    /// <summary>
    /// 发送找回密码短信
    /// </summary>
    /// <param name="to">接收手机</param>
    /// <param name="code">验证值</param>
    /// <param name="uid">用户ID</param>
    /// <returns></returns>
    public boolean SendFindPwdBody(String to, String code, int uid)
    {
        String body = _smsconfiginfo.getFindpwdbody();
        body.replace("{mallname}", _smsconfiginfo.getSign());
        body.replace("{code}", code);
        return _ismsstrategy.Send(uid, (int)SMSType.FindPwd.value(), code, to, body.toString());
    }


    /// <summary>
    /// 基础发送
    /// </summary>
    /// <param name="to">手机</param>
    /// <param name="body">发送内容</param>
    /// <returns></returns>
    public boolean SendBaseSMS(String to, String body)
    {
        return _ismsstrategy.Send(to, body);
    }


}
