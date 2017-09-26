package com.cqwo.strategy.rdbs.typehandler;

import com.cqwo.core.domain.UserInfo;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 青沃科技 on 2017/4/7.
 */
//配置
public class UserTypeHandler implements TypeHandler<UserInfo> {
    public void setParameter(PreparedStatement var1, int var2, UserInfo var3, JdbcType var4) throws SQLException {
        var1.setString(var2,var3.toString());
    }

    public  UserInfo getResult(ResultSet var1, String var2) throws SQLException{
        return null;
    }

    public UserInfo getResult(ResultSet var1, int var2) throws SQLException{
        return null;
    }

    public UserInfo getResult(CallableStatement var1, int var2) throws SQLException{
        return null;
    }
}
