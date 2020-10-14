package com.luoxinxin.sort;

import java.util.Arrays;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-09-28
 * Modified By： luoxinxin
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;

        for(int i = 1; i<arr.length;i++){//插入排序的次数为n-1次，初始状态一个数，从第二个数开始
            insertVal = arr[i];//待插入的数据
            for(insertIndex = i-1;insertIndex>=0&&insertVal<arr[insertIndex];--insertIndex){//insertIndex是查找插入数据的位置
                arr[insertIndex+1] = arr[insertIndex];//将大于待插入的数据往后挪一个位置
            }

            if(insertIndex!=i){//找到插入数据的位置，将数据插入到insertIndex，
                arr[insertIndex]=insertVal;
            }
        }
    }

    public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
        return arr;
    }
}
