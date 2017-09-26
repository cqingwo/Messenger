/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.FriendLinkInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//友情链接表
@Service(value = "FriendLinksData")
public class FriendLinks extends DataService
{
	

	//region  友情链接表方法
	
	/**
	* 获得友情链接表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetFriendLinkCount(String condition) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFriendLinkCount(condition);
	}

	/**
	* 创建一条友情链接表数据
	* @param friendlinkInfo 友情链接表模型
	* @return 返回创建信息
	**/	 
	public int CreateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateFriendLink(friendlinkInfo);
	}

	/**
	* 更新一条友情链接表数据
	* @param friendlinkInfo 友情链接表模型
	**/
	public void UpdateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateFriendLink(friendlinkInfo);
	}

	/**
	* 删除一条友情链接表数据
	* @param id 友情链接表模型
	**/
	public void DeleteFriendLinkByid(int  id) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteFriendLinkByid(id);
	}
		/**
	* 批量删除一批友情链接表数据
	**/
	public void DeleteFriendLinkByidList(String idList ) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteFriendLinkByidList(idList );
	}
	
	/**
	* 获取一条友情链接表数据
	* @param id 友情链接表模型
	**/
	 public FriendLinkInfo GetFriendLinkByid(int id) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFriendLinkByid(id);
	}



	
	/**
	* 获得友情链接表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回FriendLinkInfo
	**/
	public List<FriendLinkInfo> GetFriendLinkList(String condition,String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFriendLinkList(condition,sort);
	}
	

			
	/**
	* 获得友情链接表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回FriendLinkInfo
	**/
	public List<FriendLinkInfo> GetFriendLinkList(int pageSize, int pageNumber, String condition, String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFriendLinkList(pageSize,pageNumber,condition,sort);
	}
	


	//endregion
   
}
