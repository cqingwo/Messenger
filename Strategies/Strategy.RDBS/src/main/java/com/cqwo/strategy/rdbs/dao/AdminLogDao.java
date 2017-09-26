/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.AdminLogInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface AdminLogDao
{
	
	
	//region 商城管理日志表	
	/**
	* 获得商城管理日志表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetAdminLogCount(@Param("condition") String condition) throws IOException;
			
	
	/**
	* 创建一条商城管理日志表数据
	* @param adminlogInfo 商城管理日志表模型
	* @return 返回创建信息
	**/	 
	void CreateAdminLog(AdminLogInfo adminlogInfo) throws IOException;
	
	
	/**
	* 更新一条商城管理日志表数据
	* @param adminlogInfo 商城管理日志表模型
	**/
	void UpdateAdminLog(AdminLogInfo adminlogInfo) throws IOException;
	
	
	/**
	* 删除一条商城管理日志表数据
	* @param logid 商城管理日志表模型
	**/
	void DeleteAdminLogByLogId(int logid) throws IOException;
	
		/**
	* 批量删除一批商城管理日志表数据
	**/
	void DeleteAdminLogByLogIdList(@Param("logidList") String logidList) throws IOException;
		
	
	/**
	* 获得商城管理日志表一条记录
	* @param  logid   logid 
	* @return 返回一条AdminLogInfo
	**/
	AdminLogInfo GetAdminLogByLogId(int logid) throws IOException;
	
	/**
	* 获得商城管理日志表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回AdminLogInfo
	**/
	List<AdminLogInfo> GetAdminLogList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 商城管理日志表结束 

	


}


