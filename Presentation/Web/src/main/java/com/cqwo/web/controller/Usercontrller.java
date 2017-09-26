package com.cqwo.web.controller;

import com.cqwo.core.domain.UserInfo;
import com.cqwo.services.Users;
import com.cqwo.web.framework.controller.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by cqnews on 2017/4/11.
 */
@Controller
@RequestMapping(value = "/User")
public class Usercontrller extends BaseWebController{

    @Resource
    Users users;

    @RequestMapping("login")
    public ModelAndView Login()throws IOException{

        UserInfo userInfo = new UserInfo("14444444444","e10adc3949ba59abbe56e057f20f883e");

        //UserInfo userInfo1 =  users.GetUserInfoByMobileAndPwd(userInfo);

        //System.out.println("输出userinfo:"+userInfo1);

        return View();
    }


}
