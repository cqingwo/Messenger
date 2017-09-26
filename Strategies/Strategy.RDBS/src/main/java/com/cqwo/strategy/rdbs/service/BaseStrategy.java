/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.rdbs.service;

import com.cqwo.core.data.rdbs.info.IBaseStrategy;
import com.cqwo.core.domain.*;
import com.cqwo.strategy.rdbs.dao.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/19.
 */
public class BaseStrategy extends BaseService implements IBaseStrategy {

    //region 广告表

    /**
     * 获得广告表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetAdvertCount(String condition) throws IOException {
        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        int count = advertDao.GetAdvertCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条广告表数据
     *
     * @param advertInfo 广告表模型
     * @return 返回创建信息
     **/
    public int CreateAdvert(AdvertInfo advertInfo) throws IOException {
        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        advertDao.CreateAdvert(advertInfo);
        close();
        return 1;
    }


    /**
     * 更新一条广告表数据
     *
     * @param advertInfo 广告表模型
     **/
    public int UpdateAdvert(AdvertInfo advertInfo) throws IOException {
        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        advertDao.UpdateAdvert(advertInfo);
        close();
        return 1;
    }


    /**
     * 删除一条广告表数据
     *
     * @param adid 广告表模型
     **/
    public void DeleteAdvertByAdId(int adid) throws IOException {

        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        advertDao.DeleteAdvertByAdId(adid);
        close();
    }

    /**
     * 批量删除一批广告表数据
     **/
    public void DeleteAdvertByAdIdList(String adidlist) throws IOException {
        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        //advertDao.DeleteAdvertListByAdId(adidlist);
        close();

    }

    /**
     * 获得广告表一条记录
     *
     * @param adid adid
     * @return 返回一条AdvertInfo
     **/
    public AdvertInfo GetAdvertByAdId(int adid) throws IOException {
        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        AdvertInfo advertInfo = advertDao.GetAdvertByAdId(adid);
        close();
        return advertInfo;
    }


    /**
     * 获得广告表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdvertInfo
     **/
    public List<AdvertInfo> GetAdvertList(String condition, String sort) throws IOException {
        return GetAdvertList(1, 200, condition, sort);

    }


    /**
     * 获得广告表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdvertInfo
     **/
    public List<AdvertInfo> GetAdvertList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        AdvertDao advertDao = sqlSession.getMapper(AdvertDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<AdvertInfo> advertList = advertDao.GetAdvertList(pageSize, count, condition, sort);

        close();
        return advertList;
    }

    //endregion

    //region 广告位置表

    /**
     * 获得广告位置表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetAdvertPositionCount(String condition) throws IOException {
        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        int count = advertpositionDao.GetAdvertPositionCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条广告位置表数据
     *
     * @param advertpositionInfo 广告位置表模型
     * @return 返回创建信息
     **/
    public int CreateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException {
        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        advertpositionDao.CreateAdvertPosition(advertpositionInfo);
        close();
        return 1;
    }


    /**
     * 更新一条广告位置表数据
     *
     * @param advertpositionInfo 广告位置表模型
     **/
    public int UpdateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException {
        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        advertpositionDao.UpdateAdvertPosition(advertpositionInfo);
        close();
        return 1;
    }


    /**
     * 删除一条广告位置表数据
     *
     * @param adposid 广告位置表模型
     **/
    public void DeleteAdvertPositionByAdPosId(int adposid) throws IOException {

        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        advertpositionDao.DeleteAdvertPositionByAdPosId(adposid);
        close();
    }

    /**
     * 批量删除一批广告位置表数据
     **/
    public void DeleteAdvertPositionByAdPosIdList(String adposidlist) throws IOException {
        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        advertpositionDao.DeleteAdvertPositionByAdPosIdList(adposidlist);
        close();

    }

    /**
     * 获得广告位置表一条记录
     *
     * @param adposid adposid
     * @return 返回一条AdvertPositionInfo
     **/
    public AdvertPositionInfo GetAdvertPositionByAdPosId(int adposid) throws IOException {
        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        AdvertPositionInfo advertpositionInfo = advertpositionDao.GetAdvertPositionByAdPosId(adposid);
        close();
        return advertpositionInfo;
    }


