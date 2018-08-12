package com.lc.designpattern.singleton;

/**
 * @author lc
 * @desc 懒汉模式，线程不安全
 * @date 2018-08-12 09:52:47
 **/
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){

    }

    /**
     * 第一次调用时初始化
     * @return
     */
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
