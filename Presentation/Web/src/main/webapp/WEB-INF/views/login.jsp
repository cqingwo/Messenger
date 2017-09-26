<%--
  ~ Copyright (C) 2017. 
  ~ 用于JAVA项目开发
  ~ 重庆青沃科技有限公司 版权所有
  ~ Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: cqnews
  Date: 2017/4/25
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("path",request.getContextPath());
%>
<html>
<head>
    <title>登录验证码</title>
</head>
<body>
    验证码：<img src="${path}/kaptcha.jpg"/>
</body>
</html>
