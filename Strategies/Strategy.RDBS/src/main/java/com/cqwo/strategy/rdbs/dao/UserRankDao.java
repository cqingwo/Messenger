/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.UserRankInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface UserRankDao {


    //region 用户等级表

    /**
     * 获得用户等级表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetUserrankCount(String condition) throws IOException;


    /**
     * 创建一条用户等级表数据
     *
     * @param userrankInfo 用户等级表模型
     * @return 返回创建信息
     **/
    int CreateUserrank(UserRankInfo userrankInfo) throws IOException;


    /**
     * 更新一条用户等级表数据
     *
     * @param userrankInfo 用户等级表模型
     **/
    int UpdateUserrank(UserRankInfo userrankInfo) throws IOException;


    /**
     * 删除一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    void DeleteUserrankByUserrId(int userrid) throws IOException;

    /**
     * 批量删除一批用户等级表数据
     **/
    void DeleteUserrankListByUserrId(String userridList) throws IOException;


    /**
     * 获得用户等级表一条记录
     *
     * @param userrid userrid
     * @return 返回一条UserrankInfo
     **/
    UserRankInfo GetUserrankByUserrId(int userrid) throws IOException;

    /**
     * 获得用户等级表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserrankInfo
     **/
    List<UserRankInfo> GetUserrankList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 用户等级表结束


}