    /**
     * 获得广告位置表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdvertPositionInfo
     **/
    public List<AdvertPositionInfo> GetAdvertPositionList(String condition, String sort) throws IOException {
        return GetAdvertPositionList(1, 200, condition, sort);

    }


    /**
     * 获得广告位置表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdvertPositionInfo
     **/
    public List<AdvertPositionInfo> GetAdvertPositionList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        AdvertPositionDao advertpositionDao = sqlSession.getMapper(AdvertPositionDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<AdvertPositionInfo> advertpositionList = advertpositionDao.GetAdvertPositionList(pageSize, count, condition, sort);

        close();
        return advertpositionList;
    }

    //endregion

    //region 禁止ip表

    /**
     * 获得禁止ip表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetBannedIPCount(String condition) throws IOException {
        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        int count = bannedipDao.GetBannedIPCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条禁止ip表数据
     *
     * @param bannedipInfo 禁止ip表模型
     * @return 返回创建信息
     **/
    public int CreateBannedIP(BannedIPInfo bannedipInfo) throws IOException {
        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        bannedipDao.CreateBannedIP(bannedipInfo);
        close();
        return 1;
    }


    /**
     * 更新一条禁止ip表数据
     *
     * @param bannedipInfo 禁止ip表模型
     **/
    public int UpdateBannedIP(BannedIPInfo bannedipInfo) throws IOException {
        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        bannedipDao.UpdateBannedIP(bannedipInfo);
        close();
        return 1;
    }


    /**
     * 删除一条禁止ip表数据
     *
     * @param id 禁止ip表模型
     **/
    public void DeleteBannedIPById(int id) throws IOException {

        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        bannedipDao.DeleteBannedIPById(id);
        close();
    }

    /**
     * 批量删除一批禁止ip表数据
     **/
    public void DeleteBannedIPByIdList(String idlist) throws IOException {
        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        bannedipDao.DeleteBannedIPByIdList(idlist);
        close();

    }

    /**
     * 获得禁止ip表一条记录
     *
     * @param id id
     * @return 返回一条BannedIPInfo
     **/
    public BannedIPInfo GetBannedIPById(int id) throws IOException {
        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        BannedIPInfo bannedipInfo = bannedipDao.GetBannedIPById(id);
        close();
        return bannedipInfo;
    }


    /**
     * 获得禁止ip表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回BannedIPInfo
     **/
    public List<BannedIPInfo> GetBannedIPList(String condition, String sort) throws IOException {
        return GetBannedIPList(1, 200, condition, sort);

    }


    /**
     * 获得禁止ip表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回BannedIPInfo
     **/
    public List<BannedIPInfo> GetBannedIPList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        BannedIPDao bannedipDao = sqlSession.getMapper(BannedIPDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<BannedIPInfo> bannedipList = bannedipDao.GetBannedIPList(pageSize, count, condition, sort);

        close();
        return bannedipList;
    }

    //endregion

    //region 事件日志表

    /**
     * 获得事件日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetEventLogCount(String condition) throws IOException {
        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        int count = eventlogDao.GetEventLogCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条事件日志表数据
     *
     * @param eventlogInfo 事件日志表模型
     * @return 返回创建信息
     **/
    public int CreateEventLog(EventLogInfo eventlogInfo) throws IOException {
        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        eventlogDao.CreateEventLog(eventlogInfo);
        close();
        return 1;
    }


    /**
     * 更新一条事件日志表数据
     *
     * @param eventlogInfo 事件日志表模型
     **/
    public int UpdateEventLog(EventLogInfo eventlogInfo) throws IOException {
        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        eventlogDao.UpdateEventLog(eventlogInfo);
        close();
        return 1;
    }


    /**
     * 删除一条事件日志表数据
     *
     * @param id 事件日志表模型
     **/
    public void DeleteEventLogById(int id) throws IOException {

        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        eventlogDao.DeleteEventLogById(id);
        close();
    }

    /**
     * 批量删除一批事件日志表数据
     **/
    public void DeleteEventLogByIdList(String idlist) throws IOException {
        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        eventlogDao.DeleteEventLogByIdList(idlist);
        close();

    }

