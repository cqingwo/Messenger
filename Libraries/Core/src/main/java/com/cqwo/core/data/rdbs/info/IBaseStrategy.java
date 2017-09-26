/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.data.rdbs.info;

import com.cqwo.core.domain.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/19.
 */
public interface IBaseStrategy {

    //region 广告表

    /**
     * 获得广告表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdvertCount(String condition) throws IOException;


    /**
     * 创建一条广告表数据
     *
     * @param advertInfo 广告表模型
     * @return 返回创建信息
     **/
    int CreateAdvert(AdvertInfo advertInfo) throws IOException;


    /**
     * 更新一条广告表数据
     *
     * @param advertInfo 广告表模型
     **/
    int UpdateAdvert(AdvertInfo advertInfo) throws IOException;


    /**
     * 删除一条广告表数据
     *
     * @param adid 广告表模型
     **/
    void DeleteAdvertByAdId(int adid) throws IOException;

    /**
     * 批量删除一批广告表数据
     **/
    void DeleteAdvertByAdIdList(String adidList) throws IOException;


    /**
     * 获得广告表一条记录
     *
     * @param adid adid
     * @return 返回一条AdvertInfo
     **/
    AdvertInfo GetAdvertByAdId(int adid) throws IOException;


    /**
     * 获得广告表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdvertInfo
     **/
    List<AdvertInfo> GetAdvertList(String condition, String sort) throws IOException;


    /**
     * 获得广告表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdvertInfo
     **/
    List<AdvertInfo> GetAdvertList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 广告表结束

    //region 广告位置

    /**
     * 获得广告位置表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdvertPositionCount(String condition) throws IOException;


    /**
     * 创建一条广告位置表数据
     *
     * @param advertpositionInfo 广告位置表模型
     * @return 返回创建信息
     **/
    int CreateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException;


    /**
     * 更新一条广告位置表数据
     *
     * @param advertpositionInfo 广告位置表模型
     **/
    int UpdateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException;


    /**
     * 删除一条广告位置表数据
     *
     * @param adposid 广告位置表模型
     **/
    void DeleteAdvertPositionByAdPosId(int adposid) throws IOException;

    /**
     * 批量删除一批广告位置表数据
     **/
    void DeleteAdvertPositionByAdPosIdList(String adposidList) throws IOException;


    /**
     * 获得广告位置表一条记录
     *
     * @param adposid adposid
     * @return 返回一条AdvertPositionInfo
     **/
    AdvertPositionInfo GetAdvertPositionByAdPosId(int adposid) throws IOException;


    /**
     * 获得广告位置表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdvertPositionInfo
     **/
    List<AdvertPositionInfo> GetAdvertPositionList(String condition, String sort) throws IOException;


    /**
     * 获得广告位置表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdvertPositionInfo
     **/
    List<AdvertPositionInfo> GetAdvertPositionList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 广告位置结束

    //region 禁止ip表

    /**
     * 获得禁止ip表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetBannedIPCount(String condition) throws IOException;


    /**
     * 创建一条禁止ip表数据
     *
     * @param bannedipInfo 禁止ip表模型
     * @return 返回创建信息
     **/
    int CreateBannedIP(BannedIPInfo bannedipInfo) throws IOException;


    /**
     * 更新一条禁止ip表数据
     *
     * @param bannedipInfo 禁止ip表模型
     **/
    int UpdateBannedIP(BannedIPInfo bannedipInfo) throws IOException;

    /**
     * 删除一条禁止ip表数据
     *
     * @param id 禁止ip表模型
     **/
    void DeleteBannedIPById(int id) throws IOException;

    /**
     * 批量删除一批禁止ip表数据
     **/
    void DeleteBannedIPByIdList(String idList) throws IOException;


    /**
     * 获得禁止ip表一条记录
     *
     * @param id id
     * @return 返回一条BannedIPInfo
     **/
    BannedIPInfo GetBannedIPById(int id) throws IOException;

