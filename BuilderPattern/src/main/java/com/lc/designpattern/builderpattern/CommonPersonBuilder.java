package com.lc.designpattern.builderpattern;

/**
 * @author lc
 * @desc CommonPerson的建造者，每一个具体类都对应一个建造者
 * @date 2018-08-26 22:25:16
 **/
public class CommonPersonBuilder implements Builder {
    private Person instance = new Person();

    public void buildHead() {
        instance.setHead("Common Person Head");
    }

    public void buildBody() {
        instance.setBody("Common Person Body");
    }

    public void buildFace() {
        instance.setFace("Common Person Face");
    }

    public Person getInstance() {
        return instance;
    }
}
