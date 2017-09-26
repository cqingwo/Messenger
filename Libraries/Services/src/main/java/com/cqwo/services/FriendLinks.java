/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.services;

import com.cqwo.core.domain.FriendLinkInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */

//友情链接表
@Service
public class FriendLinks {
    @Resource(name = "FriendLinksData")
    com.cqwo.data.FriendLinks friendlinks;


    //region  条友情链接表方法

    /**
     * 获得友情链接表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetFriendLinkCount(String condition) throws IOException {
        return friendlinks.GetFriendLinkCount(condition);
    }

    /**
     * 创建一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     * @return 返回创建信息
     **/
    public int CreateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException {
        return friendlinks.CreateFriendLink(friendlinkInfo);
    }

    /**
     * 更新一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     **/
    public void UpdateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException {
        friendlinks.UpdateFriendLink(friendlinkInfo);
    }

    /**
     * 删除一条友情链接表数据
     *
     * @param id 友情链接表模型
     **/
    public void DeleteFriendLinkByid(int id) throws IOException {
        friendlinks.DeleteFriendLinkByid(id);
    }

    /**
     * 批量删除一批友情链接表数据
     **/
    public void DeleteFriendLinkByidList(String idList) throws IOException {
        friendlinks.DeleteFriendLinkByidList(idList);
    }

    /**
     * 获取一条友情链接表数据
     *
     * @param id 友情链接表模型
     **/
    public FriendLinkInfo GetFriendLinkByid(int id) throws IOException {
        return friendlinks.GetFriendLinkByid(id);
    }


    /**
     * 获得友情链接表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回FriendLinkInfo
     **/
    public List<FriendLinkInfo> GetFriendLinkList(String condition, String sort) throws IOException {
        return friendlinks.GetFriendLinkList(condition, sort);
    }


    /**
     * 获得友情链接表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回FriendLinkInfo
     **/
    public List<FriendLinkInfo> GetFriendLinkList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return friendlinks.GetFriendLinkList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}
