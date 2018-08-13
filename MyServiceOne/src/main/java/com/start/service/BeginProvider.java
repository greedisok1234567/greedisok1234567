package com.start.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeginProvider {

    public static void main(String args[])throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext((new String[]{"provider.xml"}));
        context.start();
        System.out.print("服务提供方开始服务");
        System.in.read();
    }
}
