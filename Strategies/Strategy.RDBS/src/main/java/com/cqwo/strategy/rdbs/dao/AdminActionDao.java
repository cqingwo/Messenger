/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.AdminActionInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface AdminActionDao {


    //region 商城管理动作表

    /**
     * 获得商城管理动作表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdminActionCount(@Param("condition") String condition) throws IOException;


    /**
     * 创建一条商城管理动作表数据
     *
     * @param adminactionInfo 商城管理动作表模型
     * @return 返回创建信息
     **/
    void CreateAdminAction(AdminActionInfo adminactionInfo) throws IOException;


    /**
     * 更新一条商城管理动作表数据
     *
     * @param adminactionInfo 商城管理动作表模型
     **/
    void UpdateAdminAction(AdminActionInfo adminactionInfo) throws IOException;


    /**
     * 删除一条商城管理动作表数据
     *
     * @param aid 商城管理动作表模型
     **/
    void DeleteAdminActionByAid(int aid) throws IOException;

    /**
     * 批量删除一批商城管理动作表数据
     **/
    void DeleteAdminActionByAidList(@Param("aidList") String aidList) throws IOException;


    /**
     * 获得商城管理动作表一条记录
     *
     * @param aid aid
     * @return 返回一条AdminActionInfo
     **/
    AdminActionInfo GetAdminActionByAid(int aid) throws IOException;

    /**
     * 获得商城管理动作表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminActionInfo
     **/
    List<AdminActionInfo> GetAdminActionList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 商城管理动作表结束


}


