package com.cqwo.web.framework;

public class PromptModel {


    /**
     * 提示信息
     */
    private String  message = "";

    /**
     * 返回地址
     */
    private String backUrl = "";


    /**
     * 倒计时模型
     */
    private int countdownmodel = 0;

    /**
     * 倒计时时间
     */
    private int countdowntime = 5;

    /**
     * 是否显示返回地址
     */
    private boolean isIsshowbacklink = true;

    /**
     * 是否自动返回
     */
    private boolean isIsautoback = true;

    /**
     * 模型构造函数
     * @param message 消息
     */
    public PromptModel(String message) {
        this.message = message;
    }

    /**
     * 模型构造函数
     * @param message 消息
     * @param backUrl 返回地址
     */
    public PromptModel(String message, String backUrl) {
        this.backUrl = backUrl;
        this.message = message;
    }

    /**
     * 模型构造函数
     * @param backUrl 返回地址
     * @param message 消息
     * @param isautoback 是否自动返回
     */
    public PromptModel(String message, String backUrl,  Boolean isautoback) {
        this.backUrl = backUrl;
        this.message = message;
        this.isIsautoback = isautoback;
    }

    /**
     * 模型构造函数
     * @param message 消息
     * @param backUrl 返回地址
     * @param countdowntime 倒计时时间
     */
    public PromptModel(String message, String backUrl, int countdowntime) {
        this.message = message;
        this.backUrl = backUrl;
        this.countdowntime = countdowntime;
    }

    /**
     * 模型构造函数
     * @param backUrl 返回地址
     * @param message 消息
     * @param countdownmodel 计数模型
     * @param countdowntime  倒计时时间
     * @param isshowbacklink 是否显示返回地址
     * @param isautoback 是否自动返回
     */
    public PromptModel(String message,String backUrl, int countdownmodel, int countdowntime, boolean isshowbacklink,boolean isautoback) {
        this.message = message;
        this.backUrl = backUrl;
        this.countdownmodel = countdownmodel;
        this.countdowntime = countdowntime;
        this.isIsshowbacklink = isshowbacklink;
        this.isIsautoback = isautoback;
    }


    public String getMessage() {
        return message;
    }

    public String getbackUrl() {
        return backUrl;
    }

    public int getCountdownmodel() {
        return countdownmodel;
    }

    public int getCountdowntime() {
        return countdowntime;
    }

    public boolean isIsshowbacklink() {
        return isIsshowbacklink;
    }

    public boolean isIsautoback() {
        return isIsautoback;
    }

}
