package com.cqwo.web.framework.workcontext;

import com.cqwo.core.CWMVersion;
import com.cqwo.core.config.info.BaseConfigInfo;
import com.cqwo.core.domain.MallAdminGroupInfo;
import com.cqwo.core.domain.PartUserInfo;
import com.cqwo.core.domain.RegionInfo;
import com.cqwo.core.domain.UserRankInfo;

public abstract class BaseWorkContext {

	/**
	 * 项目基本配置
	 */
	private BaseConfigInfo baseConfigInfo = new BaseConfigInfo();

	/**
	 * 当前请求是否为ajax请求
	 */
	private boolean isHttpAjax = false;
    /**
     *用户ip
     */
	private String IP;//用户ip

    /**
     *区域信息
     */
    private RegionInfo regionInfo;//区域信息

    /**
     *区域id
     */
	private int regionId;//区域id

    /**
     *当前url
     */
	private String url;//当前url

    /**
     *上一次访问的url
     */
	private String urlReferrer;//上一次访问的url

    /**
     *用户sid
     */
	private String sid;//用户sid

    /**
     *用户id
     */
	private int uid = -1;//用户id

    /**
     *用户名
     */
	private String userName;//用户名

    /**
     *用户邮箱
     */
	private String userEmail;//用户邮箱

    /**
     *用户手机号
     */
	private String userMobile;//用户手机号

    /**
     *用户昵称
     */
	private String nickName;//用户昵称

    /**
     *用户头像
     */
	private String avatar;//用户头像

    /**
     *用户密码
     */
	private String password;//用户密码

    /**
     *加密密码
     */
	private String encryptPwd;//加密密码

    /**
     *支付积分名称
     */
	private String payCreditName;//支付积分名称

    /**
     *支付积分数量
     */
	private int payCreditCount = 0;//支付积分数量

    /**
     *等级积分名称
     */
	private String rankCreditName;//等级积分名称

    /**
     *等级积分数量
     */
	private int rankCreditCount = 0;//等级积分数量

    /**
     *用户信息
     */
	private PartUserInfo partUserInfo;//用户信息

    /**
     *用户等级id
     */
	private int UserRid = -1;//用户等级id

    /**
     *用户等级信息
     */
    private UserRankInfo userRankInfo;//用户等级信息

    /**
     *用户等级标题
     */
	private String UserRTitle;//用户等级标题

    /**
     *用户软件管理员组id
     */
	private int MallAGid = -1;//用户软件管理员组id

    /**
     *用户软件管理员组信息
     */
	private MallAdminGroupInfo mallAdminGroupInfo;//用户软件管理员组信息

    /**
     *控制器
     */
	private String Controller;//控制器

    /**
     *动作方法
     */
	private String Action;//动作方法

    /**
     *页面标示符
     */
	private String PageKey;//页面标示符

    /**
     *图片cdn
     */
	private String ImageCDN;//图片cdn

    /**
     *csscdn
     */
	private String CSSCDN;//csscdn

    /**
     *脚本cdn
     */
	private String ScriptCDN;//脚本cdn

    /**
     *在线总人数
     */
	private int OnlineUserCount = 0;//在线总人数

    /**
     *在线会员数
     */
	private int OnlineMemberCount = 0;//在线会员数

    /**
     *在线游客数
     */
	private int OnlineGuestCount = 0;//在线游客数



    /**
     *页面执行时间
     */
	private double ExecuteTime;//页面执行时间

    /**
     *执行的sql语句数目
     */
	private int ExecuteCount = 0;//执行的sql语句数目

    /**
     *执行的sql语句细节
     */
	private String ExecuteDetail;//执行的sql语句细节

    /**
     *软件版本
     */
	private String MallVersion = CWMVersion.VERSION;//软件版本

    /**
     *软件版权
     */
	private String MallCopyright = CWMVersion.COPYRIGHT;//软件版权




    public BaseConfigInfo getBaseConfigInfo() {
        return baseConfigInfo;
    }

    public void setBaseConfigInfo(BaseConfigInfo baseConfigInfo) {
        this.baseConfigInfo = baseConfigInfo;
    }

    public boolean isHttpAjax() {
        return isHttpAjax;
    }

