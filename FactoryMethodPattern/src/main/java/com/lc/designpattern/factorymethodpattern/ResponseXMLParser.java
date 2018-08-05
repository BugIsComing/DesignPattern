package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:27:18
 **/
public class ResponseXMLParser implements XMLParser{
    @Override
    public String parser() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }
}
