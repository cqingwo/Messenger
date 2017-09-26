/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.EventLogInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface EventLogDao {


    //region 事件日志表

    /**
     * 获得事件日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetEventLogCount(String condition) throws IOException;


    /**
     * 创建一条事件日志表数据
     *
     * @param eventlogInfo 事件日志表模型
     * @return 返回创建信息
     **/
    int CreateEventLog(EventLogInfo eventlogInfo) throws IOException;


    /**
     * 更新一条事件日志表数据
     *
     * @param eventlogInfo 事件日志表模型
     **/
    int UpdateEventLog(EventLogInfo eventlogInfo) throws IOException;


    /**
     * 删除一条事件日志表数据
     *
     * @param id 事件日志表模型
     **/
    void DeleteEventLogById(int id) throws IOException;

    /**
     * 批量删除一批事件日志表数据
     **/
    void DeleteEventLogByIdList(String idList) throws IOException;


    /**
     * 获得事件日志表一条记录
     *
     * @param id id
     * @return 返回一条EventLogInfo
     **/
    EventLogInfo GetEventLogById(int id) throws IOException;

    /**
     * 获得事件日志表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回EventLogInfo
     **/
    List<EventLogInfo> GetEventLogList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 事件日志表结束


}