    /**
     * 获得事件日志表一条记录
     *
     * @param id id
     * @return 返回一条EventLogInfo
     **/
    public EventLogInfo GetEventLogById(int id) throws IOException {
        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        EventLogInfo eventlogInfo = eventlogDao.GetEventLogById(id);
        close();
        return eventlogInfo;
    }


    /**
     * 获得事件日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回EventLogInfo
     **/
    public List<EventLogInfo> GetEventLogList(String condition, String sort) throws IOException {
        return GetEventLogList(1, 200, condition, sort);

    }


    /**
     * 获得事件日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回EventLogInfo
     **/
    public List<EventLogInfo> GetEventLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        EventLogDao eventlogDao = sqlSession.getMapper(EventLogDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<EventLogInfo> eventlogList = eventlogDao.GetEventLogList(pageSize, count, condition, sort);

        close();
        return eventlogList;
    }

    //endregion

    //region 筛选词表

    /**
     * 获得筛选词表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetFilterWordCount(String condition) throws IOException {
        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        int count = filterwordDao.GetFilterWordCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     * @return 返回创建信息
     **/
    public int CreateFilterWord(FilterWordInfo filterwordInfo) throws IOException {
        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        filterwordDao.CreateFilterWord(filterwordInfo);
        close();
        return 1;
    }


    /**
     * 更新一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     **/
    public int UpdateFilterWord(FilterWordInfo filterwordInfo) throws IOException {
        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        filterwordDao.UpdateFilterWord(filterwordInfo);
        close();
        return 1;
    }


    /**
     * 删除一条筛选词表数据
     *
     * @param id 筛选词表模型
     **/
    public void DeleteFilterWordById(int id) throws IOException {

        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        filterwordDao.DeleteFilterWordById(id);
        close();
    }

    /**
     * 批量删除一批筛选词表数据
     **/
    public void DeleteFilterWordByIdList(String idlist) throws IOException {
        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        filterwordDao.DeleteFilterWordByIdList(idlist);
        close();

    }

    /**
     * 获得筛选词表一条记录
     *
     * @param id id
     * @return 返回一条FilterWordInfo
     **/
    public FilterWordInfo GetFilterWordById(int id) throws IOException {
        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        FilterWordInfo filterwordInfo = filterwordDao.GetFilterWordById(id);
        close();
        return filterwordInfo;
    }


    /**
     * 获得筛选词表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回FilterWordInfo
     **/
    public List<FilterWordInfo> GetFilterWordList(String condition, String sort) throws IOException {
        return GetFilterWordList(200, 1, condition, sort);

    }


    /**
     * 获得筛选词表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回FilterWordInfo
     **/
    public List<FilterWordInfo> GetFilterWordList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        FilterWordDao filterwordDao = sqlSession.getMapper(FilterWordDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<FilterWordInfo> filterwordList = filterwordDao.GetFilterWordList(pageSize, count, condition, sort);

        close();
        return filterwordList;
    }

    //endregion

    //region 友情链接表

    /**
     * 获得友情链接表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetFriendLinkCount(String condition) throws IOException {
        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        int count = friendlinkDao.GetFriendLinkCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     * @return 返回创建信息
     **/
    public int CreateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException {
        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        friendlinkDao.CreateFriendLink(friendlinkInfo);
        close();
        return 1;
    }


    /**
     * 更新一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     **/
    public int UpdateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException {
        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        friendlinkDao.UpdateFriendLink(friendlinkInfo);
        close();
        return 1;
    }


    /**
     * 删除一条友情链接表数据
     *
     * @param id 友情链接表模型
     **/
    public void DeleteFriendLinkByid(int id) throws IOException {

        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        friendlinkDao.DeleteFriendLinkByid(id);
        close();
    }

    /**
     * 批量删除一批友情链接表数据
     **/
    public void DeleteFriendLinkByidList(String idlist) throws IOException {
        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        friendlinkDao.DeleteFriendLinkByidList(idlist);
        close();

    }

    /**
     * 获得友情链接表一条记录
     *
     * @param id id
     * @return 返回一条FriendLinkInfo
     **/
    public FriendLinkInfo GetFriendLinkByid(int id) throws IOException {
        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        FriendLinkInfo friendlinkInfo = friendlinkDao.GetFriendLinkByid(id);
        close();
        return friendlinkInfo;
    }


