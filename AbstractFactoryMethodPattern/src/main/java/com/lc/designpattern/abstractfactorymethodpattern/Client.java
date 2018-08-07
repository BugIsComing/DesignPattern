package com.lc.designpattern.abstractfactorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-07 21:48:15
 **/
public class Client {
    public static void main(String[]args){
        IAnimalFactory factory = new WhiteAnimalFactory();
        ICat whiteCat = factory.createCat();
        whiteCat.eat();
    }
}
