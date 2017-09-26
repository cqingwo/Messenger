/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//开放授权表
public class OauthInfo  implements Serializable {

		/**
	*自增id
	**/
	private int id; 
		/**
	*用户id
	**/
	private int uid; 
		/**
	*开放id
	**/
	private String openid;
		/**
	*服务商
	**/
	private String server;

	public OauthInfo(int id, int uid, String openid, String server) {
		this.id = id;
		this.uid = uid;
		this.openid = openid;
		this.server = server;
	}

	public OauthInfo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	@Override
	public String toString() {
		return "OauthInfo{" +
				"id=" + id +
				", uid=" + uid +
				", openid='" + openid + '\'' +
				", server='" + server + '\'' +
				'}';
	}
}
