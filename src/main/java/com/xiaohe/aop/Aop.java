package com.xiaohe.aop;

public class Aop {

    public void add(){
        System.out.println("add");
    }

    public void  add2(){
        System.out.println("阿达的2");
    }

    public void add3(){
        System.out.println("add3");
    }
    public void afterThrowing(Throwable throwable){
        System.out.println("异常");
    }
}
