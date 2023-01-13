package cn.lambda;

public class Test6 {
    public static void main(String[] args) {
        useInter(((a, b) -> a+b));
    }
    public static void useInter(Inter i) {
        double v = i.method(12.3, 22.3);
        System.out.println(v);
    }
}

interface Inter{
    double method(double a, double b);
}
