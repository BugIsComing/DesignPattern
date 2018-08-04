package com.lc.designpattern.simplefactorypattern;

public abstract class Product {
    public void printName(){
        System.out.println(getClass().getName());
    }
}
