package cn.lambda;

public class Test03StringHandlerDemo {
    public static void main(String[] args) {
        useStringHandler((msg)->{
            System.out.println(msg + "123");
        });
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMsg("abc");
    }
}

interface StringHandler{
    void printMsg(String msg);
}
