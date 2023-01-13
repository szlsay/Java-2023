package cn.lambda;

public class Test02Lambda {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        });
        useShowHandler(() -> System.out.println("我是Lambda中的show方法"));
    }
    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }
}

interface ShowHandler{
    void show();
}
