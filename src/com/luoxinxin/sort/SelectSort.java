package com.luoxinxin.sort;

import java.util.Arrays;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-09-28
 * Modified By： luoxinxin
 */
public class SelectSort {

    public static void selectSort(int[] arr){

        for(int i=0; i<arr.length-1;i++){//和冒泡排序思想一样，从第二个数开始比较，所以n-1次
            int minIndex = i;
            int min = arr[i];
            for(int j=i+1;j<arr.length;j++){//n-i
                if(min<arr[j]) {
                    minIndex = j;
                }

            }

            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
