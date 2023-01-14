package cn.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        Map<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result== 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        Student s1 = new Student("xiaohei",23);
        Student s2 = new Student("dapang",22);
        Student s3 = new Student("xiaomei",22);

        tm.put(s1,"江苏");
        tm.put(s2,"北京");
        tm.put(s3,"天津");

        tm.forEach(
                (Student key, String value)->{
                    System.out.println(key + "---" + value);
                }
        );
    }
}
