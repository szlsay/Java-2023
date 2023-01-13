package cn.set;

import java.util.HashSet;

public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("hh", 10);
        Student s2 = new Student("hh", 11);
        Student s3 = new Student("hh", 12);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student s: hs) {
            System.out.println(s);
        }
    }
}
