package com.cqwo.core.log;

/**
 * Created by cqnews on 2017/4/15.
 */
public class CWMLog {

    private ILogStrategy iLogStrategy;


    public ILogStrategy getiLogStrategy() {
        return iLogStrategy;
    }

    public void setiLogStrategy(ILogStrategy iLogStrategy) {
        this.iLogStrategy = iLogStrategy;
    }
}
