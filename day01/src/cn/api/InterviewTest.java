package cn.api;

public class InterviewTest {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder builder = new StringBuilder("abc");
        System.out.println(s1.equals(builder));
        System.out.println(builder.equals(s1));
    }
}