    public void setHttpAjax(boolean httpAjax) {
        isHttpAjax = httpAjax;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public RegionInfo getRegionInfo() {
        return regionInfo;
    }

    public void setRegionInfo(RegionInfo regionInfo) {
        this.regionInfo = regionInfo;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlReferrer() {
        return urlReferrer;
    }

    public void setUrlReferrer(String urlReferrer) {
        this.urlReferrer = urlReferrer;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptPwd() {
        return encryptPwd;
    }

    public void setEncryptPwd(String encryptPwd) {
        this.encryptPwd = encryptPwd;
    }

    public String getPayCreditName() {
        return payCreditName;
    }

    public void setPayCreditName(String payCreditName) {
        this.payCreditName = payCreditName;
    }

    public int getPayCreditCount() {
        return payCreditCount;
    }

    public void setPayCreditCount(int payCreditCount) {
        this.payCreditCount = payCreditCount;
    }

    public String getRankCreditName() {
        return rankCreditName;
    }

    public void setRankCreditName(String rankCreditName) {
        this.rankCreditName = rankCreditName;
    }

    public int getRankCreditCount() {
        return rankCreditCount;
    }

    public void setRankCreditCount(int rankCreditCount) {
        this.rankCreditCount = rankCreditCount;
    }

    public PartUserInfo getPartUserInfo() {
        return partUserInfo;
    }

    public void setPartUserInfo(PartUserInfo partUserInfo) {
        this.partUserInfo = partUserInfo;
    }

    public int getUserRid() {
        return UserRid;
    }

    public void setUserRid(int userRid) {
        UserRid = userRid;
    }

    public UserRankInfo getUserRankInfo() {
        return userRankInfo;
    }

    public void setUserRankInfo(UserRankInfo userRankInfo) {
        this.userRankInfo = userRankInfo;
    }

    public String getUserRTitle() {
        return UserRTitle;
    }

    public void setUserRTitle(String userRTitle) {
        UserRTitle = userRTitle;
    }

    public int getMallAGid() {
        return MallAGid;
    }

    public void setMallAGid(int mallAGid) {
        MallAGid = mallAGid;
    }

    public MallAdminGroupInfo getMallAdminGroupInfo() {
        return mallAdminGroupInfo;
    }

    public void setMallAdminGroupInfo(MallAdminGroupInfo mallAdminGroupInfo) {
        this.mallAdminGroupInfo = mallAdminGroupInfo;
    }

    public String getController() {
        return Controller;
    }

    public void setController(String controller) {
        Controller = controller;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getPageKey() {
        return PageKey;
    }

    public void setPageKey(String pageKey) {
        PageKey = pageKey;
    }

    public String getImageCDN() {
        return ImageCDN;
    }

    public void setImageCDN(String imageCDN) {
        ImageCDN = imageCDN;
    }

    public String getCSSCDN() {
        return CSSCDN;
    }

    public void setCSSCDN(String CSSCDN) {
        this.CSSCDN = CSSCDN;
    }

    public String getScriptCDN() {
        return ScriptCDN;
    }

    public void setScriptCDN(String scriptCDN) {
        ScriptCDN = scriptCDN;
    }

    public int getOnlineUserCount() {
        return OnlineUserCount;
    }

    public void setOnlineUserCount(int onlineUserCount) {
        OnlineUserCount = onlineUserCount;
    }

    public int getOnlineMemberCount() {
        return OnlineMemberCount;
    }

    public void setOnlineMemberCount(int onlineMemberCount) {
        OnlineMemberCount = onlineMemberCount;
    }

    public int getOnlineGuestCount() {
        return OnlineGuestCount;
    }

    public void setOnlineGuestCount(int onlineGuestCount) {
        OnlineGuestCount = onlineGuestCount;
    }

    public double getExecuteTime() {
        return ExecuteTime;
    }

    public void setExecuteTime(double executeTime) {
        ExecuteTime = executeTime;
    }

    public int getExecuteCount() {
        return ExecuteCount;
    }

    public void setExecuteCount(int executeCount) {
        ExecuteCount = executeCount;
    }

    public String getExecuteDetail() {
        return ExecuteDetail;
    }

    public void setExecuteDetail(String executeDetail) {
        ExecuteDetail = executeDetail;
    }

    public String getMallVersion() {
        return MallVersion;
    }

    public String getMallCopyright() {
        return MallCopyright;
    }
}
