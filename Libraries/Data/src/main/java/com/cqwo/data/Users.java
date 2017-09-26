/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.UserDetailInfo;
import com.cqwo.core.domain.UserInfo;
import com.cqwo.core.domain.UserRankInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//用户表
@Service(value = "UsersData")
public class Users extends DataService {


    //region  用户表方法

    /**
     * 获得用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserCount(condition);
    }

    /**
     * 创建一条用户表数据
     *
     * @param userInfo 用户表模型
     * @return 返回创建信息
     **/
    public int CreateUser(UserInfo userInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateUser(userInfo);
    }

    /**
     * 更新一条用户表数据
     *
     * @param userInfo 用户表模型
     **/
    public void UpdateUser(UserInfo userInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateUser(userInfo);
    }

    /**
     * 删除一条用户表数据
     *
     * @param uid 用户表模型
     **/
    public void DeleteUserByUid(int uid) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteUserByUid(uid);
    }

    /**
     * 批量删除一批用户表数据
     **/
    public void DeleteUserListByUid(String uidList) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteUserListByUid(uidList);
    }

    /**
     * 获取一条用户表数据
     *
     * @param uid 用户表模型
     **/
    public UserInfo GetUserByUid(int uid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserByUid(uid);
    }


    /**
     * 获得用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserInfo
     **/
    public List<UserInfo> GetUserList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserList(condition, sort);
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
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserList(pageSize, pageNumber, condition, sort);
    }


    //endregion
    //region  用户详细信息表方法

    /**
     * 获得用户详细信息表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserdetailCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserdetailCount(condition);
    }

    /**
     * 创建一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     * @return 返回创建信息
     **/
    public int CreateUserdetail(UserDetailInfo UserDetailInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateUserdetail(UserDetailInfo);
    }

    /**
     * 更新一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     **/
    public void UpdateUserdetail(UserDetailInfo UserDetailInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateUserdetail(UserDetailInfo);
    }

    /**

     **/
    public void DeleteUserdetailByUid(int uid) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteUserdetailByUid(uid);
    }

    /**
     * 批量删除一批用户详细信息表数据
     **/
    public void DeleteUserdetailListByUid(String uidList) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteUserdetailListByUid(uidList);
    }

    /**
     * 获取一条用户详细信息表数据
     **/
    public UserDetailInfo GetUserdetailByUid(int uid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserdetailByUid(uid);
    }


    /**
     * 获得用户详细信息表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserDetailInfo
     **/
    public List<UserDetailInfo> GetUserdetailList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserdetailList(condition, sort);
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
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserdetailList(pageSize, pageNumber, condition, sort);
    }


    //endregion

    //region  用户等级表方法

    /**
     * 获得用户等级表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserrankCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserrankCount(condition);
    }

    /**
     * 创建一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     * @return 返回创建信息
     **/
    public int CreateUserrank(UserRankInfo UserRankInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateUserrank(UserRankInfo);
    }

    /**
     * 更新一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     **/
    public void UpdateUserrank(UserRankInfo UserRankInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateUserrank(UserRankInfo);
    }

    /**
     * 删除一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    public void DeleteUserrankByUserrId(int userrid) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteUserrankByUserrId(userrid);
    }

    /**
     * 批量删除一批用户等级表数据
     **/
    public void DeleteUserrankListByUserrId(String userridList) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteUserrankListByUserrId(userridList);
    }

    /**
     * 获取一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    public UserRankInfo GetUserrankByUserrId(int userrid) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserrankByUserrId(userrid);
    }


    /**
     * 获得用户等级表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserRankInfo
     **/
    public List<UserRankInfo> GetUserrankList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserrankList(condition, sort);
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
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetUserrankList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}

