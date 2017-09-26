/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//用户等级表
public class UserRankInfo  implements Serializable {

		/**
	*用户等级id
	**/
	private int userrid; 
		/**
	*是否为系统等级
	**/
	private int system; 
		/**
	*标题
	**/
	private String title;
		/**
	*头像
	**/
	private String avatar;
		/**
	*积分下限
	**/
	private int creditslower; 
		/**
	*积分上限
	**/
	private int creditsupper; 
		/**
	*限制天数
	**/
	private int limitdays;

	public UserRankInfo(int userrid, int system, String title, String avatar, int creditslower, int creditsupper, int limitdays) {
		this.userrid = userrid;
		this.system = system;
		this.title = title;
		this.avatar = avatar;
		this.creditslower = creditslower;
		this.creditsupper = creditsupper;
		this.limitdays = limitdays;
	}

	public UserRankInfo() {
	}

	public int getUserrid() {
		return userrid;
	}

	public void setUserrid(int userrid) {
		this.userrid = userrid;
	}

	public int getSystem() {
		return system;
	}

	public void setSystem(int system) {
		this.system = system;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getCreditslower() {
		return creditslower;
	}

	public void setCreditslower(int creditslower) {
		this.creditslower = creditslower;
	}

	public int getCreditsupper() {
		return creditsupper;
	}

	public void setCreditsupper(int creditsupper) {
		this.creditsupper = creditsupper;
	}

	public int getLimitdays() {
		return limitdays;
	}

	public void setLimitdays(int limitdays) {
		this.limitdays = limitdays;
	}

	@Override
	public String toString() {
		return "UserRankInfo{" +
				"userrid=" + userrid +
				", system=" + system +
				", title='" + title + '\'' +
				", avatar='" + avatar + '\'' +
				", creditslower=" + creditslower +
				", creditsupper=" + creditsupper +
				", limitdays=" + limitdays +
				'}';
	}
}
