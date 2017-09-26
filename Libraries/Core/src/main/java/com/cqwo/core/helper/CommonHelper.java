package com.cqwo.core.helper;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



/**
 * Created by cqnews on 2017/3/20.
 */
public class CommonHelper {

    public static void Print() {

        System.out.print("hello");
    }

    /**
     * 去前导后导空格
     *
     * @param s
     * @return
     */
    public static String trim(String s) {
        if (s == null) s = "";

        return s.toString().trim();
    }

    /**
     * 错误信息处理
     *
     * @param errors 错误信息
     * @return
     */
    public static String dealErorr(Errors errors) {
        String info = "";
        if (errors.hasErrors()) {
            info = "参数错误：<br/>";
            List<FieldError> list = errors.getFieldErrors();
            for (int i = 0; i < list.size(); i++) {
                FieldError error = list.get(i);
                info += error.getField() + "===" + error.getDefaultMessage() + "<br/>";
            }
        }
        return info;
    }

    /**
     * 删除数字带0结尾的数据
     *
     * @param str 源字符串
     * @return
     */
    public static String dropNero(String str) {
        if (str == null) return "";
        str = str.trim();
        String ret = "";
        int len = str.indexOf(".");
        if (len == -1) return str;
        String one = str.substring(0, len);
        String two = str.substring(len + 1);//小数部分
        while (true) {
            if (two.length() == 0) break;
            String t = two.substring(two.length() - 1);
            if (t.equals("0")) two = two.substring(0, two.length() - 1);
            else break;
        }
        if (two.length() == 0) ret = one;
        else ret = one + "." + two;
        return ret;
    }

    /**
     * 创建utf文件
     *
     * @param filePath
     * @param content
     * @throws Exception
     */
    public static void createUtfFile(String filePath, String content) throws Exception {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");
        out.write(content);
        out.flush();
        out.close();

    }

    /**
     * @return String
     * @throws
     * @描述:null转化为""
     * @作者：Administrator
     * @创建日期： 2014-6-7 下午04:25:11
     */
    public static String isNull(Object s) {
        if (s == null) s = "";

        return s.toString().trim();
    }

    /**
     * @return String
     * @throws
     * @描述:获取天气预报数据
     * @作者：Administrator
     * @创建日期： Jun 11, 2014 9:43:40 AM
     */
    public static String getWeather() {
        String ret = "";
        HttpURLConnection urlcon = null;
        BufferedReader reader = null;

        try {
            //通知Java您要通过代理进行连接      
            System.getProperties().put("proxySet", "true");
            //指定代理所在的服务器       
            System.getProperties().put("proxyHost", "10.55.4.1");
            //指定代理监听的端口        
            System.getProperties().put("proxyPort", "8080");
            //long begintime = System.currentTimeMillis();
            URL url = new URL("http://api.map.baidu.com/telematics/v3/weather?location=%E9%87%8D%E5%BA%86&output=json&ak=VORWXzBy9c3BHcYp6YMYVijm");

            urlcon = (HttpURLConnection) url.openConnection();
            //urlcon.set
            urlcon.setConnectTimeout(10000);
            urlcon.setReadTimeout(10000);
            reader = new BufferedReader(new InputStreamReader(urlcon.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = reader.readLine()) != null) {
                sb.append(s);
            }
            ret = sb.toString();
            //System.out.println("总共执行时间为："+(System.currentTimeMillis()-begintime)+"毫秒");
            //ret=sb.toString();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            ret = "-1";
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            ret = "-1";
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    ret = "-1";
                    e.printStackTrace();
                }
            }
            if (urlcon != null) {
                urlcon.disconnect();
            }
        }
        return ret;
    }

}