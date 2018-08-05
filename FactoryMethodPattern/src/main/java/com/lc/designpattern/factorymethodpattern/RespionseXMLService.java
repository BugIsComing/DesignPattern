package com.lc.designpattern.factorymethodpattern;

import java.beans.XMLEncoder;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:32:25
 **/
public class RespionseXMLService extends XMLService {
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
