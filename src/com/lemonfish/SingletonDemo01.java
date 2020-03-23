package com.lemonfish;

/**
 * @author Chao Zhang
 * @version V1.0
 * @Package leetcode.editor.lemonfish
 * @date 2020/3/23 8:44
 */
// 饿汉式
public class SingletonDemo01 {
    // 1. 私有化构造器
    private SingletonDemo01() {
    }

    // 2.类初始化的时候，立即加载对象
    private static SingletonDemo01 instance = new SingletonDemo01();

    // 3.提供获取该对象的方法，没有synchronized，效率高
    public static SingletonDemo01 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo01 instance1 = SingletonDemo01.getInstance();
        SingletonDemo01 instance2 = SingletonDemo01.getInstance();
        System.out.println(instance1==instance2);
    }
}
