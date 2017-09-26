/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.AdminActionInfo;
import com.cqwo.core.domain.AdminGroupInfo;
import com.cqwo.core.domain.AdminLogInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//商城管理动作表
@Service
public class AdminUsers extends Users
{
	@Resource(name = "AdminUsersData")
	com.cqwo.data.AdminUsers adminUsers;


	//region  条商城管理动作表方法
	
	/**
	* 获得商城管理动作表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetAdminActionCount(String condition) throws IOException { 
		return adminUsers.GetAdminActionCount(condition);
	}

	/**
	* 创建一条商城管理动作表数据
	* @param adminactionInfo 商城管理动作表模型
	* @return 返回创建信息
	**/	 
	public int CreateAdminAction(AdminActionInfo adminactionInfo) throws IOException { 
		return adminUsers.CreateAdminAction(adminactionInfo);
	}

	/**
	* 更新一条商城管理动作表数据
	* @param adminactionInfo 商城管理动作表模型
	**/
	public void UpdateAdminAction(AdminActionInfo adminactionInfo) throws IOException { 
		adminUsers.UpdateAdminAction(adminactionInfo);
	}

	/**
	* 删除一条商城管理动作表数据
	* @param aid 商城管理动作表模型
	**/
	public void DeleteAdminActionByAid(int  aid) throws IOException { 
		adminUsers.DeleteAdminActionByAid(aid);
	}
		/**
	* 批量删除一批商城管理动作表数据
	**/
	public void DeleteAdminActionByAidList(String aidList ) throws IOException { 
		adminUsers.DeleteAdminActionByAidList(aidList );
	}
	
	/**
	* 获取一条商城管理动作表数据
	* @param aid 商城管理动作表模型
	**/
	 public AdminActionInfo GetAdminActionByAid(int aid) throws IOException { 
		return adminUsers.GetAdminActionByAid(aid);
	}

	
	/**
	* 获得商城管理动作表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回AdminActionInfo
	**/
	public List<AdminActionInfo> GetAdminActionList(String condition,String sort) throws IOException { 
		return adminUsers.GetAdminActionList(condition,sort);
	}
	

			
	/**
	* 获得商城管理动作表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回AdminActionInfo
	**/
	public List<AdminActionInfo> GetAdminActionList(int pageSize, int pageNumber, String condition, String sort) throws IOException { 
		return adminUsers.GetAdminActionList(pageSize,pageNumber,condition,sort);
	}
	


	//endregion

	//region  条商城管理组表方法

	/**
	 * 获得商城管理组表数量
	 * @param condition 条件
	 * @return 返回数量
	 **/
	public int GetAdminGroupCount(String condition) throws IOException {
		return adminUsers.GetAdminGroupCount(condition);
	}

	/**
	 * 创建一条商城管理组表数据
	 * @param admingroupInfo 商城管理组表模型
	 * @return 返回创建信息
	 **/
	public int CreateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException {
		return adminUsers.CreateAdminGroup(admingroupInfo);
	}

	/**
	 * 更新一条商城管理组表数据
	 * @param admingroupInfo 商城管理组表模型
	 **/
	public void UpdateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException {
		adminUsers.UpdateAdminGroup(admingroupInfo);
	}

	/**
	 * 删除一条商城管理组表数据
	 * @param agid 商城管理组表模型
	 **/
	public void DeleteAdminGroupByAGId(int  agid) throws IOException {
		adminUsers.DeleteAdminGroupByAGId(agid);
	}
	/**
	 * 批量删除一批商城管理组表数据
	 **/
	public void DeleteAdminGroupByAGIdList(String agidList ) throws IOException {
		adminUsers.DeleteAdminGroupByAGIdList(agidList );
	}

	/**
	 * 获取一条商城管理组表数据
	 * @param agid 商城管理组表模型
	 **/
	public AdminGroupInfo GetAdminGroupByAGId(int agid) throws IOException {
		return adminUsers.GetAdminGroupByAGId(agid);
	}




	/**
	 * 获得商城管理组表数据列表
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdminGroupInfo
	 **/
	public List<AdminGroupInfo> GetAdminGroupList(String condition,String sort) throws IOException {
		return adminUsers.GetAdminGroupList(condition,sort);
	}



	/**
	 * 获得商城管理组表数据列表
	 * @param pageSize 每页数
	 * @param pageNumber 当前页数
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdminGroupInfo
	 **/
	public List<AdminGroupInfo> GetAdminGroupList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
		return adminUsers.GetAdminGroupList(pageSize,pageNumber,condition,sort);
	}



	//endregion

	//region  条商城管理日志表方法

	/**
	 * 获得商城管理日志表数量
	 * @param condition 条件 
	 * @return 返回数量
	 **/
	public int GetAdminLogCount(String condition) throws IOException {
		return adminUsers.GetAdminLogCount(condition);
	}

	/**
	 * 创建一条商城管理日志表数据
	 * @param adminlogInfo 商城管理日志表模型
	 * @return 返回创建信息
	 **/
	public int CreateAdminLog(AdminLogInfo adminlogInfo) throws IOException {
		return adminUsers.CreateAdminLog(adminlogInfo);
	}

	/**
	 * 更新一条商城管理日志表数据
	 * @param adminlogInfo 商城管理日志表模型
	 **/
	public void UpdateAdminLog(AdminLogInfo adminlogInfo) throws IOException {
		adminUsers.UpdateAdminLog(adminlogInfo);
	}

	/**
	 * 删除一条商城管理日志表数据
	 * @param logid 商城管理日志表模型
	 **/
	public void DeleteAdminLogByLogId(int  logid) throws IOException {
		adminUsers.DeleteAdminLogByLogId(logid);
	}
	/**
	 * 批量删除一批商城管理日志表数据
	 **/
	public void DeleteAdminLogByLogIdList(String logidList ) throws IOException {
		adminUsers.DeleteAdminLogByLogIdList(logidList );
	}

	/**
	 * 获取一条商城管理日志表数据
	 * @param logid 商城管理日志表模型
	 **/
	public AdminLogInfo GetAdminLogByLogId(int logid) throws IOException {
		return adminUsers.GetAdminLogByLogId(logid);
	}




	/**
	 * 获得商城管理日志表数据列表
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdminLogInfo
	 **/
	public List<AdminLogInfo> GetAdminLogList(String condition,String sort) throws IOException {
		return adminUsers.GetAdminLogList(condition,sort);
	}



	/**
	 * 获得商城管理日志表数据列表
	 * @param pageSize 每页数
	 * @param pageNumber 当前页数
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdminLogInfo
	 **/
	public List<AdminLogInfo> GetAdminLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
		return adminUsers.GetAdminLogList(pageSize,pageNumber,condition,sort);
	}



	//endregion
   
}
