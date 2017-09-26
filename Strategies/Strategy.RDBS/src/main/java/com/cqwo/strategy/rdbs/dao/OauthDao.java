/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.OauthInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface OauthDao
{
	
	
	//region 开放授权表	
	/**
	* 获得开放授权表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetOauthCount(String condition) throws IOException;
			
	
	/**
	* 创建一条开放授权表数据
	* @param oauthInfo 开放授权表模型
	* @return 返回创建信息
	**/	 
	int CreateOauth(OauthInfo oauthInfo) throws IOException;
	
	
	/**
	* 更新一条开放授权表数据
	* @param oauthInfo 开放授权表模型
	**/
	int UpdateOauth(OauthInfo oauthInfo) throws IOException;
	
	
	/**
	* 删除一条开放授权表数据
	* @param id 开放授权表模型
	**/
	void DeleteOauthById(int id) throws IOException;
	
		/**
	* 批量删除一批开放授权表数据
	**/
	void DeleteOauthListById(String idList) throws IOException;
		
	
	/**
	* 获得开放授权表一条记录
	* @param  id   id 
	* @return 返回一条OauthInfo
	**/
	OauthInfo GetOauthById(int id) throws IOException;
	
	/**
	* 获得开放授权表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回OauthInfo
	**/
	List<OauthInfo> GetOauthList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion 开放授权表结束 

	


}



