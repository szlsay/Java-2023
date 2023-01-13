package cn.lambda;

import java.util.Random;

public class Test04RandomNumHandlerDemo {
    public static void main(String[] args) {
        useRandomNumHandler(() -> {
            Random random = new Random();
            int num = random.nextInt(10) + 1;
            return num;
        });
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int number = randomNumHandler.getNumber();
        System.out.println(number);
    }
}

interface RandomNumHandler{
    int getNumber();
}
