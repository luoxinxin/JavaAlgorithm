package com.luoxinxin.sort;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-09-28
 * Modified By： luoxinxin
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){//

        int temp = 0;
        boolean flag = false;

        for(int i=1; i<arr.length;i++){//用第二个数据与第一个比较，所以比较次数为n-1次
            for(int j=0; j<arr.length-i;j++){//每次比较最大的数据会落到后面，所以为n-i
                if(arr[j]>arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(!flag){
                break;
            }
            flag = false;
        }
    }
}
