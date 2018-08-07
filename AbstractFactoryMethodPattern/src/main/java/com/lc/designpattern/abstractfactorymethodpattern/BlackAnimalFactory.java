package com.lc.designpattern.abstractfactorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-07 21:47:32
 **/
public class BlackAnimalFactory implements IAnimalFactory {
    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }
}
