package cn.api;

import java.util.Arrays;

public class MyArraysDemo {
    public static void main(String[] args) {
        int[] arr = {7, 6, 1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 2);
        System.out.println(index);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //1,数组必须有序
        //2.如果要查找的元素存在,那么返回的是这个元素实际的索引
        //3.如果要查找的元素不存在,那么返回的是 (-插入点-1)
        //插入点:如果这个元素在数组中,他应该在哪个索引上.
    }
}
