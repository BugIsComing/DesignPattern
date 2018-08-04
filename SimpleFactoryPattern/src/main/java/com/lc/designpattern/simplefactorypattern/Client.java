package com.lc.designpattern.simplefactorypattern;

/**
 * 测试端
 */
public class Client {
    public static void main(String[]args){
        Product A = SimpleFactory.getConcreteProduct("ConcreteProductA");
        A.printName();
        Product B = SimpleFactory.getConcreteProduct("ConcreteProductB");
        B.printName();
    }
}
