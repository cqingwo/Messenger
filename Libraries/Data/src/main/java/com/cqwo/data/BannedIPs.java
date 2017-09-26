/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.BannedIPInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//禁止ip表
@Service(value = "BannedIPsData")
public class BannedIPs extends DataService
{
	

	//region  禁止ip表方法
	
	/**
	* 获得禁止ip表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetBannedIPCount(String condition) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetBannedIPCount(condition);
	}

	/**
	* 创建一条禁止ip表数据
	* @param bannedipInfo 禁止ip表模型
	* @return 返回创建信息
	**/	 
	public int CreateBannedIP(BannedIPInfo bannedipInfo) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateBannedIP(bannedipInfo);
	}

	/**
	* 更新一条禁止ip表数据
	* @param bannedipInfo 禁止ip表模型
	**/
	public void UpdateBannedIP(BannedIPInfo bannedipInfo) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateBannedIP(bannedipInfo);
	}

	/**
	* 删除一条禁止ip表数据
	* @param id 禁止ip表模型
	**/
	public void DeleteBannedIPById(int  id) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteBannedIPById(id);
	}
		/**
	* 批量删除一批禁止ip表数据
	**/
	public void DeleteBannedIPByIdList(String idList ) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteBannedIPByIdList(idList );
	}
	
	/**
	* 获取一条禁止ip表数据
	* @param id 禁止ip表模型
	**/
	 public BannedIPInfo GetBannedIPById(int id) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetBannedIPById(id);
	}



	
	/**
	* 获得禁止ip表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回BannedIPInfo
	**/
	public List<BannedIPInfo> GetBannedIPList(String condition,String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetBannedIPList(condition,sort);
	}
	

			
	/**
	* 获得禁止ip表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回BannedIPInfo
	**/
	public List<BannedIPInfo> GetBannedIPList(int pageSize, int pageNumber, String condition, String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetBannedIPList(pageSize,pageNumber,condition,sort);
	}
	


	//endregion
   
}
