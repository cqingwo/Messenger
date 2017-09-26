/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.email;

/**
 * Created by cqnews on 2017/4/16.
 */
public class CWMEmail {

    /**
     * 邮件策略
     */
    private IEmailStrategy iEmailStrategy;

    public IEmailStrategy getiEmailStrategy() {
        return iEmailStrategy;
    }

    public void setiEmailStrategy(IEmailStrategy iEmailStrategy) {
        this.iEmailStrategy = iEmailStrategy;
    }


}
