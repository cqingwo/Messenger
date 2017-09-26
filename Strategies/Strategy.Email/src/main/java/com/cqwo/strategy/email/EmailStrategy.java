/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.email;

import com.cqwo.core.config.CWMConfig;
import com.cqwo.core.email.IEmailStrategy;
import com.cqwo.core.helper.MailHelper;

import javax.annotation.Resource;

/**
 * Created by cqnews on 2017/4/16.
 */
public class EmailStrategy implements IEmailStrategy {

    @Resource
    private CWMConfig cwmConfig;

    /**
     * 发送邮件
     *
     * @param to      接收邮件
     * @param subject 邮件标题
     * @param body    邮件内容
     * @return 是否发送成功
     */
    @Override
    public boolean Send(String to, String subject, String body) {
        MailHelper se = new MailHelper();
        try {

            se.doSendHtmlEmail(subject, body, to);

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 发送邮件
     *
     * @param to           接收邮件
     * @param subject      邮件标题
     * @param body         邮件内容
     * @param bodyEncoding 邮件内容编码
     * @param isBodyHtml   邮件内容是否html化
     * @return 是否发送成功
     */
    @Override
    public boolean Send(String to, String subject, String body, String bodyEncoding, boolean isBodyHtml) {

        MailHelper se = new MailHelper();
        try {

            se.doSendHtmlEmail(subject,body,to);

        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public void setCwmConfig(CWMConfig cwmConfig) {
        this.cwmConfig = cwmConfig;
    }
}
