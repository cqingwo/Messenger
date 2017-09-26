package com.cqwo.core.helper;

import com.cqwo.core.log.Log;

/**
 * Created by cqnews on 2017/3/20.
 */
public class TypeHelper {

    /// <summary>
    /// 将string类型转换成int类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static int StringToInt(String s) {
        return StringToInt(s, 0);
    }

    /// <summary>
    /// 将string类型转换成int类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static int StringToInt(Object s, int defaultValue) {
        try {

            if (s != null)
                return Integer.parseInt(s.toString());
            else
                return defaultValue;

        } catch (Exception e) {
            Log.e("ERROR", e.toString());
            return defaultValue;
        }
    }

    public static int ObjectToInt(Object o) {

        return ObjectToInt(o, 0);
    }

    private static int ObjectToInt(Object o, int defaultValue) {
        try {
            return  (Integer) o;
        } catch (Exception e) {
            return defaultValue;
        }
    }


    /// <summary>
    /// 将int类型转换成string类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static String IntToString(int s) {
        return IntToString(s, "0");
    }

    /// <summary>
    /// 将string类型转换成int类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static String IntToString(Object s, String defaultValue) {
        try {

            if (s != null)
                return String.valueOf(s.toString());

            else
                return defaultValue;

        } catch (Exception e) {
            Log.e("ERROR", e.toString());
            return defaultValue;
        }
    }


    /// <summary>
    /// 将int类型转换成string类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static String LongToString(long s) {
        return LongToString(s, "0");
    }

    /// <summary>
    /// 将string类型转换成int类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static String LongToString(Object s, String defaultValue) {
        try {

            if (s != null)
                return String.valueOf(s.toString());

            else
                return defaultValue;

        } catch (Exception e) {
            Log.e("ERROR", e.toString());
            return defaultValue;
        }
    }

    /// <summary>
    /// 将string类型转换成double类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static double StringToDouble(String s) {
        return StringToDouble(s, 0);
    }

    /// <summary>
    /// 将string类型转换成double类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static double StringToDouble(Object s, int defaultValue) {
        try {

            if (s != null)
                return Double.parseDouble(s.toString());
            else
                return defaultValue;

        } catch (Exception e) {
            Log.e("ERROR", e.toString());
            return defaultValue;
        }
    }


    /// <summary>
    /// 将string类型转换成double类型
    /// </summary>
    /// <param name="s">目标字符串</param>
    /// <returns></returns>
    public static String DoubleToString(double s) {
        return DoubleToString(s, "");
    }

    public static String DoubleToString(Object s, String defaultValue) {

        try {

            if (s != null)
                return String.valueOf(s.toString());

            else
                return defaultValue;

        } catch (Exception e) {
            Log.e("ERROR", e.toString());
            return defaultValue;
        }

    }


    public static int LongToInt(Long value) {
        return LongToInt(value, 0);
    }

    public static int LongToInt(Long value, int defaultValue) {
        try {
            return new Long(value).intValue();
        } catch (Exception e) {

            return defaultValue;
        }
    }



}