    /**
     * 获得禁止ip表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回BannedIPInfo
     **/
    List<BannedIPInfo> GetBannedIPList(String condition, String sort) throws IOException;


    /**
     * 获得禁止ip表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回BannedIPInfo
     **/
    List<BannedIPInfo> GetBannedIPList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 禁止ip表结束

    //region 事件日志表

    /**
     * 获得事件日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetEventLogCount(String condition) throws IOException;


    /**
     * 创建一条事件日志表数据
     *
     * @param eventlogInfo 事件日志表模型
     * @return 返回创建信息
     **/
    int CreateEventLog(EventLogInfo eventlogInfo) throws IOException;


    /**
     * 更新一条事件日志表数据
     *
     * @param eventlogInfo 事件日志表模型
     **/
    int UpdateEventLog(EventLogInfo eventlogInfo) throws IOException;

    /**
     * 删除一条事件日志表数据
     *
     * @param id 事件日志表模型
     **/
    void DeleteEventLogById(int id) throws IOException;

    /**
     * 批量删除一批事件日志表数据
     **/
    void DeleteEventLogByIdList(String idList) throws IOException;


    /**
     * 获得事件日志表一条记录
     *
     * @param id id
     * @return 返回一条EventLogInfo
     **/
    EventLogInfo GetEventLogById(int id) throws IOException;

    /**
     * 获得事件日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回EventLogInfo
     **/
    List<EventLogInfo> GetEventLogList(String condition, String sort) throws IOException;


    /**
     * 获得事件日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回EventLogInfo
     **/
    List<EventLogInfo> GetEventLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 事件日志表结束

    //region 筛选词表

    /**
     * 获得筛选词表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetFilterWordCount(String condition) throws IOException;


    /**
     * 创建一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     * @return 返回创建信息
     **/
    int CreateFilterWord(FilterWordInfo filterwordInfo) throws IOException;


    /**
     * 更新一条筛选词表数据
     *
     * @param filterwordInfo 筛选词表模型
     **/
    int UpdateFilterWord(FilterWordInfo filterwordInfo) throws IOException;

    /**
     * 删除一条筛选词表数据
     *
     * @param id 筛选词表模型
     **/
    void DeleteFilterWordById(int id) throws IOException;

    /**
     * 批量删除一批筛选词表数据
     **/
    void DeleteFilterWordByIdList(String idList) throws IOException;


    /**
     * 获得筛选词表一条记录
     *
     * @param id id
     * @return 返回一条FilterWordInfo
     **/
    FilterWordInfo GetFilterWordById(int id) throws IOException;

    /**
     * 获得筛选词表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回FilterWordInfo
     **/
    List<FilterWordInfo> GetFilterWordList(String condition, String sort) throws IOException;


    /**
     * 获得筛选词表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回FilterWordInfo
     **/
    List<FilterWordInfo> GetFilterWordList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 筛选词表结束

    //region 友情链接表

    /**
     * 获得友情链接表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetFriendLinkCount(String condition) throws IOException;


    /**
     * 创建一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     * @return 返回创建信息
     **/
    int CreateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException;


    /**
     * 更新一条友情链接表数据
     *
     * @param friendlinkInfo 友情链接表模型
     **/
    int UpdateFriendLink(FriendLinkInfo friendlinkInfo) throws IOException;

    /**
     * 删除一条友情链接表数据
     *
     * @param id 友情链接表模型
     **/
    void DeleteFriendLinkByid(int id) throws IOException;

    /**
     * 批量删除一批友情链接表数据
     **/
    void DeleteFriendLinkByidList(String idList) throws IOException;


    /**
     * 获得友情链接表一条记录
     *
     * @param id id
     * @return 返回一条FriendLinkInfo
     **/
    FriendLinkInfo GetFriendLinkByid(int id) throws IOException;

