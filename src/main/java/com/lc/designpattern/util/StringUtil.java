package com.lc.designpattern.util;

/**
 * @author lc
 * @desc
 * @date 2018-08-04 11:23:52
 **/
public class StringUtil {
    public static boolean isEmpty(String str){
        if(str ==null || str.isEmpty()||str.trim().isEmpty())
            return true;
       return false;
    }
}
