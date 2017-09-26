package com.cqwo.core.log;

/**
 * Created by cqnews on 2017/4/11.
 */
public class Log {

    /**
     Log.v(tag,message);        //verbose模式,打印最详细的日志
     Log.d(tag,message);        //debug级别的日志
     Log.i(tag,message);        //info级别的日志
     Log.w(tag,message);        //warn级别的日志
     Log.e(tag,message);        //error级别的日志
     */


    /**
     * 日志打印
     * @param tag
     * @param messaage
     */
    public static void v(String tag,String messaage){
        System.out.println(tag+":"+messaage);
    }
    /**
     * 日志打印
     * @param tag
     * @param messaage
     */
    public static void d(String tag,String messaage){
        e(tag,messaage);
    }
    /**
     * 日志打印
     * @param tag
     * @param messaage
     */
    public static void i(String tag,String messaage){
        e(tag,messaage);
    }
    /**
     * 日志打印
     * @param tag
     * @param messaage
     */
    public static void w(String tag,String messaage){
        e(tag,messaage);
    }
    /**
     * 日志打印
     * @param tag
     * @param messaage
     */
    public static void e(String tag,String messaage){
        e(tag,messaage);
    }
}
