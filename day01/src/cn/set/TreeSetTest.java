package cn.set;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Person>  ts = new TreeSet<>();

        Person s1 = new Person("dahei",80,80,80);
        Person s2 = new Person("erhei",90,90,90);
        Person s3 = new Person("xiaohei",100,100,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);


        for (Person p : ts) {
            System.out.println(p);
        }
    }
}
