package com.lc.designpattern.abstractfactorymethodpattern;

/**
 * @author lc
 * @desc 具体工厂
 * @date 2018-08-07 21:45:45
 **/
public class WhiteAnimalFactory implements IAnimalFactory {
    public ICat createCat() {
        return new WhiteCat();
    }

    public IDog createDog() {
        return new WhiteDog();
    }
}
