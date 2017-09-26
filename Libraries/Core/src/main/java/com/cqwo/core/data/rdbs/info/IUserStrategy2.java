package com.cqwo.core.data.rdbs.info;

import com.cqwo.core.domain.OnlineUserInfo;

import java.util.List;

/**
 * Created by cqnews on 2017/4/10.
 */
public interface  IUserStrategy2 {

    //region 在线用户

    /**
     * 创建在线用户
     * @param onlineUserInfo 在线用户
     * @return
     */
    int CreateOnlineUser(OnlineUserInfo onlineUserInfo);

    /**
     * 更新在线用户ip
     * @param olId 在线用户id
     * @param ip ip
     */
    void UpdateOnlineUserIP(int olId, String ip);

    /**
     * 更新在线用户uid
     * @param olId 在线用户id
     * @param uid uid
     */
    void UpdateOnlineUserUid(int olId, int uid);

    /**
     * 获得在线用户
     * @param sid sessionId
     * @return
     */
    List<OnlineUserInfo> GetOnlineUserBySid(String sid);

    /**
    * 获得在线用户数量
     * @param userType 在线用户类型
     **/
    int GetOnlineUserCount(int userType);

    /**
     * 删除在线用户
     * @param sid
     */
    void DeleteOnlineUserBySid(String sid);

    /**
     * 删除过期在线用户
     * @param onlineUserExpire 过期时间
     */
    void DeleteExpiredOnlineUser(int onlineUserExpire);

    /**
     * 重置在线用户表
     */
    void ResetOnlineUserTable();

    /**
     * 获得在线用户列表
     * @param pageSize 每页数
     * @param pageNumber 当前页数
     * @param locationType 位置类型(0代表省,1代表市,2代表区或县)
     * @param locationId 位置id
     * @param sort 排序
     * @return
     */
    List<OnlineUserInfo> GetOnlineUserList(int pageSize, int pageNumber, int locationType, int locationId, String sort);

    /**
     * 获得在线用户列表排序
     * @param sortColumn 排序列
     * @param sortDirection 排序方向
     * @return
     */
    String GetOnlineUserListSort(String sortColumn, String sortDirection);

    /**
     * 获得在线用户数量
     * @param locationType 位置类型(0代表省,1代表市,2代表区或县)
     * @param locationId 位置id
     * @return
     */
    int GetOnlineUserCount(int locationType, int locationId);

    //endregion

}
