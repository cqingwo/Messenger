/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.FilterWordInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//筛选词表
@Service
public class FilterWords {
    @Resource(name = "FilterWordsData")
    com.cqwo.data.FilterWords filterwords;


    //region  条筛选词表方法

    /**
     * 获得筛选词表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetFilterWordCount(String condition) throws IOException {
        return filterwords.GetFilterWordCount(condition);
    }

    /**
     * 创建一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     * @return 返回创建信息
     **/
    public int CreateFilterWord(FilterWordInfo filterwordInfo) throws IOException {
        return filterwords.CreateFilterWord(filterwordInfo);
    }

    /**
     * 更新一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     **/
    public void UpdateFilterWord(FilterWordInfo filterwordInfo) throws IOException {
        filterwords.UpdateFilterWord(filterwordInfo);
    }

    /**
     * 删除一条筛选词表数据
     *
     * @param id 筛选词表模型
     **/
    public void DeleteFilterWordById(int id) throws IOException {
        filterwords.DeleteFilterWordById(id);
    }

    /**
     * 批量删除一批筛选词表数据
     **/
    public void DeleteFilterWordByIdList(String idList) throws IOException {
        filterwords.DeleteFilterWordByIdList(idList);
    }

    /**
     * 获取一条筛选词表数据
     *
     * @param id 筛选词表模型
     **/
    public FilterWordInfo GetFilterWordById(int id) throws IOException {
        return filterwords.GetFilterWordById(id);
    }


    /**
     * 获得筛选词表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回FilterWordInfo
     **/
    public List<FilterWordInfo> GetFilterWordList(String condition, String sort) throws IOException {
        return filterwords.GetFilterWordList(condition, sort);
    }


    /**
     * 获得筛选词表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回FilterWordInfo
     **/
    public List<FilterWordInfo> GetFilterWordList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return filterwords.GetFilterWordList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}