    /**
     * 获得友情链接表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回FriendLinkInfo
     **/
    public List<FriendLinkInfo> GetFriendLinkList(String condition, String sort) throws IOException {
        return GetFriendLinkList(200, 1, condition, sort);

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
        connection();
        FriendLinkDao friendlinkDao = sqlSession.getMapper(FriendLinkDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<FriendLinkInfo> friendlinkList = friendlinkDao.GetFriendLinkList(pageSize, count, condition, sort);

        close();
        return friendlinkList;
    }

    //endregion

    //region 帮助表

    /**
     * 获得帮助表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetHelpCount(String condition) throws IOException {
        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        int count = helpDao.GetHelpCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     * @return 返回创建信息
     **/
    public int CreateHelp(HelpInfo helpInfo) throws IOException {
        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        helpDao.CreateHelp(helpInfo);
        close();
        return 1;
    }


    /**
     * 更新一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     **/
    public int UpdateHelp(HelpInfo helpInfo) throws IOException {
        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        helpDao.UpdateHelp(helpInfo);
        close();
        return 1;
    }


    /**
     * 删除一条帮助表数据
     *
     * @param id 帮助表模型
     **/
    public void DeleteHelpByid(int id) throws IOException {

        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        helpDao.DeleteHelpByid(id);
        close();
    }

    /**
     * 批量删除一批帮助表数据
     **/
    public void DeleteHelpByidList(String idlist) throws IOException {
        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        helpDao.DeleteHelpByidList(idlist);
        close();

    }

    /**
     * 获得帮助表一条记录
     *
     * @param id id
     * @return 返回一条HelpInfo
     **/
    public HelpInfo GetHelpByid(int id) throws IOException {
        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        HelpInfo helpInfo = helpDao.GetHelpByid(id);
        close();
        return helpInfo;
    }


    /**
     * 获得帮助表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回HelpInfo
     **/
    public List<HelpInfo> GetHelpList(String condition, String sort) throws IOException {
        return GetHelpList(200, 1, condition, sort);

    }


    /**
     * 获得帮助表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回HelpInfo
     **/
    public List<HelpInfo> GetHelpList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        HelpDao helpDao = sqlSession.getMapper(HelpDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<HelpInfo> helpList = helpDao.GetHelpList(pageSize, count, condition, sort);

        close();
        return helpList;
    }

    //endregion

    //region 导航表

    /**
     * 获得导航表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetNavCount(String condition) throws IOException {
        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        int count = navDao.GetNavCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条导航表数据
     *
     * @param navInfo 导航表模型
     * @return 返回创建信息
     **/
    public int CreateNav(NavInfo navInfo) throws IOException {
        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        navDao.CreateNav(navInfo);
        close();
        return 1;
    }


    /**
     * 更新一条导航表数据
     *
     * @param navInfo 导航表模型
     **/
    public int UpdateNav(NavInfo navInfo) throws IOException {
        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        navDao.UpdateNav(navInfo);
        close();
        return 1;
    }


    /**
     * 删除一条导航表数据
     *
     * @param id 导航表模型
     **/
    public void DeleteNavById(int id) throws IOException {

        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        navDao.DeleteNavById(id);
        close();
    }

    /**
     * 批量删除一批导航表数据
     **/
    public void DeleteNavListById(String idlist) throws IOException {
        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        navDao.DeleteNavListById(idlist);
        close();

    }

    /**
     * 获得导航表一条记录
     *
     * @param id id
     * @return 返回一条NavInfo
     **/
    public NavInfo GetNavById(int id) throws IOException {
        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        NavInfo navInfo = navDao.GetNavById(id);
        close();
        return navInfo;
    }


    /**
     * 获得导航表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NavInfo
     **/
    public List<NavInfo> GetNavList(String condition, String sort) throws IOException {
        return GetNavList(1, 200, condition, sort);

    }


    /**
     * 获得导航表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NavInfo
     **/
    public List<NavInfo> GetNavList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        NavDao navDao = sqlSession.getMapper(NavDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<NavInfo> navList = navDao.GetNavList(pageSize, count, condition, sort);

        close();
        return navList;
    }

    //endregion

    //region pv统计表

    /**
     * 获得pv统计表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetPvstatCount(String condition) throws IOException {
        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        int count = PvStatDao.GetPvstatCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条pv统计表数据
     *
     * @param PvstatInfo pv统计表模型
     * @return 返回创建信息
     **/
    public int CreatePvstat(PvstatInfo PvstatInfo) throws IOException {
        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        PvStatDao.CreatePvstat(PvstatInfo);
        close();
        return 1;
    }


    /**
     * 更新一条pv统计表数据
     *
     * @param PvstatInfo pv统计表模型
     **/
    public int UpdatePvstat(PvstatInfo PvstatInfo) throws IOException {
        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        PvStatDao.UpdatePvstat(PvstatInfo);
        close();
        return 1;
    }


    /**
     * 删除一条pv统计表数据
     *
     * @param recordid pv统计表模型
     **/
    public void DeletePvstatByRecordId(int recordid) throws IOException {

        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        PvStatDao.DeletePvstatByRecordId(recordid);
        close();
    }

    /**
     * 批量删除一批pv统计表数据
     **/
    public void DeletePvstatListByRecordId(String recordidlist) throws IOException {
        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        PvStatDao.DeletePvstatListByRecordId(recordidlist);
        close();

    }

    /**
     * 获得pv统计表一条记录
     *
     * @param recordid recordid
     * @return 返回一条PvStatInfo
     **/
    public PvstatInfo GetPvstatByRecordId(int recordid) throws IOException {
        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        PvstatInfo PvstatInfo = PvStatDao.GetPvstatByRecordId(recordid);
        close();
        return PvstatInfo;
    }


    /**
     * 获得pv统计表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回PvStatInfo
     **/
    public List<PvstatInfo> GetPvstatList(String condition, String sort) throws IOException {
        return GetPvstatList(1, 200, condition, sort);

    }


    /**
     * 获得pv统计表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回PvStatInfo
     **/
    public List<PvstatInfo> GetPvstatList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        PvStatDao PvStatDao = sqlSession.getMapper(PvStatDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<PvstatInfo> pvstatList = PvStatDao.GetPvstatList(pageSize, count, condition, sort);

        close();
        return pvstatList;
    }

    //endregion

    //region 区域表

    /**
     * 获得区域表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetRegionCount(String condition) throws IOException {
        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        int count = regionDao.GetRegionCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条区域表数据
     *
     * @param regionInfo 区域表模型
     * @return 返回创建信息
     **/
    public int CreateRegion(RegionInfo regionInfo) throws IOException {
        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        regionDao.CreateRegion(regionInfo);
        close();
        return 1;
    }


    /**
     * 更新一条区域表数据
     *
     * @param regionInfo 区域表模型
     **/
    public int UpdateRegion(RegionInfo regionInfo) throws IOException {
        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        regionDao.UpdateRegion(regionInfo);
        close();
        return 1;
    }


    /**
     * 删除一条区域表数据
     *
     * @param regionid 区域表模型
     **/
    public void DeleteRegionByRegionId(int regionid) throws IOException {

        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        regionDao.DeleteRegionByRegionId(regionid);
        close();
    }

    /**
     * 批量删除一批区域表数据
     **/
    public void DeleteRegionListByRegionId(String regionidlist) throws IOException {
        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        regionDao.DeleteRegionListByRegionId(regionidlist);
        close();

    }

    /**
     * 获得区域表一条记录
     *
     * @param regionid regionid
     * @return 返回一条RegionInfo
     **/
    public RegionInfo GetRegionByRegionId(int regionid) throws IOException {
        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        RegionInfo regionInfo = regionDao.GetRegionByRegionId(regionid);
        close();
        return regionInfo;
    }


    /**
     * 获得区域表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回RegionInfo
     **/
    public List<RegionInfo> GetRegionList(String condition, String sort) throws IOException {
        return GetRegionList(1, 200, condition, sort);

    }


    /**
     * 获得区域表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回RegionInfo
     **/
    public List<RegionInfo> GetRegionList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        RegionDao regionDao = sqlSession.getMapper(RegionDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<RegionInfo> regionList = regionDao.GetRegionList(pageSize, count, condition, sort);

        close();
        return regionList;
    }

    //endregion

    //region 新闻表

    /**
     * 获得新闻表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetNewCount(String condition) throws IOException {
        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        int count = newDao.GetNewCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条新闻表数据
     *
     * @param newInfo 新闻表模型
     * @return 返回创建信息
     **/
    public int CreateNew(NewInfo newInfo) throws IOException {
        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        newDao.CreateNew(newInfo);
        close();
        return 1;
    }


    /**
     * 更新一条新闻表数据
     *
     * @param newInfo 新闻表模型
     **/
    public int UpdateNew(NewInfo newInfo) throws IOException {
        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        newDao.UpdateNew(newInfo);
        close();
        return 1;
    }


    /**
     * 删除一条新闻表数据
     *
     * @param newsid 新闻表模型
     **/
    public void DeleteNewByNewsId(int newsid) throws IOException {

        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        newDao.DeleteNewByNewsId(newsid);
        close();
    }

    /**
     * 批量删除一批新闻表数据
     **/
    public void DeleteNewListByNewsId(String newsidlist) throws IOException {
        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        newDao.DeleteNewListByNewsId(newsidlist);
        close();

    }

    /**
     * 获得新闻表一条记录
     *
     * @param newsid newsid
     * @return 返回一条NewInfo
     **/
    public NewInfo GetNewByNewsId(int newsid) throws IOException {
        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        NewInfo newInfo = newDao.GetNewByNewsId(newsid);
        close();
        return newInfo;
    }


    /**
     * 获得新闻表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NewInfo
     **/
    public List<NewInfo> GetNewList(String condition, String sort) throws IOException {
        return GetNewList(1, 200, condition, sort);

    }


    /**
     * 获得新闻表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NewInfo
     **/
    public List<NewInfo> GetNewList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        NewDao newDao = sqlSession.getMapper(NewDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<NewInfo> newList = newDao.GetNewList(pageSize, count, condition, sort);

        close();
        return newList;
    }

    //endregion

    //region 新闻类型表

    /**
     * 获得新闻类型表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetNewtypeCount(String condition) throws IOException {
        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        int count = NewTypeDao.GetNewtypeCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条新闻类型表数据
     *
     * @param NewTypeInfo 新闻类型表模型
     * @return 返回创建信息
     **/
    public int CreateNewtype(NewTypeInfo NewTypeInfo) throws IOException {
        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        NewTypeDao.CreateNewtype(NewTypeInfo);
        close();
        return 1;
    }


    /**
     * 更新一条新闻类型表数据
     *
     * @param NewTypeInfo 新闻类型表模型
     **/
    public int UpdateNewtype(NewTypeInfo NewTypeInfo) throws IOException {
        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        NewTypeDao.UpdateNewtype(NewTypeInfo);
        close();
        return 1;
    }


    /**
     * 删除一条新闻类型表数据
     *
     * @param newtypeid 新闻类型表模型
     **/
    public void DeleteNewtypeByNewtypeId(int newtypeid) throws IOException {

        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        NewTypeDao.DeleteNewtypeByNewtypeId(newtypeid);
        close();
    }

    /**
     * 批量删除一批新闻类型表数据
     **/
    public void DeleteNewtypeListByNewtypeId(String newtypeidlist) throws IOException {
        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        NewTypeDao.DeleteNewtypeListByNewtypeId(newtypeidlist);
        close();

    }

    /**
     * 获得新闻类型表一条记录
     *
     * @param newtypeid newtypeid
     * @return 返回一条NewTypeInfo
     **/
    public NewTypeInfo GetNewtypeByNewtypeId(int newtypeid) throws IOException {
        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        NewTypeInfo NewTypeInfo = NewTypeDao.GetNewtypeByNewtypeId(newtypeid);
        close();
        return NewTypeInfo;
    }


    /**
     * 获得新闻类型表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NewTypeInfo
     **/
    public List<NewTypeInfo> GetNewtypeList(String condition, String sort) throws IOException {
        return GetNewtypeList(1, 200, condition, sort);

    }


    /**
     * 获得新闻类型表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NewTypeInfo
     **/
    public List<NewTypeInfo> GetNewtypeList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        NewTypeDao NewTypeDao = sqlSession.getMapper(NewTypeDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<NewTypeInfo> newtypeList = NewTypeDao.GetNewtypeList(pageSize, count, condition, sort);

        close();
        return newtypeList;
    }

    //endregion
}
