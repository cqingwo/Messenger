package com.cqwo.core.session;

import java.util.Map;

/**
 * Created by cqnews on 2017/4/10.
 */
public interface ISessionStrategy {


    /// <summary>
    /// 过期时间(单位为秒)
    /// </summary>
    int Timeout = 0;

    /**
     * 获取sessionId
     * @return
     */
    String GetSessionId();

    /**
     * 获得用户会话状态数据
     * @param sid sid
     * @return 类型
     */
    Map<String,Object> GetSession(String sid);


    /**
     * 获得用户会话状态数据的数据项的值
     * @param sid sid
     * @param key 键
     * @return 当前键值不存在时返回null
     */
    Object GetValue(String sid, String key);

    /**
     * 设置用户会话状态数据的数据项
     * @param sid sid
     * @param key 键
     * @param value 值
     */
    void SetItem(String sid, String key, Object value);

    /**
     * 移除用户会话状态数据的数据项
     * @param sid sid
     * @param key 键
     */
    void RemoveItem(String sid, String key);

}
