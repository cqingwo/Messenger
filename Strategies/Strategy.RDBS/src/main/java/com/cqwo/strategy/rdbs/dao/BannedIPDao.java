/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.BannedIPInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface BannedIPDao
{
	
	
	//region 禁止ip表	
	/**
	* 获得禁止ip表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetBannedIPCount(String condition) throws IOException;
			
	
	/**
	* 创建一条禁止ip表数据
	* @param bannedipInfo 禁止ip表模型
	* @return 返回创建信息
	**/	 
	int CreateBannedIP(BannedIPInfo bannedipInfo) throws IOException;
	
	
	/**
	* 更新一条禁止ip表数据
	* @param bannedipInfo 禁止ip表模型
	**/
	int UpdateBannedIP(BannedIPInfo bannedipInfo) throws IOException;
	
	
	/**
	* 删除一条禁止ip表数据
	* @param id 禁止ip表模型
	**/
	void DeleteBannedIPById(int id) throws IOException;
	
		/**
	* 批量删除一批禁止ip表数据
	**/
	void DeleteBannedIPByIdList(String idList) throws IOException;
		
	
	/**
	* 获得禁止ip表一条记录
	* @param  id   id 
	* @return 返回一条BannedIPInfo
	**/
	BannedIPInfo GetBannedIPById(int id) throws IOException;
	
	/**
	* 获得禁止ip表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回BannedIPInfo
	**/
	List<BannedIPInfo> GetBannedIPList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 禁止ip表结束 

	


}


