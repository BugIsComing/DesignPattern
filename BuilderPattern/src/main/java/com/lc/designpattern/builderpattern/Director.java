package com.lc.designpattern.builderpattern;

/**
 * @author lc
 * @desc 导演者，负责调用建造者的各个部位
 * @date 2018-08-26 22:32:08
 **/
public class Director {
    public void construct(Builder builder) {
        builder.buildHead();
        builder.buildFace();
        builder.buildBody();
    }
}
