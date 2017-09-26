package com.cqwo.core.envent;

import org.springframework.stereotype.Component;

/**
 * Created by cqnews on 2017/4/14.
 */

@Component("AnotherBean")
public class AnotherBean {
    public void printAnotherMessage() {
        System.out.println("我是定时器，我来了");
    }
}
