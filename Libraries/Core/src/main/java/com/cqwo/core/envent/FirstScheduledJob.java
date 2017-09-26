package com.cqwo.core.envent;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by cqnews on 2017/4/13.
 */
public class FirstScheduledJob extends QuartzJobBean {

    private AnotherBean anotherBean;
    @Override
    protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("I am FirstScheduledJob");
        this.anotherBean.printAnotherMessage();
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public void printMessage() {
        System.out.println("ok");
    }
}
