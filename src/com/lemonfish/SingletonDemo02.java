package com.lemonfish;

import org.junit.Test;

/**
 * @author Chao Zhang
 * @version V1.0
 * @Package com.lemonfish
 * @date 2020/3/23 9:22
 */
// 懒汉式
public class SingletonDemo02 {
    // 1. 私有化构造器
    private SingletonDemo02() {
    }

    // 2.类初始化的时候，不立即加载对象
    private static SingletonDemo02 instance;

    // 3.提供获取该对象的方法，有synchronized，效率较低
    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo02();
        }

        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo02 instance1 = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();
        System.out.println(instance1==instance2);
    }

}
