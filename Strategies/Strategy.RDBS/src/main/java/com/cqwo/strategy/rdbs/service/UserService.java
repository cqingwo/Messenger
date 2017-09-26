package com.cqwo.strategy.rdbs.service;

import com.cqwo.core.data.rdbs.info.IUserStrategy;
import com.cqwo.core.domain.*;
import com.cqwo.strategy.rdbs.dao.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by 青沃科技 on 2017/4/7.
 */
public class UserService extends BaseService implements IUserStrategy {


    //region 用户表

    /**
     * 获得用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserCount(String condition) throws IOException {
        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int count = userDao.GetUserCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条用户表数据
     *
     * @param userInfo 用户表模型
     * @return 返回创建信息
     **/
    public int CreateUser(UserInfo userInfo) throws IOException {
        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.CreateUser(userInfo);
        close();
        return 1;
    }


    /**
     * 更新一条用户表数据
     *
     * @param userInfo 用户表模型
     **/
    public int UpdateUser(UserInfo userInfo) throws IOException {
        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.UpdateUser(userInfo);
        close();
        return 1;
    }


    /**
     * 删除一条用户表数据
     *
     * @param uid 用户表模型
     **/
    public void DeleteUserByUid(int uid) throws IOException {

        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.DeleteUserByUid(uid);
        close();
    }

    /**
     * 批量删除一批用户表数据
     **/
    public void DeleteUserListByUid(String uidlist) throws IOException {
        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.DeleteUserListByUid(uidlist);
        close();

    }

    /**
     * 获得用户表一条记录
     *
     * @param uid uid
     * @return 返回一条UserInfo
     **/
    public UserInfo GetUserByUid(int uid) throws IOException {
        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        UserInfo userInfo = userDao.GetUserByUid(uid);
        close();
        return userInfo;
    }


    /**
     * 获得用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserInfo
     **/
    public List<UserInfo> GetUserList(String condition, String sort) throws IOException {
        return GetUserList(1, 200, condition, sort);

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
        connection();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<UserInfo> userList = userDao.GetUserList(pageSize, count, condition, sort);

        close();
        return userList;
    }

    //endregion

    //region 用户详细信息表

    /**
     * 获得用户详细信息表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserdetailCount(String condition) throws IOException {
        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        int count = userdetailDao.GetUserdetailCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     * @return 返回创建信息
     **/
    public int CreateUserdetail(UserDetailInfo UserDetailInfo) throws IOException {
        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        userdetailDao.CreateUserdetail(UserDetailInfo);
        close();
        return 1;
    }


    /**
     * 更新一条用户详细信息表数据
     *
     * @param UserDetailInfo 用户详细信息表模型
     **/
    public int UpdateUserdetail(UserDetailInfo UserDetailInfo) throws IOException {
        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        userdetailDao.UpdateUserdetail(UserDetailInfo);
        close();
        return 1;
    }


    /**
     * 删除一条用户详细信息表数据
     *
     * @param uid 用户详细信息表模型
     **/
    public void DeleteUserdetailByUid(int uid) throws IOException {

        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        userdetailDao.DeleteUserdetailByUid(uid);
        close();
    }

    /**
     * 批量删除一批用户详细信息表数据
     **/
    public void DeleteUserdetailListByUid(String uidlist) throws IOException {
        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        userdetailDao.DeleteUserdetailListByUid(uidlist);
        close();

    }

    /**
     * 获得用户详细信息表一条记录
     *
     * @param uid uid
     * @return 返回一条UserDetailInfo
     **/
    public UserDetailInfo GetUserdetailByUid(int uid) throws IOException {
        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        UserDetailInfo UserDetailInfo = userdetailDao.GetUserdetailByUid(uid);
        close();
        return UserDetailInfo;
    }


