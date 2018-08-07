package com.lc.designpattern.abstractfactorymethodpattern;

/**
 * @author lc
 * @desc 抽象工厂
 * @date 2018-08-07 07:34:25
 **/
public interface IAnimalFactory {
    ICat createCat();
    IDog createDog();
}
