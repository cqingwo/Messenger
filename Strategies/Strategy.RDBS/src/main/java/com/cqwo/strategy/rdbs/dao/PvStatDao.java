/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.dao;

import com.cqwo.core.domain.PvstatInfo;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;


public interface PvStatDao
{
	
	
	//region pv统计表	
	/**
	* 获得pv统计表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	int GetPvstatCount(String condition) throws IOException;
			
	
	/**
	* 创建一条pv统计表数据
	* @param pvstatInfo pv统计表模型
	* @return 返回创建信息
	**/	 
	int CreatePvstat(PvstatInfo pvstatInfo) throws IOException;
	
	
	/**
	* 更新一条pv统计表数据
	* @param pvstatInfo pv统计表模型
	**/
	int UpdatePvstat(PvstatInfo pvstatInfo) throws IOException;
	
	
	/**
	* 删除一条pv统计表数据
	* @param recordid pv统计表模型
	**/
	void DeletePvstatByRecordId(int recordid) throws IOException;
	
		/**
	* 批量删除一批pv统计表数据
	**/
	void DeletePvstatListByRecordId(String recordidList) throws IOException;
		
	
	/**
	* 获得pv统计表一条记录
	* @param  recordid   recordid 
	* @return 返回一条PvstatInfo
	**/
	PvstatInfo GetPvstatByRecordId(int recordid) throws IOException;
	
	/**
	* 获得pv统计表数据列表
	* @param pageSize 每页数
	* @param count 当前排除的条数
	* @param condition 条件
	* @param sort 排序
	* @return 返回PvstatInfo
	**/
	List<PvstatInfo> GetPvstatList(@Param("pageSize") int pageSize, @Param("count") int count, @Param("condition") String condition, @Param("sort") String sort) throws IOException;
	

	//endregion pv统计表结束 

	


}



