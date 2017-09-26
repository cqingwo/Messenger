/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import org.springframework.stereotype.Service;

/**
 * Created by cqnews on 2017/4/15.
 */
@Service
public class Emails {
    /**
     * 发送邮件
     *
     * @param to      接收邮件
     * @param subject 邮件标题
     * @param body    邮件内容
     * @return 是否发送成功
     */
    public boolean Send(String to, String subject, String body) {
        return false;
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
    public boolean Send(String to, String subject, String body, String bodyEncoding, boolean isBodyHtml) {
        return false;
    }
}
