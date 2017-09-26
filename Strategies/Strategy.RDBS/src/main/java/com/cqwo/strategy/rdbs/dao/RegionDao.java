/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.RegionInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface RegionDao
{
	
	
	//region 区域表	
	/**
	* 获得区域表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetRegionCount(String condition) throws IOException;
			
	
	/**
	* 创建一条区域表数据
	* @param regionInfo 区域表模型
	* @return 返回创建信息
	**/	 
	int CreateRegion(RegionInfo regionInfo) throws IOException;
	
	
	/**
	* 更新一条区域表数据
	* @param regionInfo 区域表模型
	**/
	int UpdateRegion(RegionInfo regionInfo) throws IOException;
	
	
	/**
	* 删除一条区域表数据
	* @param regionid 区域表模型
	**/
	void DeleteRegionByRegionId(int regionid) throws IOException;
	
		/**
	* 批量删除一批区域表数据
	**/
	void DeleteRegionListByRegionId(String regionidList) throws IOException;
		
	
	/**
	* 获得区域表一条记录
	* @param  regionid   regionid 
	* @return 返回一条RegionInfo
	**/
	RegionInfo GetRegionByRegionId(int regionid) throws IOException;
	
	/**
	* 获得区域表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回RegionInfo
	**/
	List<RegionInfo> GetRegionList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 区域表结束 

	


}



