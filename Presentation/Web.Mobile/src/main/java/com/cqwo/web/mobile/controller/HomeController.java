package com.cqwo.web.mobile.controller;


import com.cqwo.web.framework.controller.BaseMobileController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by cqnews on 2017/3/29.
 */

@Controller
@Component(value = "MobileHomeController")
public class HomeController extends BaseMobileController {

    @RequestMapping("index")
    public ModelAndView Index(){
        //return PromptView("/","您好",false);
        //System.out.print("我又来了,刘杨");
        return View();

    }

}
