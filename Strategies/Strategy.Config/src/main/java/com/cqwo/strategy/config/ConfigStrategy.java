package com.cqwo.strategy.config;

import com.cqwo.core.config.IConfigStrategy;
import com.cqwo.core.config.info.*;
import com.cqwo.core.helper.IOHelper;
import com.cqwo.core.helper.MapHelper;
import com.cqwo.core.helper.PropertiesHelper;
import com.cqwo.core.helper.XMLHelper;

import java.io.File;
import java.util.Map;

/**
 * Created by cqnews on 2017/4/13.
 */
public class ConfigStrategy implements IConfigStrategy {


    //region 私有字段

    private final String rdbsconfigfilepath = "/config/RDBSConfig.xml";//关系数据库配置信息文件路径
    private final String rdbpropertiesfilepath = "/config/RDBSConfig.properties";//关系数据库配置信息文件路径
    private final String baseconfigfilepath = "/config/BaseConfig.xml";//商城基本配置信息文件路径
    private final String emailconfigfilepath = "/config/EmailConfig.xml";//邮件配置信息文件路径
    private final String smsconfigfilepath = "/config/SMSConfig.xml";//短信配置信息文件路径
    private final String redisnosqlconfigfilepath = "/config/RedisNoSql.xml";//redis非关系型数据库配置信息文件路径

    //endregion

    //region 帮助方法

    /// <summary>
    /// 从文件中加载配置信息
    /// </summary>
    /// <param name="configInfoType">配置信息类型</param>
    /// <param name="configInfoFile">配置信息文件路径</param>
    /// <returns>配置信息</returns>
    private Object LoadConfigInfo(Class configInfoType, String configInfoFile) {
        File file = new File(IOHelper.GetMapPath(configInfoFile));

        System.out.println(file);
            //return (IConfigInfo) XmlHelper.DeserializeFromXML(file);
        return XMLHelper.convertXmlFileToObject(configInfoType,file.toString());

    }


    /**
     * 将配置信息保存到文件中
     *
     * @param configInfo     配置信息
     * @param configInfoFile 保存路径
     * @return 是否保存成功
     */
    private boolean SaveConfigInfo(IConfigInfo configInfo, String configInfoFile) {

        File file = new File(IOHelper.GetMapPath(configInfoFile));

        try {
            XMLHelper.convertToXml(configInfo, file.toString());
            //XmlHelper.SerializeToXml(configInfo, file);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //endregion

    /**
     * 保存关系型数据库
     *
     * @param configInfo 关系型数据库
     * @return
     */
    @Override
    public boolean SaveRDBSConfig(RDBSConfigInfo configInfo) {


        Map<String,String> map = MapHelper.ObjectToMap(configInfo);
        PropertiesHelper.setProperty(IOHelper.GetMapPath(),rdbpropertiesfilepath,map);
        return SaveConfigInfo(configInfo, rdbsconfigfilepath);
    }

    /**
     * 获得关系数据库配置
     *
     * @return 关系数据库配置
     */
    @Override
    public RDBSConfigInfo GetRDBSConfig() {
        return (RDBSConfigInfo) LoadConfigInfo(RDBSConfigInfo.class, rdbsconfigfilepath);
    }

    /**
     * 保存项目基本配置
     *
     * @param configInfo 项目基本配置
     * @return 是否保存成功
     */
    @Override
    public boolean SaveBaseConfig(BaseConfigInfo configInfo) {
        return SaveConfigInfo(configInfo, baseconfigfilepath);
    }

    /**
     * 获得项目基本配置
     *
     * @return 项目基本配置
     */
    @Override
    public BaseConfigInfo GetBaseConfig() {
        return (BaseConfigInfo) LoadConfigInfo(BaseConfigInfo.class, baseconfigfilepath);
    }

    /**
     * 保存邮件配置
     *
     * @param configInfo 邮件配置信息
     * @return 是否保存成功
     */
    @Override
    public boolean SaveEmailConfig(EmailConfigInfo configInfo) {
        return SaveConfigInfo(configInfo, emailconfigfilepath);
    }

    /**
     * 获得邮件配置
     *
     * @return 邮件配置
     */
    @Override
    public EmailConfigInfo GetEmailConfig() {
        return (EmailConfigInfo) LoadConfigInfo(EmailConfigInfo.class, emailconfigfilepath);
    }

    /**
     * 保存短信配置
     *
     * @param configInfo 短信配置信息
     * @return 是否保存成功
     */
    @Override
    public boolean SaveSMSConfig(SMSConfigInfo configInfo) {
        return SaveConfigInfo(configInfo, smsconfigfilepath);
    }

    /**
     * 获得短信配置
     *
     * @return 短信配置
     */
    @Override
    public SMSConfigInfo GetSMSConfig() {
        return (SMSConfigInfo) LoadConfigInfo(SMSConfigInfo.class, smsconfigfilepath);
    }
}
