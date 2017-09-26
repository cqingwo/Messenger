/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.log.ILogStrategy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cqnews on 2017/4/15.
 */
@Service
public class Logs {

    @Resource
    private ILogStrategy ilogstrategy;//日志策略

    /// <summary>
    /// 写入日志
    /// </summary>
    /// <param name="message">消息</param>
    public void Write(String message)
    {
        ilogstrategy.Write(message);
    }

    /// <summary>
    /// 写入日志
    /// </summary>
    /// <param name="ex">异常对象</param>
    public  void Write(Exception ex)
    {
        ilogstrategy.Write(String.format("方法:{0},异常信息:{1}", ex.getStackTrace(), ex.getMessage()));
    }

}
