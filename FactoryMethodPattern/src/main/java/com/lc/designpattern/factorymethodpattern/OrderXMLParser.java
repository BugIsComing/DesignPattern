package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:26:10
 **/
public class OrderXMLParser implements XMLParser {
    @Override
    public String parser() {
        System.out.println("Parsing order XML...");
        return "Order XML Message";
    }
}
