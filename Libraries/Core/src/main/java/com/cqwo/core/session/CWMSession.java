package com.cqwo.core.session;

/**
 * Created by cqnews on 2017/4/10.
 */
public class CWMSession {

    private  ISessionStrategy iSessionStrategy;//Session策略

    public ISessionStrategy getiSessionStrategy() {
        return iSessionStrategy;
    }

    public void setiSessionStrategy(ISessionStrategy iSessionStrategy) {
        this.iSessionStrategy = iSessionStrategy;
    }
}
