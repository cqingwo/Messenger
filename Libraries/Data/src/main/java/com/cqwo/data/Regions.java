/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.RegionInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//区域表
@Service(value = "RegionsData")
public class Regions extends DataService {


    //region  区域表方法

    /**
     * 获得区域表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetRegionCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetRegionCount(condition);
    }

    /**
     * 创建一条区域表数据
     *
     * @param regionInfo 区域表模型
     * @return 返回创建信息
     **/
    public int CreateRegion(RegionInfo regionInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateRegion(regionInfo);
    }

    /**
     * 更新一条区域表数据
     *
     * @param regionInfo 区域表模型
     **/
    public void UpdateRegion(RegionInfo regionInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateRegion(regionInfo);
    }

    /**
     * 删除一条区域表数据
     *
     * @param regionid 区域表模型
     **/
    public void DeleteRegionByRegionId(int regionid) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteRegionByRegionId(regionid);
    }

    /**
     * 批量删除一批区域表数据
     **/
    public void DeleteRegionListByRegionId(String regionidList) throws IOException {
        getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteRegionListByRegionId(regionidList);
    }

    /**
     * 获取一条区域表数据
     *
     * @param regionid 区域表模型
     **/
    public RegionInfo GetRegionByRegionId(int regionid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetRegionByRegionId(regionid);
    }


    /**
     * 获得区域表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回RegionInfo
     **/
    public List<RegionInfo> GetRegionList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetRegionList(condition, sort);
    }


    /**
     * 获得区域表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回RegionInfo
     **/
    public List<RegionInfo> GetRegionList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetRegionList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}

