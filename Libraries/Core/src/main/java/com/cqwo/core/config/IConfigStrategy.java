package com.cqwo.core.config;

import com.cqwo.core.config.info.BaseConfigInfo;
import com.cqwo.core.config.info.EmailConfigInfo;
import com.cqwo.core.config.info.RDBSConfigInfo;
import com.cqwo.core.config.info.SMSConfigInfo;


/**
 * 配置策略接口
 * Created by cqnews on 2017/3/24.
 */
public interface IConfigStrategy {


    /**
     * 保存关系型数据库
     * @param configInfo 关系型数据库
     * @return
     */
    boolean SaveRDBSConfig(RDBSConfigInfo configInfo);

     /**
     *获得关系数据库配置
     * @return 关系数据库配置
     */
     RDBSConfigInfo GetRDBSConfig();

     /**
     *保存项目基本配置
     * @param configInfo 项目基本配置
     * @return 是否保存成功
     */
    boolean SaveBaseConfig(BaseConfigInfo configInfo);

    /**
     * 获得项目基本配置
     * @return 项目基本配置
     */
    BaseConfigInfo GetBaseConfig();

    /**
     * 保存邮件配置
     * @param configInfo 邮件配置信息
     * @return 是否保存成功
     */
    boolean SaveEmailConfig(EmailConfigInfo configInfo);

    /**
     * 获得邮件配置
     * @return  邮件配置
     */
    EmailConfigInfo GetEmailConfig();

    /**
     * 保存短信配置
     * @param configInfo 短信配置信息
     * @return 是否保存成功
     */
    boolean SaveSMSConfig(SMSConfigInfo configInfo);

    /**
     * 获得短信配置
     * @return 短信配置
     */
    SMSConfigInfo GetSMSConfig();

}
