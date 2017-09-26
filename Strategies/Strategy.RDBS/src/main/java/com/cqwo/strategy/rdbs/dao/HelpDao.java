/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.HelpInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface HelpDao {


    //region 帮助表

    /**
     * 获得帮助表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetHelpCount(@Param("condition") String condition) throws IOException;


    /**
     * 创建一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     * @return 返回创建信息
     **/
    void CreateHelp(HelpInfo helpInfo) throws IOException;


    /**
     * 更新一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     **/
    void UpdateHelp(HelpInfo helpInfo) throws IOException;


    /**
     * 删除一条帮助表数据
     *
     * @param id 帮助表模型
     **/
    void DeleteHelpByid(int id) throws IOException;

    /**
     * 批量删除一批帮助表数据
     **/
    void DeleteHelpByidList(@Param("idList") String idList) throws IOException;


    /**
     * 获得帮助表一条记录
     *
     * @param id id
     * @return 返回一条HelpInfo
     **/
    HelpInfo GetHelpByid(int id) throws IOException;

    /**
     * 获得帮助表数据列表
     *
     * @param pageSize  每页数
     * @param count     当前排除的条数
     * @param condition 条件
     * @param sort      排序
     * @return 返回HelpInfo
     **/
    List<HelpInfo> GetHelpList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;


    //endregion 帮助表结束


}


