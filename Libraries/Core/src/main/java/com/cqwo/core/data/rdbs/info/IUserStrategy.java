package com.cqwo.core.data.rdbs.info;

import com.cqwo.core.domain.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */
public interface IUserStrategy {

    //region 用户表

    /**
     * 获得用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetUserCount(String condition) throws IOException;


    /**
     * 创建一条用户表数据
     *
     * @param userInfo 用户表模型
     * @return 返回创建信息
     **/
    int CreateUser(UserInfo userInfo) throws IOException;


    /**
     * 更新一条用户表数据
     *
     * @param userInfo 用户表模型
     **/
    int UpdateUser(UserInfo userInfo) throws IOException;


    /**
     * 删除一条用户表数据
     *
     * @param uid 用户表模型
     **/
    void DeleteUserByUid(int uid) throws IOException;

    /**
     * 批量删除一批用户表数据
     **/
    void DeleteUserListByUid(String uidList) throws IOException;


    /**
     * 获得用户表一条记录
     *
     * @param uid uid
     * @return 返回一条UserInfo
     **/
    UserInfo GetUserByUid(int uid) throws IOException;


    /**
     * 获得用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserInfo
     **/
    List<UserInfo> GetUserList(String condition, String sort) throws IOException;


    /**
     * 获得用户表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回UserInfo
     **/
    List<UserInfo> GetUserList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 用户表结束

    //region 用户详细信息表

    /**
     * 获得用户详细信息表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetUserdetailCount(String condition) throws IOException;


    /**
     * 创建一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     * @return 返回创建信息
     **/
    int CreateUserdetail(UserDetailInfo UserDetailInfo) throws IOException;


    /**
     * 更新一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     **/
    int UpdateUserdetail(UserDetailInfo UserDetailInfo) throws IOException;


    /**
     * 删除一条用户详细信息表数据
     *
     * @param uid 用户详细信息表模型
     **/
    void DeleteUserdetailByUid(int uid) throws IOException;

    /**
     * 批量删除一批用户详细信息表数据
     **/
    void DeleteUserdetailListByUid(String uidList) throws IOException;


    /**
     * 获得用户详细信息表一条记录
     *
     * @param uid uid
     * @return 返回一条UserDetailInfo
     **/
    UserDetailInfo GetUserdetailByUid(int uid) throws IOException;


    /**
     * 获得用户详细信息表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserDetailInfo
     **/
    List<UserDetailInfo> GetUserdetailList(String condition, String sort) throws IOException;


    /**
     * 获得用户详细信息表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回UserDetailInfo
     **/
    List<UserDetailInfo> GetUserdetailList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 用户详细信息表结束

    //region 用户等级表

    /**
     * 获得用户等级表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetUserrankCount(String condition) throws IOException;


    /**
     * 创建一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     * @return 返回创建信息
     **/
    int CreateUserrank(UserRankInfo UserRankInfo) throws IOException;


    /**
     * 更新一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     **/
    int UpdateUserrank(UserRankInfo UserRankInfo) throws IOException;


    /**
     * 删除一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    void DeleteUserrankByUserrId(int userrid) throws IOException;

    /**
     * 批量删除一批用户等级表数据
     **/
    void DeleteUserrankListByUserrId(String userridList) throws IOException;


    /**
     * 获得用户等级表一条记录
     *
     * @param userrid userrid
     * @return 返回一条UserRankInfo
     **/
    UserRankInfo GetUserrankByUserrId(int userrid) throws IOException;


    /**
     * 获得用户等级表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserRankInfo
     **/
    List<UserRankInfo> GetUserrankList(String condition, String sort) throws IOException;


    /**
     * 获得用户等级表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回UserRankInfo
     **/
    List<UserRankInfo> GetUserrankList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 用户等级表结束

    //region 积分日志表

    /**
     * 获得积分日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetCreditLogCount(String condition) throws IOException;


    /**
     * 创建一条积分日志表数据
     *
     * @param creditlogInfo 积分日志表模型
     * @return 返回创建信息
     **/
    int CreateCreditLog(CreditLogInfo creditlogInfo) throws IOException;


    /**
     * 更新一条积分日志表数据
     *
     * @param creditlogInfo 积分日志表模型
     **/
    int UpdateCreditLog(CreditLogInfo creditlogInfo) throws IOException;

    /**
     * 删除一条积分日志表数据
     *
     * @param logid 积分日志表模型
     **/
    void DeleteCreditLogByLogId(int logid) throws IOException;

    /**
     * 批量删除一批积分日志表数据
     **/
    void DeleteCreditLogByLogIdList(String logidList) throws IOException;


    /**
     * 获得积分日志表一条记录
     *
     * @param logid logid
     * @return 返回一条CreditLogInfo
     **/
    CreditLogInfo GetCreditLogByLogId(int logid) throws IOException;

    /**
     * 获得积分日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回CreditLogInfo
     **/
    List<CreditLogInfo> GetCreditLogList(String condition, String sort) throws IOException;


