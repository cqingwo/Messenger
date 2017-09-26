package com.cqwo.core.config;

/**
 * Created by cqnews on 2017/3/24.
 */
public class CWMConfig {


    /**
     * 配置策略
     */
    private IConfigStrategy iconfigstrategy;//配置策略


    public CWMConfig() {

    }

    public IConfigStrategy getIconfigstrategy() {
        return iconfigstrategy;
    }

    public void setIconfigstrategy(IConfigStrategy iconfigstrategy) {
        this.iconfigstrategy = iconfigstrategy;
    }
}
