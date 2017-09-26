package com.cqwo.core.data.rdbs;

import com.cqwo.core.data.rdbs.info.IBaseStrategy;
import com.cqwo.core.data.rdbs.info.IUserStrategy;

/**
 * Created by cqnews on 2017/4/10.
 */
public class RDBSStrategy {
    /**
     * 用户策略
     */
    private IUserStrategy iUserStrategy;

    public IBaseStrategy getiBaseStrategy() {
        return iBaseStrategy;
    }

    public void setiBaseStrategy(IBaseStrategy iBaseStrategy) {
        this.iBaseStrategy = iBaseStrategy;
    }

    private IBaseStrategy iBaseStrategy;


    public IUserStrategy getiUserStrategy() {
        return iUserStrategy;
    }

    public void setiUserStrategy(IUserStrategy iUserStrategy) {
        this.iUserStrategy = iUserStrategy;
    }
}
