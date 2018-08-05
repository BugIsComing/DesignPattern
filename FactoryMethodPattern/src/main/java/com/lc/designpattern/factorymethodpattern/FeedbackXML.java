package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:21:37
 **/
public class FeedbackXML implements XMLParser{
    @Override
    public String parser() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }
}
