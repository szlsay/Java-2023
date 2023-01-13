package cn.lambda;

public class Test05CalculatorDemo {
    public static void main(String[] args) {
        useCalculator((a, b) -> a + b);
        useCalculator((a,b) -> a-b);
    }
    public static void useCalculator(Calculator calculator) {
        int num = calculator.calc(1, 2);
        System.out.println(num);
    }
}

interface Calculator{
    int calc(int a, int b);
}
