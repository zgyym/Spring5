package com.bean;

public class Order {
    private String name;

    public Order() {
        System.out.println("第一步：通过构造器船舰bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：属性注入");
    }


    //创建执行的初始化的方法
    public void init(){
        System.out.println("第三步：执行初始化方法");
    }

    //创建执行的销毁的方法
    public void destory(){
        System.out.println("第五步：执行销毁的方法");
    }
}
