/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.helper.TypeHelper;
import com.cqwo.core.session.ISessionStrategy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by cqnews on 2017/4/15.
 */
@Service
public class Sessions {


    @Resource
    private ISessionStrategy _isessionstrategy;//会话状态策略



    /* <summary>
    /* 生成sessionid
    /* </summary>
    /* <returns></returns>
     */
    public String GenerateSid()
    {
        return _isessionstrategy.GetSessionId();
    }


    /* <summary>
    /* 获得用户会话状态数据
    /* </summary>
    /* <param name="sid">sid</param>
    /* <returns>Dictionary<String,object>类型</returns>
     */
    public Map<String, Object> GetSession(String sid)
    {
        return _isessionstrategy.GetSession(sid);
    }

    /**
     * 获得用户会话状态数据的数据项的值
     * @param sid sid
     * @param key 键
     * @return 当前键值不存在时返回null
     */
    public Object GetValue(String sid, String key)
    {
        if (!"".equals(key))
            return _isessionstrategy.GetValue(sid, key);
        else
            return null;
    }

    /**
     * 获得用户会话状态数据的数据项的值
     * @param sid sid
     * @param key 键
     * @return
     */
    public  int GetValueInt(String sid, String key)
    {
        return TypeHelper.ObjectToInt(GetValue(sid, key));
    }


    /**
     * 获得用户会话状态数据的数据项的值
     * @param sid sid
     * @param key 键
     * @return
     */
    public  String GetValueString(String sid, String key)
    {
        Object value = GetValue(sid, key);
        if (value != null)
            return value.toString();
        else
            return "";
    }

    /**
     * 设置用户会话状态数据的数据项
     * @param sid sid
     * @param key  键
     * @param value 值
     */
    public void SetItem(String sid, String key, Object value)
    {
        if (!"".equals(key))
            _isessionstrategy.SetItem(sid, key, value);
    }

    /**
     *移除用户会话状态数据的数据项
     * @param sid
     * @param key
     */
    public void RemoveItem(String sid, String key)
    {
        if (!"".equals(key))
            _isessionstrategy.RemoveItem(sid, key);
    }

}
