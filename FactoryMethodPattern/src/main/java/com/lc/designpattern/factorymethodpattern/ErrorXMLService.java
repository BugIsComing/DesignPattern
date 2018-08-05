package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:31:22
 **/
public class ErrorXMLService extends XMLService {
    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParserImpl();
    }
}
