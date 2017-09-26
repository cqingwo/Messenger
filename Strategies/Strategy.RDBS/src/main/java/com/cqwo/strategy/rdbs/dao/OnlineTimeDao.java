/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.OnlineTimeInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface OnlineTimeDao {


    //region 在线时间表

    /**
     * 获得在线时间表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetOnlinetimeCount(String condition) throws IOException;


    /**
     * 创建一条在线时间表数据
     *
     * @param onlinetimeInfo 在线时间表模型
     * @return 返回创建信息
     **/
    int CreateOnlinetime(OnlineTimeInfo onlinetimeInfo) throws IOException;


    /**
     * 更新一条在线时间表数据
     *
     * @param onlinetimeInfo 在线时间表模型
     **/
    int UpdateOnlinetime(OnlineTimeInfo onlinetimeInfo) throws IOException;


    /**
     * 删除一条在线时间表数据
     *
     * @param uid 在线时间表模型
     **/
    void DeleteOnlinetimeByUid(int uid) throws IOException;

    /**
     * 批量删除一批在线时间表数据
     **/
    void DeleteOnlinetimeListByUid(String uidList) throws IOException;


    /**
     * 获得在线时间表一条记录
     *
     * @param uid uid
     * @return 返回一条OnlinetimeInfo
     **/
    OnlineTimeInfo GetOnlinetimeByUid(int uid) throws IOException;

    /**
     * 获得在线时间表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnlinetimeInfo
     **/
    List<OnlineTimeInfo> GetOnlinetimeList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 在线时间表结束


}



