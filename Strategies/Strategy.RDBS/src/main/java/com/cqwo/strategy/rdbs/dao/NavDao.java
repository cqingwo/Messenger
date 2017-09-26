/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.NavInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface NavDao
{
	
	
	//region 导航表	
	/**
	* 获得导航表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetNavCount(String condition) throws IOException;
			
	
	/**
	* 创建一条导航表数据
	* @param navInfo 导航表模型
	* @return 返回创建信息
	**/	 
	int CreateNav(NavInfo navInfo) throws IOException;
	
	
	/**
	* 更新一条导航表数据
	* @param navInfo 导航表模型
	**/
	int UpdateNav(NavInfo navInfo) throws IOException;
	
	
	/**
	* 删除一条导航表数据
	* @param id 导航表模型
	**/
	void DeleteNavById(int id) throws IOException;
	
		/**
	* 批量删除一批导航表数据
	**/
	void DeleteNavListById(String idList) throws IOException;
		
	
	/**
	* 获得导航表一条记录
	* @param  id  id
	* @return 返回一条NavInfo
	**/
	NavInfo GetNavById(int id) throws IOException;
	
	/**
	* 获得导航表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回NavInfo
	**/
	List<NavInfo> GetNavList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 导航表结束 

	


}