    /**
     * 获得积分日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回CreditLogInfo
     **/
    List<CreditLogInfo> GetCreditLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 积分日志表结束

    //region 登陆失败日志表

    /**
     * 获得登陆失败日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetLoginFailLogCount(String condition) throws IOException;


    /**
     * 创建一条登陆失败日志表数据
     *
     * @param loginfaillogInfo 登陆失败日志表模型
     * @return 返回创建信息
     **/
    int CreateLoginFailLog(LoginFailLogInfo loginfaillogInfo) throws IOException;


    /**
     * 更新一条登陆失败日志表数据
     *
     * @param loginfaillogInfo 登陆失败日志表模型
     **/
    int UpdateLoginFailLog(LoginFailLogInfo loginfaillogInfo) throws IOException;

    /**
     * 删除一条登陆失败日志表数据
     *
     * @param id 登陆失败日志表模型
     **/
    void DeleteLoginFailLogById(int id) throws IOException;

    /**
     * 批量删除一批登陆失败日志表数据
     **/
    void DeleteLoginFailLogByIdList(String idList) throws IOException;


    /**
     * 获得登陆失败日志表一条记录
     *
     * @param id id
     * @return 返回一条LoginFailLogInfo
     **/
    LoginFailLogInfo GetLoginFailLogById(int id) throws IOException;

    /**
     * 获得登陆失败日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回LoginFailLogInfo
     **/
    List<LoginFailLogInfo> GetLoginFailLogList(String condition, String sort) throws IOException;


    /**
     * 获得登陆失败日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回LoginFailLogInfo
     **/
    List<LoginFailLogInfo> GetLoginFailLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 登陆失败日志表结束

    //region 商城管理动作表

    /**
     * 获得商城管理动作表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdminActionCount(String condition) throws IOException;


    /**
     * 创建一条商城管理动作表数据
     *
     * @param adminactionInfo 商城管理动作表模型
     * @return 返回创建信息
     **/
    int CreateAdminAction(AdminActionInfo adminactionInfo) throws IOException;


    /**
     * 更新一条商城管理动作表数据
     *
     * @param adminactionInfo 商城管理动作表模型
     **/
    int UpdateAdminAction(AdminActionInfo adminactionInfo) throws IOException;

    /**
     * 删除一条商城管理动作表数据
     *
     * @param aid 商城管理动作表模型
     **/
    void DeleteAdminActionByAid(int aid) throws IOException;

    /**
     * 批量删除一批商城管理动作表数据
     **/
    void DeleteAdminActionByAidList(String aidList) throws IOException;


    /**
     * 获得商城管理动作表一条记录
     *
     * @param aid aid
     * @return 返回一条AdminActionInfo
     **/
    AdminActionInfo GetAdminActionByAid(int aid) throws IOException;

    /**
     * 获得商城管理动作表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminActionInfo
     **/
    List<AdminActionInfo> GetAdminActionList(String condition, String sort) throws IOException;


    /**
     * 获得商城管理动作表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdminActionInfo
     **/
    List<AdminActionInfo> GetAdminActionList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 商城管理动作表结束

    //region 商城管理组表

    /**
     * 获得商城管理组表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdminGroupCount(String condition) throws IOException;


    /**
     * 创建一条商城管理组表数据
     *
     * @param admingroupInfo 商城管理组表模型
     * @return 返回创建信息
     **/
    int CreateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException;


    /**
     * 更新一条商城管理组表数据
     *
     * @param admingroupInfo 商城管理组表模型
     **/
    int UpdateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException;

    /**
     * 删除一条商城管理组表数据
     *
     * @param agid 商城管理组表模型
     **/
    void DeleteAdminGroupByAGId(int agid) throws IOException;

    /**
     * 批量删除一批商城管理组表数据
     **/
    void DeleteAdminGroupByAGIdList(String agidList) throws IOException;


    /**
     * 获得商城管理组表一条记录
     *
     * @param agid agid
     * @return 返回一条AdminGroupInfo
     **/
    AdminGroupInfo GetAdminGroupByAGId(int agid) throws IOException;

    /**
     * 获得商城管理组表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminGroupInfo
     **/
    List<AdminGroupInfo> GetAdminGroupList(String condition, String sort) throws IOException;


    /**
     * 获得商城管理组表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdminGroupInfo
     **/
    List<AdminGroupInfo> GetAdminGroupList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 商城管理组表结束

    //region 商城管理日志表

    /**
     * 获得商城管理日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetAdminLogCount(String condition) throws IOException;


    /**
     * 创建一条商城管理日志表数据
     *
     * @param adminlogInfo 商城管理日志表模型
     * @return 返回创建信息
     **/
    int CreateAdminLog(AdminLogInfo adminlogInfo) throws IOException;


    /**
     * 更新一条商城管理日志表数据
     *
     * @param adminlogInfo 商城管理日志表模型
     **/
    int UpdateAdminLog(AdminLogInfo adminlogInfo) throws IOException;

