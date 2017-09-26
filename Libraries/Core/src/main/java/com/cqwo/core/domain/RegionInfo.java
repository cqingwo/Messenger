/**
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.domain;

import java.io.Serializable;

//区域表
public class RegionInfo implements Serializable {

    /**
     * 区域id
     **/
    private int regionid;
    /**
     * 名称
     **/
    private String name;
    /**
     * 拼写
     **/
    private String spell;
    /**
     * 简拼
     **/
    private String shortspell;
    /**
     * 排序
     **/
    private int displayorder;
    /**
     * 父id
     **/
    private int parentid;
    /**
     * 级别
     **/
    private int layer;
    /**
     * 省id
     **/
    private int provinceid;
    /**
     * 省名称
     **/
    private String provincename;
    /**
     * 市id
     **/
    private int cityid;
    /**
     * 市名称
     **/
    private String cityname;

    public RegionInfo(int regionid, String name, String spell, String shortspell, int displayorder, int parentid, int layer, int provinceid, String provincename, int cityid, String cityname) {
        this.regionid = regionid;
        this.name = name;
        this.spell = spell;
        this.shortspell = shortspell;
        this.displayorder = displayorder;
        this.parentid = parentid;
        this.layer = layer;
        this.provinceid = provinceid;
        this.provincename = provincename;
        this.cityid = cityid;
        this.cityname = cityname;
    }

    public RegionInfo() {
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getShortspell() {
        return shortspell;
    }

    public void setShortspell(String shortspell) {
        this.shortspell = shortspell;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @Override
    public String toString() {
        return "RegionInfo{" +
                "regionid=" + regionid +
                ", name='" + name + '\'' +
                ", spell='" + spell + '\'' +
                ", shortspell='" + shortspell + '\'' +
                ", displayorder=" + displayorder +
                ", parentid=" + parentid +
                ", layer=" + layer +
                ", provinceid=" + provinceid +
                ", provincename='" + provincename + '\'' +
                ", cityid=" + cityid +
                ", cityname='" + cityname + '\'' +
                '}';
    }
}
