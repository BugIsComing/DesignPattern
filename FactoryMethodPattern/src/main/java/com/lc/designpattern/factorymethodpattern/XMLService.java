package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc 相当于模式中的Factory
 * @date 2018-08-05 10:29:47
 **/
public abstract class XMLService {
    public void display(){
        XMLParser parser = getParser();
        String msg = parser.parser();
        System.out.println(msg);
    }
    protected abstract XMLParser getParser();
}
