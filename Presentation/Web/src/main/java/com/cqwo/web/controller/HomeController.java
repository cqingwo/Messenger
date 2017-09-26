package com.cqwo.web.controller;

import com.cqwo.core.config.CWMConfig;
import com.cqwo.core.domain.UserInfo;
import com.cqwo.core.session.CWMSession;
import com.cqwo.services.FilterWords;
import com.cqwo.services.Users;
import com.cqwo.web.framework.controller.BaseWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by cqnews on 2017/3/29.
 */

@Controller
public class HomeController extends BaseWebController {

    /**
     * 首页
     *
     * @return
     */

    @Resource
    CWMConfig config;


    @Resource
    CWMSession cwmSession;


    @Resource
    FilterWords filterWords;

    @Resource
    Users users;

    @RequestMapping("index")
    public ModelAndView Index() throws Exception {
        System.out.println("Index");
        // HomeModel model = new HomeModel();

        //model.UserList = null ;

        //model.SMSInfo = new SMSInfo();

        //CWMSMS.getInstance().Send("18983071151","1222");

        /** BeanFactory factory = new ClassPathXmlApplicationContext("StrategyConfig.xml");//new XmlBeanFactory(new ClassPathResource("StrategyConfig.xml"));

         RDBSStrategy rdbsStrategy = (RDBSStrategy) factory.getBean("RDBSStrategy");

         rdbsStrategy.getiUserStrategy().DeleteOnlineUserBySid("1111");

         **/

        //UserInfo userInfo = new UserInfo("14444444444","e10adc3949ba59abbe56e057f20f883e");

        //Log.i("TAG",userService.GetUserInfoByMobileAndPwd(userInfo).toString());

        //userInfo = users.GetUserInfoByMobileAndPwd(userInfo);

        // UserInfo userInfo = new UserInfo("14444444444","e10adc3949ba59abbe56e057f20f883e");

        //UserInfo userInfo1 =  users.GetUserInfoByMobileAndPwd(userInfo);

        //UserInfo userInfo = users.GetUserByUid(1);
        //System.out.println("输出userinfo:"+userInfo);

        /** RDBSConfigInfo configInfo = new RDBSConfigInfo();




         private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
         private String url = "jdbc:sqlserver://127.0.0.1:1433;database=cqingwo";
         private String username = "sa";
         private String password = "123456";


         configInfo.setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         configInfo.setUrl("jdbc:sqlserver://127.0.0.1:1433;database=cqingwo");
         configInfo.setUsername("sa");
         configInfo.setPassword("123456");**/


        // cwmConfig.getIconfigstrategy().SaveRDBSConfig(configInfo);

        // System.out.println(cwmConfig.getIconfigstrategy().GetRDBSConfig());


        //cwmSession.getiSessionStrategy().SetItem("64CF25FD56C616D1BAF53A3DBA4AE98B","username","liu");
        //System.out.println(cwmSession.getiSessionStrategy().GetSessionId());

        //cwmSession.getiSessionStrategy().GetSession("");
        //log.getiLogStrategy().Write("1");



        /*
        config.getIconfigstrategy().SaveBaseConfig(new BaseConfigInfo());
        config.getIconfigstrategy().SaveEmailConfig(new EmailConfigInfo());
        config.getIconfigstrategy().SaveRDBSConfig(new RDBSConfigInfo());
        config.getIconfigstrategy().SaveSMSConfig(new SMSConfigInfo());

        */

        //System.out.println(config.getIconfigstrategy().GetBaseConfig());
        //smSes.SendBaseSMS("18983071151", "您好");

        //CWMSMS cwmsms = (CWMSMS) SpringHelper.getBean("CWMSMS");

        //cwmsms.getIsmsStrategy().Send("18983071151", "您好");

        //cwmSession.getiSessionStrategy().SetItem("64CF25FD56C616D1BAF53A3DBA4AE98B","username","liu");
        //System.out.println(cwmSession.getiSessionStrategy().GetSessionId());

        //System.out.println(cwmSession.getiSessionStrategy().GetValue("","username"));

        //RDBSConfigInfo configInfo = new RDBSConfigInfo();

        //config.getIconfigstrategy().SaveRDBSConfig(configInfo);

        //System.out.println(users.GetUserByUid(1));

        //System.out.println(users.GetUserList(2,1,""));

        //config.getIconfigstrategy().SaveRDBSConfig(new RDBSConfigInfo());

        System.out.println(filterWords.GetFilterWordCount(""));

        System.out.println(filterWords.GetFilterWordById(1));

        //FilterWordInfo info = new FilterWordInfo(0,"刘从汉","刘崇科");


        //filterWords.CreateFilterWord(info);

        System.out.println(filterWords.GetFilterWordList("", ""));

        UserInfo userInfo = users.GetUserByUid(1);

        //System.out.println(WebHelper.IsAjax(request));

        System.out.println("Protocol: " + request.getProtocol());
        System.out.println("Scheme: " + request.getScheme());
        System.out.println("Server Name: " + request.getServerName());
        System.out.println("Server Port: " + request.getServerPort());
        System.out.println("Protocol: " + request.getProtocol());
        System.out.println("Remote Addr: " + request.getRemoteAddr());
        System.out.println("Remote Host: " + request.getRemoteHost());
        System.out.println("Character Encoding: " + request.getCharacterEncoding());
        System.out.println("Content Length: " + request.getContentLength());
        System.out.println("Content Type: " + request.getContentType());
        System.out.println("Auth Type: " + request.getAuthType());
        System.out.println("HTTP Method: " + request.getMethod());
        System.out.println("Path Info: " + request.getPathInfo());
        System.out.println("Path Trans: " + request.getPathTranslated());
        System.out.println("Query String: " + request.getQueryString());
        System.out.println("Remote User: " + request.getRemoteUser());
        System.out.println("Session Id: " + request.getRequestedSessionId());
        System.out.println("Request URL: " + request.getRequestURL());
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Servlet Path: " + request.getServletPath());
        System.out.println("Created : " + session.getCreationTime());
        System.out.println("LastAccessed : " + session.getLastAccessedTime());

        System.out.println("Accept: " + request.getHeader("Accept"));
        System.out.println("Host: " + request.getHeader("Host"));
        System.out.println("Referer : " + request.getHeader("Referer"));
        System.out.println("Accept-Language : " + request.getHeader("Accept-Language"));
        System.out.println("Accept-Encoding : " + request.getHeader("Accept-Encoding"));
        System.out.println("User-Agent : " + request.getHeader("User-Agent"));
        System.out.println("Connection : " + request.getHeader("Connection"));
        System.out.println("Cookie : " + request.getHeader("Cookie"));

        return View("index2", userInfo);


        //return PromptView("/","您好",false);
        // User model = new User();
        //model.setId(5);
        // return View("index2",model);
        // return View("index2",model);
    }


}
