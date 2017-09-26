/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.log;

import com.cqwo.core.log.ILogStrategy;

/**
 * Created by cqnews on 2017/4/15.
 */
public class LogStrategy implements ILogStrategy {
    /**
     * 写入日志
     *
     * @param message 消息
     */
    @Override
    public void Write(String message) {

        Log4jHelper.debug(message);

    }
}
