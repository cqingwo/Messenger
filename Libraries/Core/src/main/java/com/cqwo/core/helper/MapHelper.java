package com.cqwo.core.helper;

import org.apache.commons.beanutils.PropertyUtilsBean;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cqnews on 2017/4/13.
 */
public class MapHelper {

    //将javabean实体类转为map类型，然后返回一个map类型的值
    public static Map<String, String> ObjectToMap(Object obj) {
        Map<String, String> params = new HashMap<String, String>(0);
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name)) {
                    params.put(name, propertyUtilsBean.getNestedProperty(obj, name).toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }


}
