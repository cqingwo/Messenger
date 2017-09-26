package com.cqwo.core.cache;

/**
 * Created by cqnews on 2017/4/10.
 */
public class CWMCache {

    private ICacheStrategy icachestrategy;//短信策略

    public ICacheStrategy getIcachestrategy() {
        return icachestrategy;
    }

    public void setIcachestrategy(ICacheStrategy icachestrategy) {
        this.icachestrategy = icachestrategy;
    }

}
