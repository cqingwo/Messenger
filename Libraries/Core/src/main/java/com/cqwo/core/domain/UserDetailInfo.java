/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;


import java.io.Serializable;
import java.util.Date;

//用户详细信息表
public class UserDetailInfo  implements Serializable {

		/**
	*用户id
	**/
	private int uid; 
		/**
	*最后访问时间
	**/
	private Date lastvisittime;
		/**
	*最后访问ip
	**/
	private String lastvisitip;
		/**
	*最后访问区域id
	**/
	private int lastvisitrgid; 
		/**
	*注册时间
	**/
	private Date registertime;
		/**
	*注册ip
	**/
	private String registerip;
		/**
	*注册区域id
	**/
	private int registerrgid; 
		/**
	*性别
	**/
	private int gender; 
		/**
	*真实姓名
	**/
	private String realname;
		/**
	*出生日期
	**/
	private Date bday;
		/**
	*身份证号
	**/
	private String idcard;
		/**
	*所在区域id
	**/
	private int regionid; 
		/**
	*详细地址
	**/
	private String address;
		/**
	*简介
	**/
	private String bio;

	public UserDetailInfo(int uid, Date lastvisittime, String lastvisitip, int lastvisitrgid, Date registertime, String registerip, int registerrgid, int gender, String realname, Date bday, String idcard, int regionid, String address, String bio) {
		this.uid = uid;
		this.lastvisittime = lastvisittime;
		this.lastvisitip = lastvisitip;
		this.lastvisitrgid = lastvisitrgid;
		this.registertime = registertime;
		this.registerip = registerip;
		this.registerrgid = registerrgid;
		this.gender = gender;
		this.realname = realname;
		this.bday = bday;
		this.idcard = idcard;
		this.regionid = regionid;
		this.address = address;
		this.bio = bio;
	}

	public UserDetailInfo() {
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Date getLastvisittime() {
		return lastvisittime;
	}

	public void setLastvisittime(Date lastvisittime) {
		this.lastvisittime = lastvisittime;
	}

	public String getLastvisitip() {
		return lastvisitip;
	}

	public void setLastvisitip(String lastvisitip) {
		this.lastvisitip = lastvisitip;
	}

	public int getLastvisitrgid() {
		return lastvisitrgid;
	}

	public void setLastvisitrgid(int lastvisitrgid) {
		this.lastvisitrgid = lastvisitrgid;
	}

	public Date getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	public String getRegisterip() {
		return registerip;
	}

	public void setRegisterip(String registerip) {
		this.registerip = registerip;
	}

	public int getRegisterrgid() {
		return registerrgid;
	}

	public void setRegisterrgid(int registerrgid) {
		this.registerrgid = registerrgid;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getBday() {
		return bday;
	}

	public void setBday(Date bday) {
		this.bday = bday;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public int getRegionid() {
		return regionid;
	}

	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "UserDetailInfo{" +
				"uid=" + uid +
				", lastvisittime=" + lastvisittime +
				", lastvisitip='" + lastvisitip + '\'' +
				", lastvisitrgid=" + lastvisitrgid +
				", registertime=" + registertime +
				", registerip='" + registerip + '\'' +
				", registerrgid=" + registerrgid +
				", gender=" + gender +
				", realname='" + realname + '\'' +
				", bday=" + bday +
				", idcard='" + idcard + '\'' +
				", regionid=" + regionid +
				", address='" + address + '\'' +
				", bio='" + bio + '\'' +
				'}';
	}
}
