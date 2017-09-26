package com.cqwo.strategy.rdbs.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by 青沃科技 on 2017/3/23.
 */

//这里创建SqlSessionFactory工厂如何处理高并发
public class BaseService {

    SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;

    public void connection() throws IOException{

        sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"),"mssqlDB2");
        //sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(IOHelper.GetMapPath("Config\\mybatis.xml")),"mssqlDB");
        sqlSession=sqlSessionFactory.openSession();
    }

    public void close(){
        sqlSession.close();
    }
}
