package com.frank.leetcode.basicArithmetic.array;

import java.util.Arrays;

/**
 * @author ：zyf
 * @date ：2021/9/29 19:47
 * @Description
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *
 * 示例1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 *
 * 示例2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 *
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class AddOne {

    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
//        int[] arr = {9};
        int[] arr = {9,9};
//        int[] arr = {4,3,2,1};
        int[] ints = addOne(arr);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] addOne(int[] digits) {
       int m = digits.length - 1;
       while (m >= 0 && digits[m] == 9){
               digits[m] = 0;
               m--;
       }
       if (m < 0){
           digits = new int[digits.length + 1];
           digits[0] = 1;
       }else {
            digits[m] = digits[m] + 1;
       }
        return digits;
    }

}
