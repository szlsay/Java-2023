package cn.map;

import java.util.HashMap;
import java.util.Map;

public class MyMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "n1");
        map.put("002", "n2");
        map.put("003", "n3");
        System.out.println(map);
    }
}
