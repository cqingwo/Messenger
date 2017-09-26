package com.cqwo.strategy.sms;


import com.cqwo.core.config.CWMConfig;
import com.cqwo.core.config.info.SMSConfigInfo;
import com.cqwo.core.domain.SMSInfo;
import com.cqwo.core.helper.WebHelper;
import com.cqwo.core.sms.ISMSStrategy;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cqnews on 2017/3/23.
 */
public class SMSStrategy implements ISMSStrategy {



    private CWMConfig cwmConfig;


    private Lock lock = new ReentrantLock();


    public void setCwmConfig(CWMConfig cwmConfig) {
        this.cwmConfig = cwmConfig;
    }

    /**
     * 编码
     */
    private String encoding = "utf-8";

    @Override
    public Boolean Send(String to, String body) {

        lock.lock();
        SMSConfigInfo configInfo = cwmConfig.getIconfigstrategy().GetSMSConfig();
        try {
            String url = String.format("%s?action=send&userid=%d&account=%s&password=%s&mobile=%s&content=%s&sendTime=&extno=", configInfo.getUrl(), configInfo.getUserid(), configInfo.getAccount(), configInfo.getPassword(), to, URLEncoder.encode(body, encoding));
            //System.out.println(url);
            System.out.println(WebHelper.doGet(url));
        } catch (UnsupportedEncodingException e) {

            lock.unlock();
            return false;
        }
        lock.unlock();
        return true;

    }

    @Override
    public Boolean Send(int uid, int type, String code, String to, String body) {
        return Send(to,body);
    }

    @Override
    public int CreateSMS(SMSInfo smsInfo) {
        return 0;
    }
}

