package com.cqwo.core.sms;


import com.cqwo.core.domain.SMSInfo;

/**
 * Created by cqnews on 2017/3/20.
 */
public interface ISMSStrategy {

    /// <summary>
    /// 短信服务器地址
    /// </summary>
     String url = "http://sms.cqwo.com";

    /// <summary>
    /// 企业id
    /// </summary>
     int userid = 168;



    /// <summary>
    /// 短信账号
    /// </summary>
     String account = "test";

    /// <summary>
    /// 短信密码
    /// </summary>
     String password = "123456";


    /// <summary>
    /// 短信签名
    /// </summary>
     String sign = "青沃科技";

    /// <summary>
    /// 发送短信
    /// </summary>
    /// <param name="to">接收人号码</param>
    /// <param name="body">短信内容</param>
    /// <returns>是否发送成功</returns>
      Boolean Send(String to, String body);

    /// <summary>
    /// 发送短信
    /// </summary>
    /// <param name="uid">接收人的UID</param>
    /// <param name="type">发送短信的类型</param>
    /// <param name="code">发送短信的CODE</param>
    /// <param name="to">接收人号码</param>
    /// <param name="body">短信内容</param>
    /// <returns>是否发送成功</returns>
      Boolean Send(int uid, int type, String code, String to, String body);

    /// <summary>
    /// 创建短信
    /// </summary>
    /// <param name="smsInfo"></param>
    /// <returns></returns>
      int CreateSMS(SMSInfo smsInfo);


}
