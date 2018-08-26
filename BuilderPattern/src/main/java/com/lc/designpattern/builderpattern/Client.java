package com.lc.designpattern.builderpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-26 22:33:56
 **/
public class Client {
    public static void main(String[] arg) {
        Director director = new Director();
        Builder commonBuilder = new CommonPersonBuilder();

        director.construct(commonBuilder);

        Person commonPerson = ((CommonPersonBuilder) commonBuilder).getInstance();
        System.out.println(commonPerson);
    }
}
