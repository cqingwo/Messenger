/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.CreditLogInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface CreditLogDao {


    //region 积分日志表

    /**
     * 获得积分日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetCreditLogCount(String condition) throws IOException;


    /**
     * 创建一条积分日志表数据
     *
     * @param creditlogInfo 积分日志表模型
     * @return 返回创建信息
     **/
    int CreateCreditLog(CreditLogInfo creditlogInfo) throws IOException;


    /**
     * 更新一条积分日志表数据
     *
     * @param creditlogInfo 积分日志表模型
     **/
    int UpdateCreditLog(CreditLogInfo creditlogInfo) throws IOException;


    /**
     * 删除一条积分日志表数据
     *
     * @param logid 积分日志表模型
     **/
    void DeleteCreditLogByLogId(int logid) throws IOException;

    /**
     * 批量删除一批积分日志表数据
     **/
    void DeleteCreditLogByLogIdList(String logidList) throws IOException;


    /**
     * 获得积分日志表一条记录
     *
     * @param logid logid
     * @return 返回一条CreditLogInfo
     **/
    CreditLogInfo GetCreditLogByLogId(int logid) throws IOException;

    /**
     * 获得积分日志表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回CreditLogInfo
     **/
    List<CreditLogInfo> GetCreditLogList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 积分日志表结束


}


