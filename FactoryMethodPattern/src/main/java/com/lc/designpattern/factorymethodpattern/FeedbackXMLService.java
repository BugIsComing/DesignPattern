package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:33:56
 **/
public class FeedbackXMLService extends XMLService {
    @Override
    protected XMLParser getParser() {
        return new FeedbackXML();
    }
}
