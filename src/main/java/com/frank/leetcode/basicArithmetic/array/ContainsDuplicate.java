package com.frank.leetcode.basicArithmetic.array;

import java.util.Arrays;

/**
 * @author ：frank
 * @date ：2019/11/5 8:56
 *
 * 存在重复
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        boolean b = containsDuplicate(nums);
        System.out.println("b = " + b);
    }
    private static boolean containsDuplicate(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j])
//                    return true;
//            }
//        }
//        232ms

//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i+1] == nums[i]){
//            return true;
//            }
//        }
// 4ms

        return false;
    }
}
