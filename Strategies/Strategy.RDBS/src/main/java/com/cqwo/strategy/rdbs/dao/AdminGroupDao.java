/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.AdminGroupInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface AdminGroupDao {


    //region 商城管理组表

    /**
     * 获得商城管理组表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdminGroupCount(@Param("condition") String condition) throws IOException;


    /**
     * 创建一条商城管理组表数据
     *
     * @param admingroupInfo 商城管理组表模型
     * @return 返回创建信息
     **/
    void CreateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException;


    /**
     * 更新一条商城管理组表数据
     *
     * @param admingroupInfo 商城管理组表模型
     **/
    void UpdateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException;


    /**
     * 删除一条商城管理组表数据
     *
     * @param agid 商城管理组表模型
     **/
    void DeleteAdminGroupByAGId(int agid) throws IOException;

    /**
     * 批量删除一批商城管理组表数据
     **/
    void DeleteAdminGroupByAGIdList(@Param("agidList") String agidList) throws IOException;


    /**
     * 获得商城管理组表一条记录
     *
     * @param agid agid
     * @return 返回一条AdminGroupInfo
     **/
    AdminGroupInfo GetAdminGroupByAGId(int agid) throws IOException;

    /**
     * 获得商城管理组表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminGroupInfo
     **/
    List<AdminGroupInfo> GetAdminGroupList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 商城管理组表结束


}


