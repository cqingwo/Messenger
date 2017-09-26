package com.cqwo.data;

import com.cqwo.core.cache.CWMCache;
import com.cqwo.core.config.CWMConfig;
import com.cqwo.core.data.CWMData;
import com.cqwo.core.session.CWMSession;
import com.cqwo.core.sms.CWMSMS;

import javax.annotation.Resource;

/**
 * Created by cqnews on 2017/4/11.
 */
public class DataService {

    @Resource(name = "CWMCache")
    private CWMCache cwmCache;

    @Resource(name = "CWMData")
    private CWMData cwmData;

    @Resource(name = "CWMSession")
    private CWMSession cwmSession;

    @Resource(name = "CWMSMS")
    private CWMSMS cwmSMS;

    @Resource(name = "CWMConfig")
    private CWMConfig cwmConfig;


    public CWMCache getCwmCache() {
        return cwmCache;
    }

    public void setCwmCache(CWMCache cwmCache) {
        this.cwmCache = cwmCache;
    }

    public CWMData getCwmData() {
        return cwmData;
    }

    public void setCwmData(CWMData cwmData) {
        this.cwmData = cwmData;
    }

    public CWMSession getCwmSession() {
        return cwmSession;
    }

    public void setCwmSession(CWMSession cwmSession) {
        this.cwmSession = cwmSession;
    }

    public CWMSMS getCwmSMS() {
        return cwmSMS;
    }

    public void setCwmSMS(CWMSMS cwmSMS) {
        this.cwmSMS = cwmSMS;
    }

    public CWMConfig getCwmConfig() {
        return cwmConfig;
    }

    public void setCwmConfig(CWMConfig cwmConfig) {
        this.cwmConfig = cwmConfig;
    }
}
