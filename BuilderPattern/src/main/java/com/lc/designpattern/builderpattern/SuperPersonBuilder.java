package com.lc.designpattern.builderpattern;

/**
 * @author lc
 * @desc SuperPerson的建造者
 * @date 2018-08-26 22:27:13
 **/
public class SuperPersonBuilder implements Builder {
    private Person instance = new Person();

    public void buildHead() {
        instance.setHead("Super Person Head");
    }

    public void buildBody() {
        instance.setBody("Super Person Body");
    }

    public void buildFace() {
        instance.setFace("Super Person Face");
    }

    public Person getInstance() {
        return instance;
    }
}
