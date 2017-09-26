package com.cqwo.web.mall.controller;

import com.cqwo.web.framework.controller.BaseAdminController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cqnews on 2017/3/29.
 */
@Controller
@Component("AdminHomeController")
public class HomeController  extends BaseAdminController {

    @RequestMapping(value = "index")
    public ModelAndView Index(){
        return View();
    }
}
