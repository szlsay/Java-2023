package cn.api;

public class MyIntegerDemo2 {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
