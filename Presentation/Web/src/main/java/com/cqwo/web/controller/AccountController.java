/*
 * Copyright (C) 2017.
 * 用于JAVA项目开发
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.web.controller;

import com.cqwo.web.framework.controller.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cqnews on 2017/4/28.
 */
@Controller
@RequestMapping(value = "account")
public class AccountController extends BaseWebController {

    @RequestMapping("index")
    public ModelAndView Index() throws Exception {
        System.out.println("ok");
        return View();
    }


}
