/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.log;

import org.apache.commons.logging.LogFactory;

/**
 *
 *@author Administrator
 *2013-12-22
 * 
 */
public class ILogService {
	/**
	 * 
	 * @param o
	 * @return
	 */
	public static ILog getLog(Object o){
		ILog log = new MonLog(LogFactory.getLog(o.getClass()));
		return  log; //日志
	}
	public static ILog getLog(Class ClassName){
		ILog log = new MonLog(LogFactory.getLog(ClassName));
		return  log;
	}
}
