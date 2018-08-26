package com.lc.designpattern.builderpattern;

/**
 * @author lc
 * @desc 抽象建造者
 * @date 2018-08-26 22:24:00
 **/
public interface Builder {
    void buildHead();

    void buildBody();

    void buildFace();

    Person getInstance();
}