    /**
     * 获得友情链接表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回FriendLinkInfo
     **/
    List<FriendLinkInfo> GetFriendLinkList(String condition, String sort) throws IOException;


    /**
     * 获得友情链接表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回FriendLinkInfo
     **/
    List<FriendLinkInfo> GetFriendLinkList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 友情链接表结束

    //region 帮助表

    /**
     * 获得帮助表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetHelpCount(String condition) throws IOException;


    /**
     * 创建一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     * @return 返回创建信息
     **/
    int CreateHelp(HelpInfo helpInfo) throws IOException;


    /**
     * 更新一条帮助表数据
     *
     * @param helpInfo 帮助表模型
     **/
    int UpdateHelp(HelpInfo helpInfo) throws IOException;

    /**
     * 删除一条帮助表数据
     *
     * @param id 帮助表模型
     **/
    void DeleteHelpByid(int id) throws IOException;

    /**
     * 批量删除一批帮助表数据
     **/
    void DeleteHelpByidList(String idList) throws IOException;


    /**
     * 获得帮助表一条记录
     *
     * @param id id
     * @return 返回一条HelpInfo
     **/
    HelpInfo GetHelpByid(int id) throws IOException;

    /**
     * 获得帮助表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回HelpInfo
     **/
    List<HelpInfo> GetHelpList(String condition, String sort) throws IOException;


    /**
     * 获得帮助表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回HelpInfo
     **/
    List<HelpInfo> GetHelpList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 帮助表结束

    //region 导航表

    /**
     * 获得导航表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetNavCount(String condition) throws IOException;


    /**
     * 创建一条导航表数据
     *
     * @param navInfo 导航表模型
     * @return 返回创建信息
     **/
    int CreateNav(NavInfo navInfo) throws IOException;


    /**
     * 更新一条导航表数据
     *
     * @param navInfo 导航表模型
     **/
    int UpdateNav(NavInfo navInfo) throws IOException;


    /**
     * 删除一条导航表数据
     *
     * @param id 导航表模型
     **/
    void DeleteNavById(int id) throws IOException;

    /**
     * 批量删除一批导航表数据
     **/
    void DeleteNavListById(String idList) throws IOException;


    /**
     * 获得导航表一条记录
     *
     * @param id id
     * @return 返回一条NavInfo
     **/
    NavInfo GetNavById(int id) throws IOException;


    /**
     * 获得导航表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NavInfo
     **/
    List<NavInfo> GetNavList(String condition, String sort) throws IOException;


    /**
     * 获得导航表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NavInfo
     **/
    List<NavInfo> GetNavList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 导航表结束

    //region 新闻表

    /**
     * 获得新闻表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetNewCount(String condition) throws IOException;


    /**
     * 创建一条新闻表数据
     *
     * @param newInfo 新闻表模型
     * @return 返回创建信息
     **/
    int CreateNew(NewInfo newInfo) throws IOException;


    /**
     * 更新一条新闻表数据
     *
     * @param newInfo 新闻表模型
     **/
    int UpdateNew(NewInfo newInfo) throws IOException;


    /**
     * 删除一条新闻表数据
     *
     * @param newsid 新闻表模型
     **/
    void DeleteNewByNewsId(int newsid) throws IOException;

    /**
     * 批量删除一批新闻表数据
     **/
    void DeleteNewListByNewsId(String newsidList) throws IOException;


    /**
     * 获得新闻表一条记录
     *
     * @param newsid newsid
     * @return 返回一条NewInfo
     **/
    NewInfo GetNewByNewsId(int newsid) throws IOException;


    /**
     * 获得新闻表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NewInfo
     **/
    List<NewInfo> GetNewList(String condition, String sort) throws IOException;


    /**
     * 获得新闻表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NewInfo
     **/
    List<NewInfo> GetNewList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 新闻表结束

    //region 新闻类型表

