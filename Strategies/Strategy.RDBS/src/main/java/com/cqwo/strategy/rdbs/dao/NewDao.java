/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.NewInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface NewDao
{
	
	
	//region 新闻表	
	/**
	* 获得新闻表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetNewCount(String condition) throws IOException;
			
	
	/**
	* 创建一条新闻表数据
	* @param newInfo 新闻表模型
	* @return 返回创建信息
	**/	 
	int CreateNew(NewInfo newInfo) throws IOException;
	
	
	/**
	* 更新一条新闻表数据
	* @param newInfo 新闻表模型
	**/
	int UpdateNew(NewInfo newInfo) throws IOException;
	
	
	/**
	* 删除一条新闻表数据
	* @param newsid 新闻表模型
	**/
	void DeleteNewByNewsId(int newsid) throws IOException;
	
		/**
	* 批量删除一批新闻表数据
	**/
	void DeleteNewListByNewsId(String newsidList) throws IOException;
		
	
	/**
	* 获得新闻表一条记录
	* @param  newsid   newsid 
	* @return 返回一条NewInfo
	**/
	NewInfo GetNewByNewsId(int newsid) throws IOException;
	
	/**
	* 获得新闻表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回NewInfo
	**/
	List<NewInfo> GetNewList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 新闻表结束 

	


}



