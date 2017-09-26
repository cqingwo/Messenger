/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.LoginFailLogInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface LoginFailLogDao {


    //region 登陆失败日志表

    /**
     * 获得登陆失败日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetLoginFailLogCount(@Param("condition") String condition) throws IOException;


    /**
     * 创建一条登陆失败日志表数据
     *
     * @param loginfaillogInfo 登陆失败日志表模型
     * @return 返回创建信息
     **/
    void CreateLoginFailLog(LoginFailLogInfo loginfaillogInfo) throws IOException;


    /**
     * 更新一条登陆失败日志表数据
     *
     * @param loginfaillogInfo 登陆失败日志表模型
     **/
    void UpdateLoginFailLog(LoginFailLogInfo loginfaillogInfo) throws IOException;


    /**
     * 删除一条登陆失败日志表数据
     *
     * @param id 登陆失败日志表模型
     **/
    void DeleteLoginFailLogById(int id) throws IOException;

    /**
     * 批量删除一批登陆失败日志表数据
     **/
    void DeleteLoginFailLogByIdList(@Param("idList") String idList) throws IOException;


    /**
     * 获得登陆失败日志表一条记录
     *
     * @param id id
     * @return 返回一条LoginFailLogInfo
     **/
    LoginFailLogInfo GetLoginFailLogById(int id) throws IOException;

    /**
     * 获得登陆失败日志表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回LoginFailLogInfo
     **/
    List<LoginFailLogInfo> GetLoginFailLogList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 登陆失败日志表结束


}