    /**
     * 获得新闻类型表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetNewtypeCount(String condition) throws IOException;


    /**
     * 创建一条新闻类型表数据
     *
     * @param NewTypeInfo 新闻类型表模型
     * @return 返回创建信息
     **/
    int CreateNewtype(NewTypeInfo NewTypeInfo) throws IOException;


    /**
     * 更新一条新闻类型表数据
     *
     * @param NewTypeInfo 新闻类型表模型
     **/
    int UpdateNewtype(NewTypeInfo NewTypeInfo) throws IOException;


    /**
     * 删除一条新闻类型表数据
     *
     * @param newtypeid 新闻类型表模型
     **/
    void DeleteNewtypeByNewtypeId(int newtypeid) throws IOException;

    /**
     * 批量删除一批新闻类型表数据
     **/
    void DeleteNewtypeListByNewtypeId(String newtypeidList) throws IOException;


    /**
     * 获得新闻类型表一条记录
     *
     * @param newtypeid newtypeid
     * @return 返回一条NewTypeInfo
     **/
    NewTypeInfo GetNewtypeByNewtypeId(int newtypeid) throws IOException;


    /**
     * 获得新闻类型表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回NewTypeInfo
     **/
    List<NewTypeInfo> GetNewtypeList(String condition, String sort) throws IOException;


    /**
     * 获得新闻类型表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回NewTypeInfo
     **/
    List<NewTypeInfo> GetNewtypeList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 新闻类型表结束

    //region pv统计表

    /**
     * 获得pv统计表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetPvstatCount(String condition) throws IOException;


    /**
     * 创建一条pv统计表数据
     *
     * @param pvstatInfo pv统计表模型
     * @return 返回创建信息
     **/
    int CreatePvstat(PvstatInfo pvstatInfo) throws IOException;


    /**
     * 更新一条pv统计表数据
     *
     * @param pvstatInfo pv统计表模型
     **/
    int UpdatePvstat(PvstatInfo pvstatInfo) throws IOException;


    /**
     * 删除一条pv统计表数据
     *
     * @param recordid pv统计表模型
     **/
    void DeletePvstatByRecordId(int recordid) throws IOException;

    /**
     * 批量删除一批pv统计表数据
     **/
    void DeletePvstatListByRecordId(String recordidList) throws IOException;


    /**
     * 获得pv统计表一条记录
     *
     * @param recordid recordid
     * @return 返回一条PvstatInfo
     **/
    PvstatInfo GetPvstatByRecordId(int recordid) throws IOException;


    /**
     * 获得pv统计表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回PvstatInfo
     **/
    List<PvstatInfo> GetPvstatList(String condition, String sort) throws IOException;


    /**
     * 获得pv统计表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回PvstatInfo
     **/
    List<PvstatInfo> GetPvstatList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion pv统计表结束

    //region 区域表

    /**
     * 获得区域表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetRegionCount(String condition) throws IOException;


    /**
     * 创建一条区域表数据
     *
     * @param regionInfo 区域表模型
     * @return 返回创建信息
     **/
    int CreateRegion(RegionInfo regionInfo) throws IOException;


    /**
     * 更新一条区域表数据
     *
     * @param regionInfo 区域表模型
     **/
    int UpdateRegion(RegionInfo regionInfo) throws IOException;


    /**
     * 删除一条区域表数据
     *
     * @param regionid 区域表模型
     **/
    void DeleteRegionByRegionId(int regionid) throws IOException;

    /**
     * 批量删除一批区域表数据
     **/
    void DeleteRegionListByRegionId(String regionidList) throws IOException;


    /**
     * 获得区域表一条记录
     *
     * @param regionid regionid
     * @return 返回一条RegionInfo
     **/
    RegionInfo GetRegionByRegionId(int regionid) throws IOException;


    /**
     * 获得区域表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回RegionInfo
     **/
    List<RegionInfo> GetRegionList(String condition, String sort) throws IOException;


    /**
     * 获得区域表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回RegionInfo
     **/
    List<RegionInfo> GetRegionList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 区域表结束

}
