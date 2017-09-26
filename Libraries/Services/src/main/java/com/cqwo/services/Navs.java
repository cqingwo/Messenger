/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.NavInfo;
import com.cqwo.data.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//导航表
@Service
public class Navs extends DataService {
    @Resource(name = "NavsData")
    com.cqwo.data.Navs navs;


    //region  条导航表方法

    /**
     * 获得导航表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetNavCount(String condition) throws IOException {
        return navs.GetNavCount(condition);
    }

    /**
     * 创建一条导航表数据
     *
     * @param navInfo 导航表模型
     * @return 返回创建信息
     **/
    public int CreateNav(NavInfo navInfo) throws IOException {
        return navs.CreateNav(navInfo);
    }

    /**
     * 更新一条导航表数据
     *
     * @param navInfo 导航表模型
     **/
    public void UpdateNav(NavInfo navInfo) throws IOException {
        navs.UpdateNav(navInfo);
    }

    /**
     * 删除一条导航表数据
     *
     * @param id 导航表模型
     **/
    public void DeleteNavById(int id) throws IOException {
        navs.DeleteNavById(id);
    }

    /**
     * 批量删除一批导航表数据
     **/
    public void DeleteNavListById(String idList) throws IOException {
        navs.DeleteNavListById(idList);
    }

    /**
     * 获取一条导航表数据
     *
     * @param id 导航表模型
     **/
    public NavInfo GetNavById(int id) throws IOException {
        return navs.GetNavById(id);
    }


    /**
     * 获得导航表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NavInfo
     **/
    public List<NavInfo> GetNavList(String condition, String sort) throws IOException {
        return navs.GetNavList(condition, sort);
    }


    /**
     * 获得导航表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NavInfo
     **/
    public List<NavInfo> GetNavList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return navs.GetNavList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}

