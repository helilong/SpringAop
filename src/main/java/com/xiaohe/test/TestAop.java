package com.xiaohe.test;

import com.xiaohe.aop.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Aspect aspect = (Aspect) applicationContext.getBean("logAspect");
        aspect.add();
    }

}
