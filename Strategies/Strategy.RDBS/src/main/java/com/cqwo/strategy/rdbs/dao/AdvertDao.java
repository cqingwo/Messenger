/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.AdvertInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface AdvertDao
{
		 
	
	/**
	* 获得广告表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetAdvertCount(@Param("condition") String condition) throws IOException;
			
	
	/**
	* 创建一条广告表数据
	* @param advertInfo 广告表模型
	* @return 返回创建信息
	**/	 
	int CreateAdvert(AdvertInfo advertInfo) throws IOException;
	
	
	/**
	* 更新一条广告表数据
	* @param advertInfo 广告表模型
	**/
	int UpdateAdvert(AdvertInfo advertInfo) throws IOException;
	
	
	/**
	* 删除一条广告表数据
	* @param adid 广告表模型
	**/
	void DeleteAdvertByAdId(int adid) throws IOException;

	/**
	 * 批量删除一批广告表数据
	 **/
	public void DeleteAdvertByAdIdList(@Param("adidList") String adidList) throws IOException;
		
	
	/**
	* 获得广告表一条记录
	* @param  adid   adid 
	* @return 返回一条AdvertInfo
	**/
	AdvertInfo GetAdvertByAdId(int adid) throws IOException;
	
	/**
	* 获得广告表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param strOrder 排序
	* @return 返回AdvertInfo
	**/
	List<AdvertInfo> GetAdvertList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("strOrder") String strOrder) throws IOException;
	



	


}


