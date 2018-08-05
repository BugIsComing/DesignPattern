package com.lc.designpattern.factorymethodpattern;

/**
 * @author lc
 * @desc
 * @date 2018-08-05 10:28:02
 **/
public class Client {
    public static void main(String[]args){
        XMLService service = new ErrorXMLService();
        service.display();
        service = new FeedbackXMLService();
        service.display();
    }
}
