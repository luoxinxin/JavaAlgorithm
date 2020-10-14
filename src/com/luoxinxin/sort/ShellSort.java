package com.luoxinxin.sort;

import java.util.Arrays;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-09-29
 * Modified By： luoxinxin
 */
public class ShellSort {

    public static void shellSort(int[] arr) { //希尔排序交换法
        int temp = 0;
        int count = 0;

        for(int gap = arr.length/2;gap>0;gap /=2){ //gap为步长
            for(int i = gap;i<arr.length;++i){
                for(int j=i-gap;j>=0;j-=gap){//内部使用交换法
                    if(arr[j]>=arr[j+gap]){//存在重复的比较
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }

            }
        }
    }

    public static void shellSort2(int[] arr){//希尔排序插入法
        for(int gap = arr.length/2;gap>0;gap /=2){
            for(int i=gap;i<arr.length;++i){
                int j=i;
                int temp = arr[i];
                while(j-gap>0 &&temp<arr[j-gap]){
                    arr[j] = arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
        }
    }

        public int[] sort(int[] sourceArray) throws Exception {
            // 对 arr 进行拷贝，不改变参数内容
            int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

            int gap = 1;
            while (gap < arr.length) {
                gap = gap * 3 + 1;
            }

            while (gap > 0) {
                for (int i = gap; i < arr.length; i++) {
                    int tmp = arr[i];
                    int j = i - gap;
                    while (j >= 0 && arr[j] > tmp) {
                        arr[j + gap] = arr[j];
                        j -= gap;
                    }
                    arr[j + gap] = tmp;
                }
                gap = (int) Math.floor(gap / 3);
            }

            return arr;
        }

}
