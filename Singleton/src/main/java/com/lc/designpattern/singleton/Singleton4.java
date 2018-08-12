package com.lc.designpattern.singleton;

/**
 * @author lc
 * @desc 懒汉模式，双重保险
 * @date 2018-08-12 10:05:20
 **/
public class Singleton4 {
    private static volatile Singleton4 instance;
    private Singleton4(){

    }
    public Singleton4 getInstance(){
        if (instance == null){
            synchronized(Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
