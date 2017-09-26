/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.config.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by cqnews on 2017/4/13.
 */

@XmlAccessorType(XmlAccessType.PROPERTY)
// XML文件中的根标识
@XmlRootElement(name = "BaseConfigInfo")
public class BaseConfigInfo implements IConfigInfo {

    //region 站点信息

    /**
     * 项目名称
     */
    private String mallname = "青沃微云";

    /**
     * 网站网址
     */
    private String siteurl = "http://www.cqwo.com";
    /**
     * 网站标题
     */
    private String sitetitle = "青沃科技";
    /**
     * seo关键字
     */
    private String seokeyword = "青沃科技";
    /**
     * seo描述
     */
    private String seodescription = "青沃科技";
    /**
     * 备案编号
     */
    private String icp = "渝ICP备15003647号";
    /**
     * 脚本
     */
    private String script = "";
    /**
     * 是否显示版权(0代表不显示，1代表显示)
     */
    private int islicensed = 1;

    public String getMallname() {
        return mallname;
    }

    public void setMallname(String mallname) {
        this.mallname = mallname;
    }

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl;
    }

    public String getSitetitle() {
        return sitetitle;
    }

    public void setSitetitle(String sitetitle) {
        this.sitetitle = sitetitle;
    }

    public String getSeokeyword() {
        return seokeyword;
    }

    public void setSeokeyword(String seokeyword) {
        this.seokeyword = seokeyword;
    }

    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public int getIslicensed() {
        return islicensed;
    }

    public void setIslicensed(int islicensed) {
        this.islicensed = islicensed;
    }
