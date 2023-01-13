package cn.genericity;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericitySummarize {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(123);

        Iterator it = list.iterator();
        while(it.hasNext()){
            String next = (String) it.next();
            int len = next.length();
            System.out.println(len);

        }
    }
}
