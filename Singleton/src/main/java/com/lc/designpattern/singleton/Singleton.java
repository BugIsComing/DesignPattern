package com.lc.designpattern.singleton;

/**
 * @author lc
 * @desc 恶汉模式，线程不安全
 * @date 2018-08-12 09:23:16
 **/
public class Singleton {
    /**
     * 类加载时就完成了初始化
     */
    private static Singleton instance = new Singleton();

    /**
     * 设置为private避免其他使用者new对象
     */
    private  Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