    /**
     * 删除一条商城管理日志表数据
     *
     * @param logid 商城管理日志表模型
     **/
    void DeleteAdminLogByLogId(int logid) throws IOException;

    /**
     * 批量删除一批商城管理日志表数据
     **/
    void DeleteAdminLogByLogIdList(String logidList) throws IOException;


    /**
     * 获得商城管理日志表一条记录
     *
     * @param logid logid
     * @return 返回一条AdminLogInfo
     **/
    AdminLogInfo GetAdminLogByLogId(int logid) throws IOException;

    /**
     * 获得商城管理日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminLogInfo
     **/
    List<AdminLogInfo> GetAdminLogList(String condition, String sort) throws IOException;


    /**
     * 获得商城管理日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdminLogInfo
     **/
    List<AdminLogInfo> GetAdminLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 商城管理日志表结束

    //region 在线用户表

    /**
     * 获得在线用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetOnlineuserCount(String condition) throws IOException;


    /**
     * 创建一条在线用户表数据
     *
     * @param onlineUserInfo 在线用户表模型
     * @return 返回创建信息
     **/
    int CreateOnlineuser(OnlineUserInfo onlineUserInfo) throws IOException;


    /**
     * 更新一条在线用户表数据
     *
     * @param onlineUserInfo 在线用户表模型
     **/
    int UpdateOnlineuser(OnlineUserInfo onlineUserInfo) throws IOException;


    /**
     * 删除一条在线用户表数据
     *
     * @param olid 在线用户表模型
     **/
    void DeleteOnlineuserByOlId(int olid) throws IOException;

    /**
     * 批量删除一批在线用户表数据
     **/
    void DeleteOnlineuserListByOlId(String olidList) throws IOException;


    /**
     * 获得在线用户表一条记录
     *
     * @param olid olid
     * @return 返回一条OnlineUserInfo
     **/
    OnlineUserInfo GetOnlineuserByOlId(int olid) throws IOException;


    /**
     * 获得在线用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnLineUserInfo
     **/
    List<OnlineUserInfo> GetOnlineuserList(String condition, String sort) throws IOException;


    /**
     * 获得在线用户表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回OnlineUserInfo
     **/
    List<OnlineUserInfo> GetOnlineuserList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 在线用户表结束

    //region 在线时间表

    /**
     * 获得在线时间表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetOnlinetimeCount(String condition) throws IOException;


    /**
     * 创建一条在线时间表数据
     *
     * @param OnLineTimeInfo 在线时间表模型
     * @return 返回创建信息
     **/
    int CreateOnlinetime(OnlineTimeInfo OnLineTimeInfo) throws IOException;


    /**
     * 更新一条在线时间表数据
     *
     * @param OnLineTimeInfo 在线时间表模型
     **/
    int UpdateOnlinetime(OnlineTimeInfo OnLineTimeInfo) throws IOException;


    /**
     * 删除一条在线时间表数据
     *
     * @param uid 在线时间表模型
     **/
    void DeleteOnlinetimeByUid(int uid) throws IOException;

    /**
     * 批量删除一批在线时间表数据
     **/
    void DeleteOnlinetimeListByUid(String uidList) throws IOException;


    /**
     * 获得在线时间表一条记录
     *
     * @param uid uid
     * @return 返回一条OnLineTimeInfo
     **/
    OnlineTimeInfo GetOnlinetimeByUid(int uid) throws IOException;


    /**
     * 获得在线时间表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnLineTimeInfo
     **/
    List<OnlineTimeInfo> GetOnlinetimeList(String condition, String sort) throws IOException;


    /**
     * 获得在线时间表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回OnLineTimeInfo
     **/
    List<OnlineTimeInfo> GetOnlinetimeList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 在线时间表结束

    //region 开放授权表

    /**
     * 获得开放授权表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    int GetOauthCount(String condition) throws IOException;


    /**
     * 创建一条开放授权表数据
     *
     * @param oauthInfo 开放授权表模型
     * @return 返回创建信息
     **/
    int CreateOauth(OauthInfo oauthInfo) throws IOException;


    /**
     * 更新一条开放授权表数据
     *
     * @param oauthInfo 开放授权表模型
     **/
    int UpdateOauth(OauthInfo oauthInfo) throws IOException;


    /**
     * 删除一条开放授权表数据
     *
     * @param id 开放授权表模型
     **/
    void DeleteOauthById(int id) throws IOException;

    /**
     * 批量删除一批开放授权表数据
     **/
    void DeleteOauthListById(String idList) throws IOException;


    /**
     * 获得开放授权表一条记录
     *
     * @param id id
     * @return 返回一条OauthInfo
     **/
    OauthInfo GetOauthById(int id) throws IOException;


    /**
     * 获得开放授权表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OauthInfo
     **/
    List<OauthInfo> GetOauthList(String condition, String sort) throws IOException;


    /**
     * 获得开放授权表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回OauthInfo
     **/
    List<OauthInfo> GetOauthList(int pageSize, int pageNumber, String condition, String sort) throws IOException;


    //endregion 开放授权表结束
}
