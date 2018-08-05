package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:33:02
 **/
public class OrderXMLService extends XMLService{
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
