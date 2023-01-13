package cn.lambda;

public class Test01Swimming {
    public static void main(String[] args) {
        goSwimming(() -> System.out.println("123"));
    }

    public static void goSwimming(Swimming swimming) { swimming.swim();}
}

interface Swimming{
    void swim();
}

