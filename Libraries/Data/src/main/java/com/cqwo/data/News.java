/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.NewInfo;
import com.cqwo.core.domain.NewTypeInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//新闻表
@Service(value = "NewsData")
public class News extends DataService {


    //region  新闻表方法

    /**
     * 获得新闻表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetNewCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewCount(condition);
    }

    /**
     * 创建一条新闻表数据
     *
     * @param newInfo 新闻表模型
     * @return 返回创建信息
     **/
    public int CreateNew(NewInfo newInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateNew(newInfo);
    }

    /**
     * 更新一条新闻表数据
     *
     * @param newInfo 新闻表模型
     **/
    public void UpdateNew(NewInfo newInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateNew(newInfo);
    }

    /**
     * 删除一条新闻表数据
     *
     * @param newsid 新闻表模型
     **/
    public void DeleteNewByNewsId(int newsid) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteNewByNewsId(newsid);
    }

    /**
     * 批量删除一批新闻表数据
     **/
    public void DeleteNewListByNewsId(String newsidList) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteNewListByNewsId(newsidList);
    }

    /**
     * 获取一条新闻表数据
     *
     * @param newsid 新闻表模型
     **/
    public NewInfo GetNewByNewsId(int newsid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewByNewsId(newsid);
    }


    /**
     * 获得新闻表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NewInfo
     **/
    public List<NewInfo> GetNewList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewList(condition, sort);
    }


    /**
     * 获得新闻表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NewInfo
     **/
    public List<NewInfo> GetNewList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewList(pageSize, pageNumber, condition, sort);
    }


    //endregion
    //region  新闻类型表方法

    /**
     * 获得新闻类型表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetNewtypeCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewtypeCount(condition);
    }

    /**
     * 创建一条新闻类型表数据
     *
     * @param NewTypeInfo 新闻类型表模型
     * @return 返回创建信息
     **/
    public int CreateNewtype(NewTypeInfo NewTypeInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateNewtype(NewTypeInfo);
    }

    /**
     * 更新一条新闻类型表数据
     *
     * @param NewTypeInfo 新闻类型表模型
     **/
    public void UpdateNewtype(NewTypeInfo NewTypeInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateNewtype(NewTypeInfo);
    }

    /**
     * 删除一条新闻类型表数据
     *
     * @param newtypeid 新闻类型表模型
     **/
    public void DeleteNewtypeByNewtypeId(int newtypeid) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteNewtypeByNewtypeId(newtypeid);
    }

    /**
     * 批量删除一批新闻类型表数据
     **/
    public void DeleteNewtypeListByNewtypeId(String newtypeidList) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteNewtypeListByNewtypeId(newtypeidList);
    }

    /**
     * 获取一条新闻类型表数据
     *
     * @param newtypeid 新闻类型表模型
     **/
    public NewTypeInfo GetNewtypeByNewtypeId(int newtypeid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewtypeByNewtypeId(newtypeid);
    }


    /**
     * 获得新闻类型表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NewTypeInfo
     **/
    public List<NewTypeInfo> GetNewtypeList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewtypeList(condition, sort);
    }


    /**
     * 获得新闻类型表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NewTypeInfo
     **/
    public List<NewTypeInfo> GetNewtypeList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetNewtypeList(pageSize, pageNumber, condition, sort);
    }


    //endregion


}

