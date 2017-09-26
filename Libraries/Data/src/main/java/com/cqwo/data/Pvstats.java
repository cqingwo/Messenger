/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.PvstatInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//pv统计表
@Service(value = "PvstatsData")
public class Pvstats extends DataService {


    //region  pv统计表方法

    /**
     * 获得pv统计表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetPvstatCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetPvstatCount(condition);
    }

    /**
     * 创建一条pv统计表数据
     *
     * @param pvstatInfo pv统计表模型
     * @return 返回创建信息
     **/
    public int CreatePvstat(PvstatInfo pvstatInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreatePvstat(pvstatInfo);
    }

    /**
     * 更新一条pv统计表数据
     *
     * @param pvstatInfo pv统计表模型
     **/
    public void UpdatePvstat(PvstatInfo pvstatInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdatePvstat(pvstatInfo);
    }

    /**
     * 删除一条pv统计表数据
     *
     * @param recordid pv统计表模型
     **/
    public void DeletePvstatByRecordId(int recordid) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeletePvstatByRecordId(recordid);
    }

    /**
     * 批量删除一批pv统计表数据
     **/
    public void DeletePvstatListByRecordId(String recordidList) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeletePvstatListByRecordId(recordidList);
    }

    /**
     * 获取一条pv统计表数据
     *
     * @param recordid pv统计表模型
     **/
    public PvstatInfo GetPvstatByRecordId(int recordid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetPvstatByRecordId(recordid);
    }


    /**
     * 获得pv统计表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回PvstatInfo
     **/
    public List<PvstatInfo> GetPvstatList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetPvstatList(condition, sort);
    }


    /**
     * 获得pv统计表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回PvstatInfo
     **/
    public List<PvstatInfo> GetPvstatList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetPvstatList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}

