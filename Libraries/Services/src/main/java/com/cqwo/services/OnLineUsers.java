/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.OnlineTimeInfo;
import com.cqwo.core.domain.OnlineUserInfo;
import com.cqwo.data.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//在线用户表
@Service
public class OnLineUsers extends DataService {
    @Resource(name = "OnlineusersData")
    com.cqwo.data.OnLineUsers onlineusers;


    //region  条在线用户表方法

    /**
     * 获得在线用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetOnlineuserCount(String condition) throws IOException {
        return onlineusers.GetOnlineuserCount(condition);
    }

    /**
     * 创建一条在线用户表数据
     *
     * @param onlineUserInfo 在线用户表模型
     * @return 返回创建信息
     **/
    public int CreateOnlineuser(OnlineUserInfo onlineUserInfo) throws IOException {
        return onlineusers.CreateOnlineuser(onlineUserInfo);
    }

    /**
     * 更新一条在线用户表数据
     *
     * @param onlineUserInfo 在线用户表模型
     **/
    public void UpdateOnlineuser(OnlineUserInfo onlineUserInfo) throws IOException {
        onlineusers.UpdateOnlineuser(onlineUserInfo);
    }

    /**
     * 删除一条在线用户表数据
     *
     * @param olid 在线用户表模型
     **/
    public void DeleteOnlineuserByOlId(int olid) throws IOException {
        onlineusers.DeleteOnlineuserByOlId(olid);
    }

    /**
     * 批量删除一批在线用户表数据
     **/
    public void DeleteOnlineuserListByOlId(String olidList) throws IOException {
        onlineusers.DeleteOnlineuserListByOlId(olidList);
    }

    /**
     * 获取一条在线用户表数据
     *
     * @param olid 在线用户表模型
     **/
    public OnlineUserInfo GetOnlineuserByOlId(int olid) throws IOException {
        return onlineusers.GetOnlineuserByOlId(olid);
    }


    /**
     * 获得在线用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnlineUserInfo
     **/
    public List<OnlineUserInfo> GetOnlineuserList(String condition, String sort) throws IOException {
        return onlineusers.GetOnlineuserList(condition, sort);
    }


    /**
     * 获得在线用户表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回OnlineUserInfo
     **/
    public List<OnlineUserInfo> GetOnlineuserList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return onlineusers.GetOnlineuserList(pageSize, pageNumber, condition, sort);
    }


    //endregion
    //region  条在线时间表方法

    /**
     * 获得在线时间表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetOnlinetimeCount(String condition) throws IOException {
        return onlineusers.GetOnlinetimeCount(condition);
    }

    /**
     * 创建一条在线时间表数据
     *
     * @param onLineTimeInfo 在线时间表模型
     * @return 返回创建信息
     **/
    public int CreateOnlinetime(OnlineTimeInfo onLineTimeInfo) throws IOException {
        return onlineusers.CreateOnlinetime(onLineTimeInfo);
    }

    /**
     * 更新一条在线时间表数据
     *
     * @param OnlineTimeInfo 在线时间表模型
     **/
    public void UpdateOnlinetime(OnlineTimeInfo OnlineTimeInfo) throws IOException {
        onlineusers.UpdateOnlinetime(OnlineTimeInfo);
    }

    /**
     * 删除一条在线时间表数据
     *
     * @param uid 在线时间表模型
     **/
    public void DeleteOnlinetimeByUid(int uid) throws IOException {
        onlineusers.DeleteOnlinetimeByUid(uid);
    }

    /**
     * 批量删除一批在线时间表数据
     **/
    public void DeleteOnlinetimeListByUid(String uidList) throws IOException {
        onlineusers.DeleteOnlinetimeListByUid(uidList);
    }

    /**
     * 获取一条在线时间表数据
     *
     * @param uid 在线时间表模型
     **/
    public OnlineTimeInfo GetOnlinetimeByUid(int uid) throws IOException {
        return onlineusers.GetOnlinetimeByUid(uid);
    }


    /**
     * 获得在线时间表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnLineTimeInfo
     **/
    public List<OnlineTimeInfo> GetOnlinetimeList(String condition, String sort) throws IOException {
        return onlineusers.GetOnlinetimeList(condition, sort);
    }


    /**
     * 获得在线时间表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回OnLineTimeInfo
     **/
    public List<OnlineTimeInfo> GetOnlinetimeList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return onlineusers.GetOnlinetimeList(pageSize, pageNumber, condition, sort);
    }


    //endregion
}

