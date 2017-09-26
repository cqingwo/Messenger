/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.strategy.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 记录日志的类 主要输出字符串
 * Created by cqnews on 2017/4/16.
 */
public class Log4jHelper {

    private static Log4jHelper log4jHelper;
    private Logger logger;

    public Log4jHelper(String configPath) {
        PropertyConfigurator.configure(configPath);
        // this.logger = Logger.getRootLogger();
        this.logger = Logger.getLogger(Log4jHelper.class);
    }

    public static Log4jHelper getLog4jHelper() {
        if (log4jHelper == null) {
            log4jHelper = new Log4jHelper("log4j.properties");
        }
        return log4jHelper;
    }

    public static void debug(String str) {
        log4jHelper.logger.debug(str);
    }

    public static void info(String str) {
        log4jHelper.logger.info(str);
    }

    public static void warn(String str) {
        log4jHelper.logger.warn(str);
    }

    public static void error(String str) {
        log4jHelper.logger.error(str);
    }

    public static void fatal(String str) {
        log4jHelper.logger.fatal(str);
    }

    public static void main(String[] args) {
        // 测试字符串
        // testString();

        // 测试数组
        // Object[] array = new Object[] { "测试array", "测试array1", "测试array2" };
        // testArray(array);

        // 测试List集合
        // //List放的是字符串
        // List<String> list = new ArrayList<String>();
        // list.add("测试list1");
        // list.add("测试list2");
        // list.add("测试list3");
        // //List放的是对象。
        // List<Student> list = new ArrayList<Student>();
        // for (int i = 0; i < 3; i++) {
        // Student s = new Student();
        // s.setId(i);
        // s.setName("name"+i);
        // list.add(s);
        // }
        // testList(list);

        //测试map集合
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 3; i++) {
            map.put("teacher" + i, "student" + i);
        }
        testMap(map);
    }

    public static void testString() {
        Log4jHelper Log4jHelper = log4jHelper.getLog4jHelper();
        String debug = "debug信息";
        String warn = "warn信息";
        String info = "info信息";
        String error = "error信息";
        String fatal = "fatal信息";
        Log4jHelper.debug(debug);
        Log4jHelper.warn(warn);
        Log4jHelper.info(info);
        Log4jHelper.error(error);
        Log4jHelper.fatal(fatal);
    }

    public static void testArray(Object[] array) {
        Log4jHelper Log4jHelper = log4jHelper.getLog4jHelper();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            // System.out.println("第"+i+"号元素的值："+Array.get(array, i));
            Log4jHelper.debug("第" + i + "号元素的值：" + Array.get(array, i));
        }
    }

    public static <T> void testList(List<T> list) {
        Log4jHelper Log4jHelper = log4jHelper.getLog4jHelper();
        if (list == null) {
            Log4jHelper.error("list=null");
        } else if (list.size() == 0) {
            Log4jHelper.info("list.size()为0");
        } else {
            StringBuffer sb = new StringBuffer();
            String s = new String("list中数据个数：" + list.size());
            sb.append("\r\n" + s + "\r\nstart:----------------------\r\n");
            for (T t : list) {
                sb.append(t.toString() + "\r\n");// 这里List包含的类要有自定义的toString方法
            }
            sb.append("end----------------------\r\n");
            Log4jHelper.debug(sb.toString());
        }
    }

    public static <V, K> void testMap(Map<K, V> map) {
        // Map<Student, Student> mapTemp = new HashMap<Student, Student>();
        Log4jHelper Log4jHelper = log4jHelper.getLog4jHelper();
        if (map == null) {
            Log4jHelper.error("map=null");
        } else if (map.size() == 0) {
            Log4jHelper.info("map.size()为0");
        } else {
            StringBuffer sb = new StringBuffer();
            String s = new String("map中数据个数：" + map.size());
            sb.append("\r\n" + s + "\r\nstart:----------------------\r\n");
            for (K k : map.keySet()) {
                sb.append("key[" + k.toString() + "]所对应的value:[" + map.get(k).toString() + "]\r\n");// 这里List包含的类要有自定义的toString方法
            }
            sb.append("end----------------------\r\n");
            Log4jHelper.debug(sb.toString());
        }
    }

    public static void test2() {
        PropertyConfigurator.configure("log4j.properties");
        // Logger logger = Logger.getLogger(Log4jTest1.class);
        Logger logger = Logger.getRootLogger();
        // for (int i = 0; i < 1000; i++) {
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        // }
    }


}
