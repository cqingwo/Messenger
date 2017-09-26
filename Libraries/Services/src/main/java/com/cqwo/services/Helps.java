/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.HelpInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//帮助表
@Service
public class Helps {
    @Resource(name = "HelpsData")
    com.cqwo.data.Helps helps;


    //region  条帮助表方法

    /**
     * 获得帮助表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetHelpCount(String condition) throws IOException {
        return helps.GetHelpCount(condition);
    }

    /**
     * 创建一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     * @return 返回创建信息
     **/
    public int CreateHelp(HelpInfo helpInfo) throws IOException {
        return helps.CreateHelp(helpInfo);
    }

    /**
     * 更新一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     **/
    public void UpdateHelp(HelpInfo helpInfo) throws IOException {
        helps.UpdateHelp(helpInfo);
    }

    /**
     * 删除一条帮助表数据
     *
     * @param id 帮助表模型
     **/
    public void DeleteHelpByid(int id) throws IOException {
        helps.DeleteHelpByid(id);
    }

    /**
     * 批量删除一批帮助表数据
     **/
    public void DeleteHelpByidList(String idList) throws IOException {
        helps.DeleteHelpByidList(idList);
    }

    /**
     * 获取一条帮助表数据
     *
     * @param id 帮助表模型
     **/
    public HelpInfo GetHelpByid(int id) throws IOException {
        return helps.GetHelpByid(id);
    }


    /**
     * 获得帮助表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回HelpInfo
     **/
    public List<HelpInfo> GetHelpList(String condition, String sort) throws IOException {
        return helps.GetHelpList(condition, sort);
    }


    /**
     * 获得帮助表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回HelpInfo
     **/
    public List<HelpInfo> GetHelpList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return helps.GetHelpList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}
