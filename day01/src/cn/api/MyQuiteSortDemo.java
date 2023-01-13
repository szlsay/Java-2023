package cn.api;

public class MyQuiteSortDemo {
    public static void main(String[] args) {
//        1，从右开始找比基准数小的
//        2，从左开始找比基准数大的
//        3，交换两个值的位置
//        4，红色继续往左找，蓝色继续往右找，直到两个箭头指向同一个索引为止
//        5，基准数归位
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quiteSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {

        int left0 = left;

        //计算出基准数
        int baseNumber = arr[left0];

        while(left != right){
//        1，从右开始找比基准数小的
            while(arr[right] >= baseNumber && right > left){
                right--;
            }
//        2，从左开始找比基准数大的
            while(arr[left] <= baseNumber && right > left){
                left++;
            }
//        3，交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
    }
}
