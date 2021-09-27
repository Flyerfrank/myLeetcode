package com.frank.leetcode.basicArithmetic.array;

import java.util.Arrays;

/**
 * @author ：zyf
 * @date ：2021/9/27 19:38
 * @Description 奇偶排序
 * 一个数组排序，奇数排在偶数前面
 * [1,5,6,9,7,22]
 */
public class OddEvenSort {

    static int[] arr = {5,6,9,7,22,3,1,55,50,65,34,57,56};

    public static void main(String[] args) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] % 2 == 1 && arr[j] % 2 == 1 && arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }else if(arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }else if(arr[i] % 2 == 0 && arr[j] % 2 == 1){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
