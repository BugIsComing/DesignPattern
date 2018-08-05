package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc 实现XMLParser接口，相当于模式中的ConcreteProduct
 * @date 2018-08-05 10:17:02
 **/
public class ErrorXMLParserImpl implements XMLParser {
    @Override
    public String parser() {
        System.out.println("Parse XML Error");
        return "Error XML Message";
    }
}
