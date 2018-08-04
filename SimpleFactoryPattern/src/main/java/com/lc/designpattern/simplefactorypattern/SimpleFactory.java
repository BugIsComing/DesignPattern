package com.lc.designpattern.simplefactorypattern;

/**
 * @author lc
 * @desc 简单工厂
 */
public class SimpleFactory {
    private static final String CONCRETE_PRODUCT_A = "ConcreteProductA";
    private static final String CONCRETE_PRODUCT_B = "ConcreteProductB";

    /**
     * 根据参数生产不同的产品
     * @param productName 产品名
     * @return 返回具体的产品对象
     */
    public static Product getConcreteProduct(String productName) {
        if (productName == null || productName.isEmpty() || productName.trim().isEmpty())
            return null;
        if (CONCRETE_PRODUCT_A.equals(productName)) {
            return new ConcreteProductA();
        } else if(CONCRETE_PRODUCT_B.equals(productName)) {
            return new ConcreteProductB();
        }
        return null;
    }
}
