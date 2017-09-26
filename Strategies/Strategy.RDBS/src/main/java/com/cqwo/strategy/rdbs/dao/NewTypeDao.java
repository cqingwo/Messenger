/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.NewTypeInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface NewTypeDao
{
	
	
	//region 新闻类型表	
	/**
	* 获得新闻类型表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetNewtypeCount(String condition) throws IOException;
			
	
	/**
	* 创建一条新闻类型表数据
	* @param newtypeInfo 新闻类型表模型
	* @return 返回创建信息
	**/	 
	int CreateNewtype(NewTypeInfo newtypeInfo) throws IOException;
	
	
	/**
	* 更新一条新闻类型表数据
	* @param newtypeInfo 新闻类型表模型
	**/
	int UpdateNewtype(NewTypeInfo newtypeInfo) throws IOException;
	
	
	/**
	* 删除一条新闻类型表数据
	* @param newtypeid 新闻类型表模型
	**/
	void DeleteNewtypeByNewtypeId(int newtypeid) throws IOException;
	
		/**
	* 批量删除一批新闻类型表数据
	**/
	void DeleteNewtypeListByNewtypeId(String newtypeidList) throws IOException;
		
	
	/**
	* 获得新闻类型表一条记录
	* @param  newtypeid   newtypeid 
	* @return 返回一条NewtypeInfo
	**/
	NewTypeInfo GetNewtypeByNewtypeId(int newtypeid) throws IOException;
	
	/**
	* 获得新闻类型表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回NewtypeInfo
	**/
	List<NewTypeInfo> GetNewtypeList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 新闻类型表结束 

	


}



