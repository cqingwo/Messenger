/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.AdvertPositionInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface AdvertPositionDao
{
		 
	
	/**
	* 获得广告位置表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetAdvertPositionCount(String condition) throws IOException;
			
	
	/**
	* 创建一条广告位置表数据
	* @param advertpositionInfo 广告位置表模型
	* @return 返回创建信息
	**/	 
	int CreateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException;
	
	
	/**
	* 更新一条广告位置表数据
	* @param advertpositionInfo 广告位置表模型
	**/
	int UpdateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException;
	
	
	/**
	* 删除一条广告位置表数据
	* @param adposid 广告位置表模型
	**/
	void DeleteAdvertPositionByAdPosId(int  adposid) throws IOException;
	
		/**
	* 批量删除一批广告位置表数据
	**/
	void DeleteAdvertPositionByAdPosIdList(String adposidList ) throws IOException;
		
	
	/**
	* 获得广告位置表一条记录
	* @param  adposid   adposid 
	* @return 返回一条AdvertPositionInfo
	**/
	AdvertPositionInfo GetAdvertPositionByAdPosId(int  adposid) throws IOException;
	
	/**
	* 获得广告位置表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param strOrder 排序
	* @return 返回AdvertPositionInfo
	**/
	List<AdvertPositionInfo> GetAdvertPositionList(@Param("pageSize")int pageSize, @Param("count")int count, @Param("condition")String condition, @Param("sort")String strOrder) throws IOException;
	



	


}


