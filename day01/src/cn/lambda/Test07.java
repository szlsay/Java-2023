package cn.lambda;

public class Test07 {
    public static void main(String[] args) {
        useInter(() -> {
            System.out.println("show inter");
        });
    }
    public static void useInter(InterNum inter) {
        inter.show();
    }
}
interface InterNum{
    void show();
}
