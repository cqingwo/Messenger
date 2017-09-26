/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.CreditLogInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//积分日志表
@Service(value = "CreditsData")
public class Credits extends DataService
{
	

	//region  积分日志表方法
	
	/**
	* 获得积分日志表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetCreditLogCount(String condition) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetCreditLogCount(condition);
	}

	/**
	* 创建一条积分日志表数据
	* @param creditlogInfo 积分日志表模型
	* @return 返回创建信息
	**/	 
	public int CreateCreditLog(CreditLogInfo creditlogInfo) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateCreditLog(creditlogInfo);
	}

	/**
	* 更新一条积分日志表数据
	* @param creditlogInfo 积分日志表模型
	**/
	public void UpdateCreditLog(CreditLogInfo creditlogInfo) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateCreditLog(creditlogInfo);
	}

	/**
	* 删除一条积分日志表数据
	* @param logid 积分日志表模型
	**/
	public void DeleteCreditLogByLogId(int  logid) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteCreditLogByLogId(logid);
	}
		/**
	* 批量删除一批积分日志表数据
	**/
	public void DeleteCreditLogListByLogId(String logidList ) throws IOException { 
		getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteCreditLogByLogIdList(logidList );
	}
	
	/**
	* 获取一条积分日志表数据
	* @param logid 积分日志表模型
	**/
	 public CreditLogInfo GetCreditLogByLogId(int logid) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetCreditLogByLogId(logid);
	}



	
	/**
	* 获得积分日志表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回CreditLogInfo
	**/
	public List<CreditLogInfo> GetCreditLogList(String condition,String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetCreditLogList(condition,sort);
	}
	

			
	/**
	* 获得积分日志表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回CreditLogInfo
	**/
	public List<CreditLogInfo> GetCreditLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiUserStrategy().GetCreditLogList(pageSize,pageNumber,condition,sort);
	}
	


	//endregion
   
}
