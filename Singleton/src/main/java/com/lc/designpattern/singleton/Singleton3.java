package com.lc.designpattern.singleton;

/**
 * @author lc
 * @desc 懒汉模式，线程安全
 * @date 2018-08-12 09:54:57
 **/
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){

    }
    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
