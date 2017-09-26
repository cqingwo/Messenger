/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface UserDao
{
	
	
	//region 用户表	
	/**
	* 获得用户表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetUserCount(String condition) throws IOException;
			
	
	/**
	* 创建一条用户表数据
	* @param userInfo 用户表模型
	* @return 返回创建信息
	**/	 
	int CreateUser(UserInfo userInfo) throws IOException;
	
	
	/**
	* 更新一条用户表数据
	* @param userInfo 用户表模型
	**/
	int UpdateUser(UserInfo userInfo) throws IOException;
	
	
	/**
	* 删除一条用户表数据
	* @param uid 用户表模型
	**/
	void DeleteUserByUid(int uid) throws IOException;
	
		/**
	* 批量删除一批用户表数据
	**/
	void DeleteUserListByUid(String uidList) throws IOException;
		
	
	/**
	* 获得用户表一条记录
	* @param  uid   uid 
	* @return 返回一条UserInfo
	**/
	UserInfo GetUserByUid(int uid) throws IOException;
	
	/**
	* 获得用户表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回UserInfo
	**/
	List<UserInfo> GetUserList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 用户表结束 

	


}



