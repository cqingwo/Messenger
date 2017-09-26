/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.FriendLinkInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface FriendLinkDao {


    //region 友情链接表

    /**
     * 获得友情链接表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetFriendLinkCount(@Param("condition") String condition) throws IOException;


    /**
     * 创建一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     * @return 返回创建信息
     **/
    void CreateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException;


    /**
     * 更新一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     **/
    void UpdateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException;


    /**
     * 删除一条友情链接表数据
     *
     * @param id 友情链接表模型
     **/
    void DeleteFriendLinkByid(int id) throws IOException;

    /**
     * 批量删除一批友情链接表数据
     **/
    void DeleteFriendLinkByidList(@Param("idList") String idList) throws IOException;


    /**
     * 获得友情链接表一条记录
     *
     * @param id id
     * @return 返回一条FriendLinkInfo
     **/
    FriendLinkInfo GetFriendLinkByid(int id) throws IOException;

    /**
     * 获得友情链接表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回FriendLinkInfo
     **/
    List<FriendLinkInfo> GetFriendLinkList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 友情链接表结束


}