//endregion

    //region 账号设置

    /**
     * 注册类型(1代表用户名注册，2代表邮箱注册，3代表手机注册，空字符串代表不允许注册)
     */
    private String regtype = "3";
    /**
     * 保留用户名
     */
    private String reservedname = "cqnews,admin,master,administrator,yjwwtu,liuyang,laijie";
    /**
     * 注册时间间隔(单位为秒，0代表无限制)
     */
    private int regtimespan = 0;
    /**
     * 是否发送欢迎信息(0代表不发送，1代表发送)
     */
    private int iswebcomemsg = 0;
    /**
     * 欢迎信息
     */
    private String webcomemsg = "欢迎来到我们的网站";
    /**
     * 登陆类型(1代表用户名登陆，2代表邮箱登陆，3代表手机登陆，空字符串代表不允许登陆)
     */
    private String logintype = "3";
    /**
     * 影子登录名
     */
    private String shadowname = "shadname";
    /**
     * 是否记住密码(0代表不记住，1代表记住)
     */
    private int isremember = 1;
    /**
     * 登陆失败次数
     */
    private int loginfailtimes = 0;

    public String getRegtype() {
        return regtype;
    }

    public void setRegtype(String regtype) {
        this.regtype = regtype;
    }

    public String getReservedname() {
        return reservedname;
    }

    public void setReservedname(String reservedname) {
        this.reservedname = reservedname;
    }

    public int getRegtimespan() {
        return regtimespan;
    }

    public void setRegtimespan(int regtimespan) {
        this.regtimespan = regtimespan;
    }

    public int getIswebcomemsg() {
        return iswebcomemsg;
    }

    public void setIswebcomemsg(int iswebcomemsg) {
        this.iswebcomemsg = iswebcomemsg;
    }

    public String getWebcomemsg() {
        return webcomemsg;
    }

    public void setWebcomemsg(String webcomemsg) {
        this.webcomemsg = webcomemsg;
    }

    public String getLogintype() {
        return logintype;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }

    public String getShadowname() {
        return shadowname;
    }

    public void setShadowname(String shadowname) {
        this.shadowname = shadowname;
    }

    public int getIsremember() {
        return isremember;
    }

    public void setIsremember(int isremember) {
        this.isremember = isremember;
    }

    public int getLoginfailtimes() {
        return loginfailtimes;
    }

    public void setLoginfailtimes(int loginfailtimes) {
        this.loginfailtimes = loginfailtimes;
    }

    //endregion

    //region 上传设置

    /**
     * 上传服务器
     */
    private String uploadserver = "";
    /**
     * 上传的图片类型,例如".jpg"
     */
    private String uploadimgtype = "";
    /**
     * 上传图片的大小(单位为字节)
     */
    private int uploadimgsize = 22;
    /**
     * 上传附件的类型,例如".zip"
     */
    private String uploadfiletype = "";
    /**
     * 上传附件的大小(单位为字节)
     */
    private int uploadfilesize = 22;
    /**
     * 水印类型(0代表没有水印，1代表文字水印，2代表图片水印)
     */
    private int watermarktype = 0;
    /**
     * 水印质量(必须位于0到100之间)
     */
    private int watermarkquality = 0;
    /**
     * 水印位置(1代表上左，2代表上中，3代表上右，4代表中左，5代表中中，6代表中右，7代表下左，8代表下中，9代表下右)
     */
    private int watermarkposition = 9;
    /**
     * 水印图片
     */
    private String watermarkimg = "watermark.png";
    /**
     * 水印图片透明度(必须位于1到10之间)
     */
    private int watermarkimgopacity = 0;
    /**
     * 水印文字
     */
    private String watermarktext = "青沃科技";
    /**
     * 水印文字字体
     */
    private String watermarktextfont = "Microsoft Yahei";
    /**
     * 水印文字大小
     */
    private int watermarktextsize = 14;

    public String getUploadserver() {
        return uploadserver;
    }

    public void setUploadserver(String uploadserver) {
        this.uploadserver = uploadserver;
    }

    public String getUploadimgtype() {
        return uploadimgtype;
    }

    public void setUploadimgtype(String uploadimgtype) {
        this.uploadimgtype = uploadimgtype;
    }

    public int getUploadimgsize() {
        return uploadimgsize;
    }

    public void setUploadimgsize(int uploadimgsize) {
        this.uploadimgsize = uploadimgsize;
    }

    public String getUploadfiletype() {
        return uploadfiletype;
    }

    public void setUploadfiletype(String uploadfiletype) {
        this.uploadfiletype = uploadfiletype;
    }

    public int getUploadfilesize() {
        return uploadfilesize;
    }

    public void setUploadfilesize(int uploadfilesize) {
        this.uploadfilesize = uploadfilesize;
    }

    public int getWatermarktype() {
        return watermarktype;
    }

    public void setWatermarktype(int watermarktype) {
        this.watermarktype = watermarktype;
    }

    public int getWatermarkquality() {
        return watermarkquality;
    }

    public void setWatermarkquality(int watermarkquality) {
        this.watermarkquality = watermarkquality;
    }

    public int getWatermarkposition() {
        return watermarkposition;
    }

    public void setWatermarkposition(int watermarkposition) {
        this.watermarkposition = watermarkposition;
    }

    public String getWatermarkimg() {
        return watermarkimg;
    }

    public void setWatermarkimg(String watermarkimg) {
        this.watermarkimg = watermarkimg;
    }

    public int getWatermarkimgopacity() {
        return watermarkimgopacity;
    }

    public void setWatermarkimgopacity(int watermarkimgopacity) {
        this.watermarkimgopacity = watermarkimgopacity;
    }

    public String getWatermarktext() {
        return watermarktext;
    }

    public void setWatermarktext(String watermarktext) {
        this.watermarktext = watermarktext;
    }

    public String getWatermarktextfont() {
        return watermarktextfont;
    }

    public void setWatermarktextfont(String watermarktextfont) {
        this.watermarktextfont = watermarktextfont;
    }

    public int getWatermarktextsize() {
        return watermarktextsize;
    }

    public void setWatermarktextsize(int watermarktextsize) {
        this.watermarktextsize = watermarktextsize;
    }

    //endregion

    //region 性能设置

    /**
     * 图片cdn(不能以"/"结尾)
     */
    private String imagecdn = "";
    /**
     * csscdn(不能以"/"结尾)
     */
    private String csscdn = "";
    /**
     * 脚本cdn(不能以"/"结尾)
     */
    private String scriptcdn = "";
    /**
     * 在线用户过期时间(单位为分钟)
     */
    private int onlineuserexpire = 10;
    /**
     * 最大在线人数
     */
    private int maxonlinecount = 1000;
    /**
     * 在线人数缓存时间(单位为分钟,0代表即时数量)
     */
    private int onlinecountexpire = 5;
    /**
     * 更新用户在线时间间隔(单位为分钟,0代表不更新)
     */
    private int updateonlinetimespan = 5;
    /**
     * 是否统计浏览器(0代表不统计，1代表统计)
     */
    private int isstatbrowser = 1;
    /**
     * 是否统计操作系统(0代表不统计，1代表统计)
     */
    private int isstatos = 1;
    /**
     * 是否统计区域(0代表不统计，1代表统计)
     */
    private int isstatregion = 1;

    public String getImagecdn() {
        return imagecdn;
    }

    public void setImagecdn(String imagecdn) {
        this.imagecdn = imagecdn;
    }

    public String getCsscdn() {
        return csscdn;
    }

    public void setCsscdn(String csscdn) {
        this.csscdn = csscdn;
    }

    public String getScriptcdn() {
        return scriptcdn;
    }

    public void setScriptcdn(String scriptcdn) {
        this.scriptcdn = scriptcdn;
    }

    public int getOnlineuserexpire() {
        return onlineuserexpire;
    }

    public void setOnlineuserexpire(int onlineuserexpire) {
        this.onlineuserexpire = onlineuserexpire;
    }

    public int getMaxonlinecount() {
        return maxonlinecount;
    }

    public void setMaxonlinecount(int maxonlinecount) {
        this.maxonlinecount = maxonlinecount;
    }

    public int getOnlinecountexpire() {
        return onlinecountexpire;
    }

    public void setOnlinecountexpire(int onlinecountexpire) {
        this.onlinecountexpire = onlinecountexpire;
    }

    public int getUpdateonlinetimespan() {
        return updateonlinetimespan;
    }

    public void setUpdateonlinetimespan(int updateonlinetimespan) {
        this.updateonlinetimespan = updateonlinetimespan;
    }

    public int getIsstatbrowser() {
        return isstatbrowser;
    }

    public void setIsstatbrowser(int isstatbrowser) {
        this.isstatbrowser = isstatbrowser;
    }

    public int getIsstatos() {
        return isstatos;
    }

    public void setIsstatos(int isstatos) {
        this.isstatos = isstatos;
    }

    public int getIsstatregion() {
        return isstatregion;
    }

    public void setIsstatregion(int isstatregion) {
        this.isstatregion = isstatregion;
    }

    //endregion

    //region 访问控制

    /**
     * 是否关闭项目(0代表打开，1代表关闭)
     */
    private int isclosed = 0;
    /**
     * 商城关闭原因
     */
    private String closereason = "";
    /**
     * 禁止访问时间
     */
    private String banaccesstime = "";
    /**
     * 禁止访问ip
     */
    private String banaccessip = "";
    /**
     * 允许访问ip
     */
    private String allowaccessip = "";
    /**
     * 后台允许访问ip
     */
    private String adminallowaccessip = "";
    /**
     * 密钥
     */
    private String secretkey = "12345678";
    /**
     * cookie的有效域
     */
    private String cookiedomain = "";
    /**
     * 随机库
     */
    private String randomlibrary = "";
    /**
     * 使用验证码的页面
     */
    private String verifypages = "";
    /**
     * 忽略词
     */
    private String ignorewords = "";
    /**
     * 允许的邮箱提供者
     */
    private String allowemailprovider = "";
    /**
     * 禁止的邮箱提供者
     */
    private String banemailprovider = "";

    public int getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(int isclosed) {
        this.isclosed = isclosed;
    }

    public String getClosereason() {
        return closereason;
    }

    public void setClosereason(String closereason) {
        this.closereason = closereason;
    }

    public String getBanaccesstime() {
        return banaccesstime;
    }

    public void setBanaccesstime(String banaccesstime) {
        this.banaccesstime = banaccesstime;
    }

    public String getBanaccessip() {
        return banaccessip;
    }

    public void setBanaccessip(String banaccessip) {
        this.banaccessip = banaccessip;
    }

    public String getAllowaccessip() {
        return allowaccessip;
    }

    public void setAllowaccessip(String allowaccessip) {
        this.allowaccessip = allowaccessip;
    }

    public String getAdminallowaccessip() {
        return adminallowaccessip;
    }

    public void setAdminallowaccessip(String adminallowaccessip) {
        this.adminallowaccessip = adminallowaccessip;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public String getCookiedomain() {
        return cookiedomain;
    }

    public void setCookiedomain(String cookiedomain) {
        this.cookiedomain = cookiedomain;
    }

    public String getRandomlibrary() {
        return randomlibrary;
    }

    public void setRandomlibrary(String randomlibrary) {
        this.randomlibrary = randomlibrary;
    }

    public String getVerifypages() {
        return verifypages;
    }

    public void setVerifypages(String verifypages) {
        this.verifypages = verifypages;
    }

    public String getIgnorewords() {
        return ignorewords;
    }

    public void setIgnorewords(String ignorewords) {
        this.ignorewords = ignorewords;
    }

    public String getAllowemailprovider() {
        return allowemailprovider;
    }

    public void setAllowemailprovider(String allowemailprovider) {
        this.allowemailprovider = allowemailprovider;
    }

    public String getBanemailprovider() {
        return banemailprovider;
    }

    public void setBanemailprovider(String banemailprovider) {
        this.banemailprovider = banemailprovider;
    }


    //endregion


    public BaseConfigInfo() {
    }

    public BaseConfigInfo(String mallname, String siteurl, String sitetitle, String seokeyword, String seodescription, String icp, String script, int islicensed, String regtype, String reservedname, int regtimespan, int iswebcomemsg, String webcomemsg, String logintype, String shadowname, int isremember, int loginfailtimes, String uploadserver, String uploadimgtype, int uploadimgsize, String uploadfiletype, int uploadfilesize, int watermarktype, int watermarkquality, int watermarkposition, String watermarkimg, int watermarkimgopacity, String watermarktext, String watermarktextfont, int watermarktextsize, String imagecdn, String csscdn, String scriptcdn, int onlineuserexpire, int maxonlinecount, int onlinecountexpire, int updateonlinetimespan, int isstatbrowser, int isstatos, int isstatregion, int isclosed, String closereason, String banaccesstime, String banaccessip, String allowaccessip, String adminallowaccessip, String secretkey, String cookiedomain, String randomlibrary, String verifypages, String ignorewords, String allowemailprovider, String banemailprovider) {
        this.mallname = mallname;
        this.siteurl = siteurl;
        this.sitetitle = sitetitle;
        this.seokeyword = seokeyword;
        this.seodescription = seodescription;
        this.icp = icp;
        this.script = script;
        this.islicensed = islicensed;
        this.regtype = regtype;
        this.reservedname = reservedname;
        this.regtimespan = regtimespan;
        this.iswebcomemsg = iswebcomemsg;
        this.webcomemsg = webcomemsg;
        this.logintype = logintype;
        this.shadowname = shadowname;
        this.isremember = isremember;
        this.loginfailtimes = loginfailtimes;
        this.uploadserver = uploadserver;
        this.uploadimgtype = uploadimgtype;
        this.uploadimgsize = uploadimgsize;
        this.uploadfiletype = uploadfiletype;
        this.uploadfilesize = uploadfilesize;
        this.watermarktype = watermarktype;
        this.watermarkquality = watermarkquality;
        this.watermarkposition = watermarkposition;
        this.watermarkimg = watermarkimg;
        this.watermarkimgopacity = watermarkimgopacity;
        this.watermarktext = watermarktext;
        this.watermarktextfont = watermarktextfont;
        this.watermarktextsize = watermarktextsize;
        this.imagecdn = imagecdn;
        this.csscdn = csscdn;
        this.scriptcdn = scriptcdn;
        this.onlineuserexpire = onlineuserexpire;
        this.maxonlinecount = maxonlinecount;
        this.onlinecountexpire = onlinecountexpire;
        this.updateonlinetimespan = updateonlinetimespan;
        this.isstatbrowser = isstatbrowser;
        this.isstatos = isstatos;
        this.isstatregion = isstatregion;
        this.isclosed = isclosed;
        this.closereason = closereason;
        this.banaccesstime = banaccesstime;
        this.banaccessip = banaccessip;
        this.allowaccessip = allowaccessip;
        this.adminallowaccessip = adminallowaccessip;
        this.secretkey = secretkey;
        this.cookiedomain = cookiedomain;
        this.randomlibrary = randomlibrary;
        this.verifypages = verifypages;
        this.ignorewords = ignorewords;
        this.allowemailprovider = allowemailprovider;
        this.banemailprovider = banemailprovider;
    }


    @Override
    public String toString() {
        return "BaseConfigInfo{" + "mallname='" + mallname + '\'' + ", siteurl='" + siteurl + '\'' + ", sitetitle='" + sitetitle + '\'' + ", seokeyword='" + seokeyword + '\'' + ", seodescription='" + seodescription + '\'' + ", icp='" + icp + '\'' + ", script='" + script + '\'' + ", islicensed=" + islicensed + ", regtype='" + regtype + '\'' + ", reservedname='" + reservedname + '\'' + ", regtimespan=" + regtimespan + ", iswebcomemsg=" + iswebcomemsg + ", webcomemsg='" + webcomemsg + '\'' + ", logintype='" + logintype + '\'' + ", shadowname='" + shadowname + '\'' + ", isremember=" + isremember + ", loginfailtimes=" + loginfailtimes + ", uploadserver='" + uploadserver + '\'' + ", uploadimgtype='" + uploadimgtype + '\'' + ", uploadimgsize=" + uploadimgsize + ", uploadfiletype='" + uploadfiletype + '\'' + ", uploadfilesize=" + uploadfilesize + ", watermarktype=" + watermarktype + ", watermarkquality=" + watermarkquality + ", watermarkposition=" + watermarkposition + ", watermarkimg='" + watermarkimg + '\'' + ", watermarkimgopacity=" + watermarkimgopacity + ", watermarktext='" + watermarktext + '\'' + ", watermarktextfont='" + watermarktextfont + '\'' + ", watermarktextsize=" + watermarktextsize + ", imagecdn='" + imagecdn + '\'' + ", csscdn='" + csscdn + '\'' + ", scriptcdn='" + scriptcdn + '\'' + ", onlineuserexpire=" + onlineuserexpire + ", maxonlinecount=" + maxonlinecount + ", onlinecountexpire=" + onlinecountexpire + ", updateonlinetimespan=" + updateonlinetimespan + ", isstatbrowser=" + isstatbrowser + ", isstatos=" + isstatos + ", isstatregion=" + isstatregion + ", isclosed=" + isclosed + ", closereason='" + closereason + '\'' + ", banaccesstime='" + banaccesstime + '\'' + ", banaccessip='" + banaccessip + '\'' + ", allowaccessip='" + allowaccessip + '\'' + ", adminallowaccessip='" + adminallowaccessip + '\'' + ", secretkey='" + secretkey + '\'' + ", cookiedomain='" + cookiedomain + '\'' + ", randomlibrary='" + randomlibrary + '\'' + ", verifypages='" + verifypages + '\'' + ", ignorewords='" + ignorewords + '\'' + ", allowemailprovider='" + allowemailprovider + '\'' + ", banemailprovider='" + banemailprovider + '\'' + '}';
    }
}
