/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.FilterWordInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface FilterWordDao {


    //region 筛选词表

    /**
     * 获得筛选词表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetFilterWordCount(@Param("condition") String condition) throws IOException;


    /**
     * 创建一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     * @return 返回创建信息
     **/
    void CreateFilterWord(FilterWordInfo filterwordInfo) throws IOException;


    /**
     * 更新一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     **/
    void UpdateFilterWord(FilterWordInfo filterwordInfo) throws IOException;


    /**
     * 删除一条筛选词表数据
     *
     * @param id 筛选词表模型
     **/
    void DeleteFilterWordById(int id) throws IOException;

    /**
     * 批量删除一批筛选词表数据
     **/
    void DeleteFilterWordByIdList(@Param("idList") String idList) throws IOException;


    /**
     * 获得筛选词表一条记录
     *
     * @param id id
     * @return 返回一条FilterWordInfo
     **/
    FilterWordInfo GetFilterWordById(int id) throws IOException;

    /**
     * 获得筛选词表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回FilterWordInfo
     **/
    List<FilterWordInfo> GetFilterWordList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 筛选词表结束


}


