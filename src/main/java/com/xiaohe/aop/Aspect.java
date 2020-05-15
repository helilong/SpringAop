package com.xiaohe.aop;

public class Aspect {

    public void add(){
        System.out.println("提娜佳");
    }
    public void addUser()throws Throwable{
        System.out.println("addUser");
        throw new Exception("异常了");


    }
}
