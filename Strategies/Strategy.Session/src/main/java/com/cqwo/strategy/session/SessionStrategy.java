package com.cqwo.strategy.session;

import com.cqwo.core.session.ISessionStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cqnews on 2017/4/10.
 */
public class SessionStrategy implements ISessionStrategy {

    @Autowired
    private HttpServletRequest request;

    /// <summary>
    /// 过期时间(单位为秒)
    /// </summary>
    private int timeout = 1200;

    /**
     * 获取sessionId
     *
     * @return
     */
    @Override
    public String GetSessionId() {
        return request.getSession().getId();
    }

    /**
     * 获得用户会话状态数据
     *
     * @param sid sid
     * @return 类型
     */
    @Override
    public Map<String, Object> GetSession(String sid) {

        Map<String,Object> map =  new HashMap<String, Object>();

        //获取session
        HttpSession session   =   request.getSession();   //获取session中所有的键值
        Enumeration enumeration   =   session.getAttributeNames();   //遍历enumeration中的

        while (enumeration.hasMoreElements()){
            //获取session键值
            String   name =   enumeration.nextElement().toString();   //根据键值取session中的值
            Object   value =  this.GetValue(sid,name);   //打印结果

            map.put(name,value);
        }
       return map;
    }


    @Override
    public Object GetValue(String sid, String key) {

        return request.getSession().getAttribute(key);
    }

    /**
     * 设置用户会话状态数据的数据项
     *
     * @param sid   sid
     * @param key   键
     * @param value 值
     */
    @Override
    public void SetItem(String sid, String key, Object value) {

        request.getSession().setAttribute(key,value);
    }

    /**
     * 移除用户会话状态数据的数据项
     *
     * @param sid sid
     * @param key 键
     */
    @Override
    public void RemoveItem(String sid, String key) {
        request.getSession().removeAttribute(key);
    }
}
