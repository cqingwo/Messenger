/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.OnlineUserInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface OnlineUserDao {


    //region 在线用户表

    /**
     * 获得在线用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetOnlineuserCount(String condition) throws IOException;


    /**
     * 创建一条在线用户表数据
     *
     * @param onlineuserInfo 在线用户表模型
     * @return 返回创建信息
     **/
    int CreateOnlineuser(OnlineUserInfo onlineuserInfo) throws IOException;


    /**
     * 更新一条在线用户表数据
     *
     * @param onlineuserInfo 在线用户表模型
     **/
    int UpdateOnlineuser(OnlineUserInfo onlineuserInfo) throws IOException;


    /**
     * 删除一条在线用户表数据
     *
     * @param olid 在线用户表模型
     **/
    void DeleteOnlineuserByOlId(int olid) throws IOException;

    /**
     * 批量删除一批在线用户表数据
     **/
    void DeleteOnlineuserListByOlId(String olidList) throws IOException;


    /**
     * 获得在线用户表一条记录
     *
     * @param olid olid
     * @return 返回一条OnlineuserInfo
     **/
    OnlineUserInfo GetOnlineuserByOlId(int olid) throws IOException;

    /**
     * 获得在线用户表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnlineuserInfo
     **/
    List<OnlineUserInfo> GetOnlineuserList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 在线用户表结束


}



