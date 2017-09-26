package com.cqwo.core.log;

/**
 * Created by cqnews on 2017/4/15.
 */
public interface ILogStrategy {

    /**
     * 写入日志
     * @param message 消息
     */
    void Write(String message);
}
