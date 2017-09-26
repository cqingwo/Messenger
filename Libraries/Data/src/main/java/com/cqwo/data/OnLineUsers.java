/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.OnlineTimeInfo;
import com.cqwo.core.domain.OnlineUserInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//在线用户表
@Service(value = "OnlineusersData")
public class OnLineUsers extends DataService
{
	

	//region  在线用户表方法
	
	/**
	* 获得在线用户表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetOnlineuserCount(String condition) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlineuserCount(condition);
	}

	/**
	* 创建一条在线用户表数据
	* @param onlineUserInfo 在线用户表模型
	* @return 返回创建信息
	**/	 
	public int CreateOnlineuser(OnlineUserInfo onlineUserInfo) throws IOException {
		return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateOnlineuser(onlineUserInfo);
	}

	/**
	* 更新一条在线用户表数据
	* @param onlineUserInfo 在线用户表模型
	**/
	public void UpdateOnlineuser(OnlineUserInfo onlineUserInfo) throws IOException {
		getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateOnlineuser(onlineUserInfo);
	}

	/**
	* 删除一条在线用户表数据
	* @param olid 在线用户表模型
	**/
	public void DeleteOnlineuserByOlId(int  olid) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteOnlineuserByOlId(olid);
	}
		/**
	* 批量删除一批在线用户表数据
	**/
	public void DeleteOnlineuserListByOlId(String olidList ) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteOnlineuserListByOlId(olidList );
	}
	
	/**
	* 获取一条在线用户表数据
	* @param olid 在线用户表模型
	**/
	 public OnlineUserInfo GetOnlineuserByOlId(int olid) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlineuserByOlId(olid);
	}



	
	/**
	* 获得在线用户表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回OnlineUserInfo
	**/
	public List<OnlineUserInfo> GetOnlineuserList(String condition,String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlineuserList(condition,sort);
	}
	

			
	/**
	* 获得在线用户表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回OnlineUserInfo
	**/
	public List<OnlineUserInfo> GetOnlineuserList(int pageSize, int pageNumber, String condition, String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlineuserList(pageSize,pageNumber,condition,sort);
	}
	


	//endregion
	//region  在线时间表方法
	
	/**
	* 获得在线时间表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetOnlinetimeCount(String condition) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlinetimeCount(condition);
	}

	/**
	* 创建一条在线时间表数据
	* @param onlineTimeInfo 在线时间表模型
	* @return 返回创建信息
	**/	 
	public int CreateOnlinetime(OnlineTimeInfo onlineTimeInfo) throws IOException {
		return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateOnlinetime(onlineTimeInfo);
	}

	/**
	* 更新一条在线时间表数据
	* @param OnLineTimeInfo 在线时间表模型
	**/
	public void UpdateOnlinetime(OnlineTimeInfo OnLineTimeInfo) throws IOException {
		getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateOnlinetime(OnLineTimeInfo);
	}

	/**
	
	**/
	public void DeleteOnlinetimeByUid(int  uid) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteOnlinetimeByUid(uid);
	}
		/**
	* 批量删除一批在线时间表数据
	**/
	public void DeleteOnlinetimeListByUid(String uidList ) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteOnlinetimeListByUid(uidList );
	}
	
	/**
	* 获取一条在线时间表数据
	
	**/
	 public OnlineTimeInfo GetOnlinetimeByUid(int uid) throws IOException {
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlinetimeByUid(uid);
	}



	
	/**
	* 获得在线时间表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回OnLineTimeInfo
	**/
	public List<OnlineTimeInfo> GetOnlinetimeList(String condition,String sort) throws IOException {
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlinetimeList(condition,sort);
	}
	

			
	/**
	* 获得在线时间表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回OnLineTimeInfo
	**/
	public List<OnlineTimeInfo> GetOnlinetimeList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOnlinetimeList(pageSize,pageNumber,condition,sort);
	}
	
	//endregion
   
}

