/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.UserDetailInfo;
import com.cqwo.core.domain.UserInfo;
import com.cqwo.core.domain.UserRankInfo;
import com.cqwo.data.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//用户表
@Service
public class Users extends DataService {
    @Resource(name = "UsersData")
    com.cqwo.data.Users users;


    //region  条用户表方法

    /**
     * 获得用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserCount(String condition) throws IOException {
        return users.GetUserCount(condition);
    }

    /**
     * 创建一条用户表数据
     *
     * @param userInfo 用户表模型
     * @return 返回创建信息
     **/
    public int CreateUser(UserInfo userInfo) throws IOException {
        return users.CreateUser(userInfo);
    }

    /**
     * 更新一条用户表数据
     *
     * @param userInfo 用户表模型
     **/
    public void UpdateUser(UserInfo userInfo) throws IOException {
        users.UpdateUser(userInfo);
    }

    /**
     * 删除一条用户表数据
     *
     * @param uid 用户表模型
     **/
    public void DeleteUserByUid(int uid) throws IOException {
        users.DeleteUserByUid(uid);
    }

    /**
     * 批量删除一批用户表数据
     **/
    public void DeleteUserListByUid(String uidList) throws IOException {
        users.DeleteUserListByUid(uidList);
    }

    /**
     * 获取一条用户表数据
     *
     * @param uid 用户表模型
     **/
    public UserInfo GetUserByUid(int uid) throws IOException {
        return users.GetUserByUid(uid);
    }


    /**
     * 获得用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserInfo
     **/
    public List<UserInfo> GetUserList(String condition, String sort) throws IOException {
        return users.GetUserList(condition, sort);
    }


    /**
     * 获得用户表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回UserInfo
     **/
    public List<UserInfo> GetUserList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return users.GetUserList(pageSize, pageNumber, condition, sort);
    }


    //endregion

    //region  条用户详细信息表方法

    /**
     * 获得用户详细信息表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserdetailCount(String condition) throws IOException {
        return users.GetUserdetailCount(condition);
    }

    /**
     * 创建一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     * @return 返回创建信息
     **/
    public int CreateUserdetail(UserDetailInfo UserDetailInfo) throws IOException {
        return users.CreateUserdetail(UserDetailInfo);
    }

    /**
     * 更新一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     **/
    public void UpdateUserdetail(UserDetailInfo UserDetailInfo) throws IOException {
        users.UpdateUserdetail(UserDetailInfo);
    }

    /**
     * 删除一条用户详细信息表数据
     *
     * @param uid 用户详细信息表模型
     **/
    public void DeleteUserdetailByUid(int uid) throws IOException {
        users.DeleteUserdetailByUid(uid);
    }

    /**
     * 批量删除一批用户详细信息表数据
     **/
    public void DeleteUserdetailListByUid(String uidList) throws IOException {
        users.DeleteUserdetailListByUid(uidList);
    }

    /**
     * 获取一条用户详细信息表数据
     *
     * @param uid 用户详细信息表模型
     **/
    public UserDetailInfo GetUserdetailByUid(int uid) throws IOException {
        return users.GetUserdetailByUid(uid);
    }


    /**
     * 获得用户详细信息表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserDetailInfo
     **/
    public List<UserDetailInfo> GetUserdetailList(String condition, String sort) throws IOException {
        return users.GetUserdetailList(condition, sort);
    }


    /**
     * 获得用户详细信息表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回UserDetailInfo
     **/
    public List<UserDetailInfo> GetUserdetailList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return users.GetUserdetailList(pageSize, pageNumber, condition, sort);
    }


    //endregion

    //region  条用户等级表方法

    /**
     * 获得用户等级表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserrankCount(String condition) throws IOException {
        return users.GetUserrankCount(condition);
    }

    /**
     * 创建一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     * @return 返回创建信息
     **/
    public int CreateUserrank(UserRankInfo UserRankInfo) throws IOException {
        return users.CreateUserrank(UserRankInfo);
    }

    /**
     * 更新一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     **/
    public void UpdateUserrank(UserRankInfo UserRankInfo) throws IOException {
        users.UpdateUserrank(UserRankInfo);
    }

    /**
     * 删除一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    public void DeleteUserrankByUserrId(int userrid) throws IOException {
        users.DeleteUserrankByUserrId(userrid);
    }

    /**
     * 批量删除一批用户等级表数据
     **/
    public void DeleteUserrankListByUserrId(String userridList) throws IOException {
        users.DeleteUserrankListByUserrId(userridList);
    }

    /**
     * 获取一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    public UserRankInfo GetUserrankByUserrId(int userrid) throws IOException {
        return users.GetUserrankByUserrId(userrid);
    }


    /**
     * 获得用户等级表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserRankInfo
     **/
    public List<UserRankInfo> GetUserrankList(String condition, String sort) throws IOException {
        return users.GetUserrankList(condition, sort);
    }


    /**
     * 获得用户等级表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回UserRankInfo
     **/
    public List<UserRankInfo> GetUserrankList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return users.GetUserrankList(pageSize, pageNumber, condition, sort);
    }


    //endregion
}

