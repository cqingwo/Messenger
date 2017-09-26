package com.cqwo.core.data;


import com.cqwo.core.data.rdbs.RDBSStrategy;

/**
 * Created by cqnews on 2017/4/10.
 */
public class CWMData {

    private RDBSStrategy irdbsStrategy;//数据管理策略

    public RDBSStrategy getIrdbsStrategy() {
        return irdbsStrategy;
    }

    public void setIrdbsStrategy(RDBSStrategy irdbsStrategy) {
        this.irdbsStrategy = irdbsStrategy;
    }



    /// <summary>
    /// 短信策略实例
    /// </summary>
    //private ISMSStrategy instance;

   /** // 定义一个静态的方法（调用时再初始化SingletonTest，使用synchronized 避免多线程访问时，可能造成重的复初始化问题）
    public static RDBSStrategy getInstance() throws Exception {
        try {

            BeanFactory factory = new ClassPathXmlApplicationContext("StrategyConfig.xml");//new XmlBeanFactory(new ClassPathResource("StrategyConfig.xml"));

            RDBSStrategy instance = (RDBSStrategy) factory.getBean("RDBSStrategy");
            return instance;
        } catch (Exception e) {

            throw new Exception("创建'短信策略对象'失败,可能存在的原因:未将'短信策略程序集'WEB-INF中;'短信策略程序集'文件名不符合'StrategyConfig'格式");

        }
    }
    **/
}
