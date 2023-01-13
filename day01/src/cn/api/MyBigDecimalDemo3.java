package cn.api;

import java.math.BigDecimal;

public class MyBigDecimalDemo3 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.3");
        BigDecimal add = bd1.add(bd2);
        System.out.println(add);
    }
}
