package cn.api;

public class MyBinarySearchDemo {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int number = 3;

        int i = binarySearchForIndex(arr, number);
        System.out.println(i);
    }

    private static int binarySearchForIndex(int[] arr, int number) {
        //1,定义查找的范围
        int min = 0;
        int max = arr.length - 1;
        //2.循环查找 min <= max
        while(min <= max){
            //3.计算出中间位置 mid
            int mid = (min + max) >> 1;
            //mid指向的元素 > number
            if(arr[mid] > number){
                //表示要查找的元素在左边.
                max = mid -1;
            }else if(arr[mid] < number){
                //mid指向的元素 < number
                //表示要查找的元素在右边.
                min = mid + 1;
            }else{
                //mid指向的元素 == number
                return mid;
            }
        }
        //如果min大于了max就表示元素不存在,返回-1.
        return -1;
    }
}
