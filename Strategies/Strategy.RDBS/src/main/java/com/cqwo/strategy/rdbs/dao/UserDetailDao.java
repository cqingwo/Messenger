/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.UserDetailInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface UserDetailDao
{
	
	
	//region 用户详细信息表	
	/**
	* 获得用户详细信息表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetUserdetailCount(String condition) throws IOException;
			
	
	/**
	* 创建一条用户详细信息表数据
	* @param userdetailInfo 用户详细信息表模型
	* @return 返回创建信息
	**/	 
	int CreateUserdetail(UserDetailInfo userdetailInfo) throws IOException;
	
	
	/**
	* 更新一条用户详细信息表数据
	* @param userdetailInfo 用户详细信息表模型
	**/
	int UpdateUserdetail(UserDetailInfo userdetailInfo) throws IOException;
	
	
	/**
	* 删除一条用户详细信息表数据
	* @param uid 用户详细信息表模型
	**/
	void DeleteUserdetailByUid(int uid) throws IOException;
	
		/**
	* 批量删除一批用户详细信息表数据
	**/
	void DeleteUserdetailListByUid(String uidList) throws IOException;
		
	
	/**
	* 获得用户详细信息表一条记录
	* @param  uid   uid 
	* @return 返回一条UserdetailInfo
	**/
	UserDetailInfo GetUserdetailByUid(int uid) throws IOException;
	
	/**
	* 获得用户详细信息表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回UserdetailInfo
	**/
	List<UserDetailInfo> GetUserdetailList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 用户详细信息表结束 

	


}



