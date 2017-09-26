/*
 * Copyright (C) 2017. 
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.data;

import com.cqwo.core.domain.OauthInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//开放授权表
@Service(value = "OauthsData")
public class Oauths extends DataService {


    //region  开放授权表方法

    /**
     * 获得开放授权表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetOauthCount(String condition) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOauthCount(condition);
    }

    /**
     * 创建一条开放授权表数据
     *
     * @param oauthInfo 开放授权表模型
     * @return 返回创建信息
     **/
    public int CreateOauth(OauthInfo oauthInfo) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().CreateOauth(oauthInfo);
    }

    /**
     * 更新一条开放授权表数据
     *
     * @param oauthInfo 开放授权表模型
     **/
    public void UpdateOauth(OauthInfo oauthInfo) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().UpdateOauth(oauthInfo);
    }

    /**
     * 删除一条开放授权表数据
     *
     * @param id 开放授权表模型
     **/
    public void DeleteOauthById(int id) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteOauthById(id);
    }

    /**
     * 批量删除一批开放授权表数据
     **/
    public void DeleteOauthListById(String idList) throws IOException {
        getCwmData().getIrdbsStrategy().getiUserStrategy().DeleteOauthListById(idList);
    }

    /**
     * 获取一条开放授权表数据
     *
     * @param id 开放授权表模型
     **/
    public OauthInfo GetOauthById(int id) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOauthById(id);
    }


    /**
     * 获得开放授权表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OauthInfo
     **/
    public List<OauthInfo> GetOauthList(String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOauthList(condition, sort);
    }


    /**
     * 获得开放授权表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回OauthInfo
     **/
    public List<OauthInfo> GetOauthList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        return getCwmData().getIrdbsStrategy().getiUserStrategy().GetOauthList(pageSize, pageNumber, condition, sort);
    }


    //endregion

}

