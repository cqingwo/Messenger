/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.config.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by cqnews on 2017/4/7.
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
// XML文件中的根标识
@XmlRootElement(name = "RDBSConfigInfo")
public class RDBSConfigInfo  implements IConfigInfo {


    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String rdbstype = "sqlserver";
    private String url = "127.0.0.1";
    private String port ="1433";
    private String database = "cqingwo";
    private String username = "sa";
    private String password = "123456789";




    public RDBSConfigInfo() {
    }

    public RDBSConfigInfo(String driver, String rdbstype, String url, String port, String database, String username, String password) {
        this.driver = driver;
        this.rdbstype = rdbstype;
        this.url = url;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getRdbstype() {
        return rdbstype;
    }

    public void setRdbstype(String rdbstype) {
        this.rdbstype = rdbstype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RDBSConfigInfo{" + "driver='" + driver + '\'' + ", rdbstype='" + rdbstype + '\'' + ", url='" + url + '\'' + ", port='" + port + '\'' + ", database='" + database + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}
