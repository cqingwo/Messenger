package com.cqwo.web.framework.controller;

import com.cqwo.web.framework.workcontext.WebWorkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class BaseWebController extends BaseController {

    @Autowired
    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected HttpSession session;

    @ModelAttribute
    public void setInitialize(HttpServletResponse response) {

        this.workContext = new WebWorkContext();
        this.response = response;
        this.session = request.getSession();
        System.out.println("URL:" + request.getRequestURI());

        this.workContext.setUrl("http://www.baidu.com/");

        System.out.println("setInitialize被执行了");
        //Log.e("URL",request.getRequestURI());
    }

    @ModelAttribute
    public void inspectInitialize(){

        System.out.println("inspectInitialize被执行了");
    }

    public BaseWebController() {
        super();
    }
}