    /**
     * 获得用户详细信息表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserDetailInfo
     **/
    public List<UserDetailInfo> GetUserdetailList(String condition, String sort) throws IOException {
        return GetUserdetailList(1, 200, condition, sort);

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
        connection();
        UserDetailDao userdetailDao = sqlSession.getMapper(UserDetailDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<UserDetailInfo> userdetailList = userdetailDao.GetUserdetailList(pageSize, count, condition, sort);

        close();
        return userdetailList;
    }

    //endregion

    //region 用户等级表

    /**
     * 获得用户等级表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetUserrankCount(String condition) throws IOException {
        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        int count = UserRankDao.GetUserrankCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     * @return 返回创建信息
     **/
    public int CreateUserrank(UserRankInfo UserRankInfo) throws IOException {
        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        UserRankDao.CreateUserrank(UserRankInfo);
        close();
        return 1;
    }


    /**
     * 更新一条用户等级表数据
     *
     * @param UserRankInfo 用户等级表模型
     **/
    public int UpdateUserrank(UserRankInfo UserRankInfo) throws IOException {
        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        UserRankDao.UpdateUserrank(UserRankInfo);
        close();
        return 1;
    }


    /**
     * 删除一条用户等级表数据
     *
     * @param userrid 用户等级表模型
     **/
    public void DeleteUserrankByUserrId(int userrid) throws IOException {

        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        UserRankDao.DeleteUserrankByUserrId(userrid);
        close();
    }

    /**
     * 批量删除一批用户等级表数据
     **/
    public void DeleteUserrankListByUserrId(String userridlist) throws IOException {
        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        UserRankDao.DeleteUserrankListByUserrId(userridlist);
        close();

    }

    /**
     * 获得用户等级表一条记录
     *
     * @param userrid userrid
     * @return 返回一条UserRankInfo
     **/
    public UserRankInfo GetUserrankByUserrId(int userrid) throws IOException {
        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        UserRankInfo UserRankInfo = UserRankDao.GetUserrankByUserrId(userrid);
        close();
        return UserRankInfo;
    }


    /**
     * 获得用户等级表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回UserRankInfo
     **/
    public List<UserRankInfo> GetUserrankList(String condition, String sort) throws IOException {
        return GetUserrankList(1, 200, condition, sort);

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
        connection();
        UserRankDao UserRankDao = sqlSession.getMapper(UserRankDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<UserRankInfo> userrankList = UserRankDao.GetUserrankList(pageSize, count, condition, sort);

        close();
        return userrankList;
    }

    //endregion

    //region 积分日志表

    /**
     * 获得积分日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetCreditLogCount(String condition) throws IOException {
        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        int count = creditlogDao.GetCreditLogCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条积分日志表数据
     *
     * @param creditlogInfo 积分日志表模型
     * @return 返回创建信息
     **/
    public int CreateCreditLog(CreditLogInfo creditlogInfo) throws IOException {
        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        creditlogDao.CreateCreditLog(creditlogInfo);
        close();
        return 1;
    }


    /**
     * 更新一条积分日志表数据
     *
     * @param creditlogInfo 积分日志表模型
     **/
    public int UpdateCreditLog(CreditLogInfo creditlogInfo) throws IOException {
        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        creditlogDao.UpdateCreditLog(creditlogInfo);
        close();
        return 1;
    }


    /**
     * 删除一条积分日志表数据
     *
     * @param logid 积分日志表模型
     **/
    public void DeleteCreditLogByLogId(int logid) throws IOException {

        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        creditlogDao.DeleteCreditLogByLogId(logid);
        close();
    }

    /**
     * 批量删除一批积分日志表数据
     **/
    public void DeleteCreditLogByLogIdList(String logidlist) throws IOException {
        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        creditlogDao.DeleteCreditLogByLogIdList(logidlist);
        close();

    }

    /**
     * 获得积分日志表一条记录
     *
     * @param logid logid
     * @return 返回一条CreditLogInfo
     **/
    public CreditLogInfo GetCreditLogByLogId(int logid) throws IOException {
        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        CreditLogInfo creditlogInfo = creditlogDao.GetCreditLogByLogId(logid);
        close();
        return creditlogInfo;
    }


    /**
     * 获得积分日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回CreditLogInfo
     **/
    public List<CreditLogInfo> GetCreditLogList(String condition, String sort) throws IOException {
        return GetCreditLogList(1, 200, condition, sort);

    }


    /**
     * 获得积分日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回CreditLogInfo
     **/
    public List<CreditLogInfo> GetCreditLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        CreditLogDao creditlogDao = sqlSession.getMapper(CreditLogDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<CreditLogInfo> creditlogList = creditlogDao.GetCreditLogList(pageSize, count, condition, sort);

        close();
        return creditlogList;
    }

    //endregion

    //region 登陆失败日志表

    /**
     * 获得登陆失败日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetLoginFailLogCount(String condition) throws IOException {
        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        int count = loginfaillogDao.GetLoginFailLogCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条登陆失败日志表数据
     *
     * @param loginfaillogInfo 登陆失败日志表模型
     * @return 返回创建信息
     **/
    public int CreateLoginFailLog(LoginFailLogInfo loginfaillogInfo) throws IOException {
        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        loginfaillogDao.CreateLoginFailLog(loginfaillogInfo);
        close();
        return 1;
    }


    /**
     * 更新一条登陆失败日志表数据
     *
     * @param loginfaillogInfo 登陆失败日志表模型
     **/
    public int UpdateLoginFailLog(LoginFailLogInfo loginfaillogInfo) throws IOException {
        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        loginfaillogDao.UpdateLoginFailLog(loginfaillogInfo);
        close();
        return 1;
    }


    /**
     * 删除一条登陆失败日志表数据
     *
     * @param id 登陆失败日志表模型
     **/
    public void DeleteLoginFailLogById(int id) throws IOException {

        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        loginfaillogDao.DeleteLoginFailLogById(id);
        close();
    }

    /**
     * 批量删除一批登陆失败日志表数据
     **/
    public void DeleteLoginFailLogByIdList(String idlist) throws IOException {
        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        loginfaillogDao.DeleteLoginFailLogByIdList(idlist);
        close();

    }

    /**
     * 获得登陆失败日志表一条记录
     *
     * @param id id
     * @return 返回一条LoginFailLogInfo
     **/
    public LoginFailLogInfo GetLoginFailLogById(int id) throws IOException {
        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        LoginFailLogInfo loginfaillogInfo = loginfaillogDao.GetLoginFailLogById(id);
        close();
        return loginfaillogInfo;
    }


    /**
     * 获得登陆失败日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回LoginFailLogInfo
     **/
    public List<LoginFailLogInfo> GetLoginFailLogList(String condition, String sort) throws IOException {
        return GetLoginFailLogList(200, 1, condition, sort);

    }


    /**
     * 获得登陆失败日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回LoginFailLogInfo
     **/
    public List<LoginFailLogInfo> GetLoginFailLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        LoginFailLogDao loginfaillogDao = sqlSession.getMapper(LoginFailLogDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<LoginFailLogInfo> loginfaillogList = loginfaillogDao.GetLoginFailLogList(pageSize, count, condition, sort);

        close();
        return loginfaillogList;
    }

    //endregion

    //region 商城管理动作表

    /**
     * 获得商城管理动作表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetAdminActionCount(String condition) throws IOException {
        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        int count = adminactionDao.GetAdminActionCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条商城管理动作表数据
     *
     * @param adminactionInfo 商城管理动作表模型
     * @return 返回创建信息
     **/
    public int CreateAdminAction(AdminActionInfo adminactionInfo) throws IOException {
        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        adminactionDao.CreateAdminAction(adminactionInfo);
        close();
        return 1;
    }


    /**
     * 更新一条商城管理动作表数据
     *
     * @param adminactionInfo 商城管理动作表模型
     **/
    public int UpdateAdminAction(AdminActionInfo adminactionInfo) throws IOException {
        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        adminactionDao.UpdateAdminAction(adminactionInfo);
        close();
        return 1;
    }


    /**
     * 删除一条商城管理动作表数据
     *
     * @param aid 商城管理动作表模型
     **/
    public void DeleteAdminActionByAid(int aid) throws IOException {

        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        adminactionDao.DeleteAdminActionByAid(aid);
        close();
    }

    /**
     * 批量删除一批商城管理动作表数据
     **/
    public void DeleteAdminActionByAidList(String aidlist) throws IOException {
        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        adminactionDao.DeleteAdminActionByAidList(aidlist);
        close();

    }

    /**
     * 获得商城管理动作表一条记录
     *
     * @param aid aid
     * @return 返回一条AdminActionInfo
     **/
    public AdminActionInfo GetAdminActionByAid(int aid) throws IOException {
        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        AdminActionInfo adminactionInfo = adminactionDao.GetAdminActionByAid(aid);
        close();
        return adminactionInfo;
    }


    /**
     * 获得商城管理动作表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminActionInfo
     **/
    public List<AdminActionInfo> GetAdminActionList(String condition, String sort) throws IOException {
        return GetAdminActionList(200, 1, condition, sort);

    }


    /**
     * 获得商城管理动作表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdminActionInfo
     **/
    public List<AdminActionInfo> GetAdminActionList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        AdminActionDao adminactionDao = sqlSession.getMapper(AdminActionDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<AdminActionInfo> adminactionList = adminactionDao.GetAdminActionList(pageSize, count, condition, sort);

        close();
        return adminactionList;
    }

    //endregion

    //region 商城管理组表

    /**
     * 获得商城管理组表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetAdminGroupCount(String condition) throws IOException {
        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        int count = admingroupDao.GetAdminGroupCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条商城管理组表数据
     *
     * @param admingroupInfo 商城管理组表模型
     * @return 返回创建信息
     **/
    public int CreateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException {
        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        admingroupDao.CreateAdminGroup(admingroupInfo);
        close();
        return 1;
    }


    /**
     * 更新一条商城管理组表数据
     *
     * @param admingroupInfo 商城管理组表模型
     **/
    public int UpdateAdminGroup(AdminGroupInfo admingroupInfo) throws IOException {
        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        admingroupDao.UpdateAdminGroup(admingroupInfo);
        close();
        return 1;
    }


    /**
     * 删除一条商城管理组表数据
     *
     * @param agid 商城管理组表模型
     **/
    public void DeleteAdminGroupByAGId(int agid) throws IOException {

        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        admingroupDao.DeleteAdminGroupByAGId(agid);
        close();
    }

    /**
     * 批量删除一批商城管理组表数据
     **/
    public void DeleteAdminGroupByAGIdList(String agidlist) throws IOException {
        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        admingroupDao.DeleteAdminGroupByAGIdList(agidlist);
        close();

    }

    /**
     * 获得商城管理组表一条记录
     *
     * @param agid agid
     * @return 返回一条AdminGroupInfo
     **/
    public AdminGroupInfo GetAdminGroupByAGId(int agid) throws IOException {
        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        AdminGroupInfo admingroupInfo = admingroupDao.GetAdminGroupByAGId(agid);
        close();
        return admingroupInfo;
    }


    /**
     * 获得商城管理组表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminGroupInfo
     **/
    public List<AdminGroupInfo> GetAdminGroupList(String condition, String sort) throws IOException {
        return GetAdminGroupList(200, 1, condition, sort);

    }


    /**
     * 获得商城管理组表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdminGroupInfo
     **/
    public List<AdminGroupInfo> GetAdminGroupList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        AdminGroupDao admingroupDao = sqlSession.getMapper(AdminGroupDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<AdminGroupInfo> admingroupList = admingroupDao.GetAdminGroupList(pageSize, count, condition, sort);

        close();
        return admingroupList;
    }

    //endregion

    //region 商城管理日志表

    /**
     * 获得商城管理日志表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetAdminLogCount(String condition) throws IOException {
        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        int count = adminlogDao.GetAdminLogCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条商城管理日志表数据
     *
     * @param adminlogInfo 商城管理日志表模型
     * @return 返回创建信息
     **/
    public int CreateAdminLog(AdminLogInfo adminlogInfo) throws IOException {
        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        adminlogDao.CreateAdminLog(adminlogInfo);
        close();
        return 1;
    }


    /**
     * 更新一条商城管理日志表数据
     *
     * @param adminlogInfo 商城管理日志表模型
     **/
    public int UpdateAdminLog(AdminLogInfo adminlogInfo) throws IOException {
        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        adminlogDao.UpdateAdminLog(adminlogInfo);
        close();
        return 1;
    }


    /**
     * 删除一条商城管理日志表数据
     *
     * @param logid 商城管理日志表模型
     **/
    public void DeleteAdminLogByLogId(int logid) throws IOException {

        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        adminlogDao.DeleteAdminLogByLogId(logid);
        close();
    }

    /**
     * 批量删除一批商城管理日志表数据
     **/
    public void DeleteAdminLogByLogIdList(String logidlist) throws IOException {
        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        adminlogDao.DeleteAdminLogByLogIdList(logidlist);
        close();

    }

    /**
     * 获得商城管理日志表一条记录
     *
     * @param logid logid
     * @return 返回一条AdminLogInfo
     **/
    public AdminLogInfo GetAdminLogByLogId(int logid) throws IOException {
        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        AdminLogInfo adminlogInfo = adminlogDao.GetAdminLogByLogId(logid);
        close();
        return adminlogInfo;
    }


    /**
     * 获得商城管理日志表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回AdminLogInfo
     **/
    public List<AdminLogInfo> GetAdminLogList(String condition, String sort) throws IOException {
        return GetAdminLogList(200, 1, condition, sort);

    }


    /**
     * 获得商城管理日志表数据列表
     *
     * @param pageSize   每页数
     * @param pageNumber 当前页数
     * @param condition  条件
     * @param sort       排序
     * @return 返回AdminLogInfo
     **/
    public List<AdminLogInfo> GetAdminLogList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        AdminLogDao adminlogDao = sqlSession.getMapper(AdminLogDao.class);
        int count = (pageNumber - 1) * pageSize;

        List<AdminLogInfo> adminlogList = adminlogDao.GetAdminLogList(pageSize, count, condition, sort);

        close();
        return adminlogList;
    }

    //endregion

    //region 在线用户表

    /**
     * 获得在线用户表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetOnlineuserCount(String condition) throws IOException {
        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        int count = onlineuserDao.GetOnlineuserCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条在线用户表数据
     *
     * @param OnlineUserInfo 在线用户表模型
     * @return 返回创建信息
     **/
    public int CreateOnlineuser(OnlineUserInfo OnlineUserInfo) throws IOException {
        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        onlineuserDao.CreateOnlineuser(OnlineUserInfo);
        close();
        return 1;
    }


    /**
     * 更新一条在线用户表数据
     *
     * @param OnlineUserInfo 在线用户表模型
     **/
    public int UpdateOnlineuser(OnlineUserInfo OnlineUserInfo) throws IOException {
        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        onlineuserDao.UpdateOnlineuser(OnlineUserInfo);
        close();
        return 1;
    }


    /**
     * 删除一条在线用户表数据
     *
     * @param olid 在线用户表模型
     **/
    public void DeleteOnlineuserByOlId(int olid) throws IOException {

        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        onlineuserDao.DeleteOnlineuserByOlId(olid);
        close();
    }

    /**
     * 批量删除一批在线用户表数据
     **/
    public void DeleteOnlineuserListByOlId(String olidlist) throws IOException {
        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        onlineuserDao.DeleteOnlineuserListByOlId(olidlist);
        close();

    }

    /**
     * 获得在线用户表一条记录
     *
     * @param olid olid
     * @return 返回一条OnlineUserInfo
     **/
    public OnlineUserInfo GetOnlineuserByOlId(int olid) throws IOException {
        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        OnlineUserInfo OnlineUserInfo = onlineuserDao.GetOnlineuserByOlId(olid);
        close();
        return OnlineUserInfo;
    }


    /**
     * 获得在线用户表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnlineUserInfo
     **/
    public List<OnlineUserInfo> GetOnlineuserList(String condition, String sort) throws IOException {
        return GetOnlineuserList(1, 200, condition, sort);

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
        connection();
        OnlineUserDao onlineuserDao = sqlSession.getMapper(OnlineUserDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<OnlineUserInfo> onlineuserList = onlineuserDao.GetOnlineuserList(pageSize, count, condition, sort);

        close();
        return onlineuserList;
    }

    //endregion

    //region 在线时间表

    /**
     * 获得在线时间表数量
     *
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetOnlinetimeCount(String condition) throws IOException {
        connection();
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        int count = onlinetimeDao.GetOnlinetimeCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条在线时间表数据
     *
     * @param onlineTimeInfo 在线时间表模型
     * @return 返回创建信息
     **/
    public int CreateOnlinetime(OnlineTimeInfo onlineTimeInfo) throws IOException {
        connection();
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        onlinetimeDao.CreateOnlinetime(onlineTimeInfo);
        close();
        return 1;
    }


    /**
     * 更新一条在线时间表数据
     *
     * @param onLineTimeInfo 在线时间表模型
     **/
    public int UpdateOnlinetime(OnlineTimeInfo onLineTimeInfo) throws IOException {
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        onlinetimeDao.UpdateOnlinetime(onLineTimeInfo);
        close();
        return 1;
    }


    /**
     * 删除一条在线时间表数据
     *
     * @param uid 在线时间表模型
     **/
    public void DeleteOnlinetimeByUid(int uid) throws IOException {

        connection();
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        onlinetimeDao.DeleteOnlinetimeByUid(uid);
        close();
    }

    /**
     * 批量删除一批在线时间表数据
     **/
    public void DeleteOnlinetimeListByUid(String uidlist) throws IOException {
        connection();
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        onlinetimeDao.DeleteOnlinetimeListByUid(uidlist);
        close();

    }

    /**
     * 获得在线时间表一条记录
     *
     * @param uid uid
     * @return 返回一条OnLineTimeInfo
     **/
    public OnlineTimeInfo GetOnlinetimeByUid(int uid) throws IOException {
        connection();
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        OnlineTimeInfo onlineTimeInfo = onlinetimeDao.GetOnlinetimeByUid(uid);
        close();
        return onlineTimeInfo;
    }


    /**
     * 获得在线时间表数据列表
     *
     * @param condition 条件
     * @param sort      排序
     * @return 返回OnLineTimeInfo
     **/
    public List<OnlineTimeInfo> GetOnlinetimeList(String condition, String sort) throws IOException {
        return GetOnlinetimeList(1, 200, condition, sort);

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
        connection();
        OnlineTimeDao onlinetimeDao = sqlSession.getMapper(OnlineTimeDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<OnlineTimeInfo> onlinetimeList = onlinetimeDao.GetOnlinetimeList(pageSize, count, condition, sort);

        close();
        return onlinetimeList;
    }

    //endregion

    //region 开放授权表

    /**
     * 获得开放授权表数量
     * @param condition 条件
     * @return 返回数量
     **/
    public int GetOauthCount(String condition) throws IOException {
        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        int count = oauthDao.GetOauthCount(condition);

        close();
        return count;
    }


    /**
     * 创建一条开放授权表数据
     * @param oauthInfo 开放授权表模型
     * @return 返回创建信息
     **/
    public int CreateOauth(OauthInfo oauthInfo) throws IOException {
        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        oauthDao.CreateOauth(oauthInfo);
        close();
        return 1;
    }


    /**
     * 更新一条开放授权表数据
     * @param oauthInfo 开放授权表模型
     **/
    public int UpdateOauth(OauthInfo oauthInfo) throws IOException {
        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        oauthDao.UpdateOauth(oauthInfo);
        close();
        return 1;
    }


    /**
     * 删除一条开放授权表数据
     * @param id 开放授权表模型
     **/
    public void DeleteOauthById(int  id) throws IOException {

        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        oauthDao.DeleteOauthById(id);
        close();
    }

    /**
     * 批量删除一批开放授权表数据
     **/
    public void DeleteOauthListById(String idlist ) throws IOException {
        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        oauthDao.DeleteOauthListById(idlist);
        close();

    }

    /**
     * 获得开放授权表一条记录
     * @param  id   id
     * @return 返回一条OauthInfo
     **/
    public OauthInfo GetOauthById(int  id) throws IOException {
        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        OauthInfo oauthInfo = oauthDao.GetOauthById(id);
        close();
        return oauthInfo;
    }


    /**
     * 获得开放授权表数据列表
     * @param condition 条件
     * @param sort 排序
     * @return 返回OauthInfo
     **/
    public List<OauthInfo> GetOauthList(String condition,String sort) throws IOException {
        return GetOauthList(1,200,condition,sort);

    }


    /**
     * 获得开放授权表数据列表
     * @param pageSize 每页数
     * @param pageNumber 当前页数
     * @param condition 条件
     * @param sort 排序
     * @return 返回OauthInfo
     **/
    public List<OauthInfo> GetOauthList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
        connection();
        OauthDao oauthDao = sqlSession.getMapper(OauthDao.class);
        int count = (pageSize - 1) * pageNumber;

        List<OauthInfo > oauthList = oauthDao.GetOauthList(pageSize, count, condition, sort);

        close();
        return oauthList;
    }

    //endregion
}
