package com.frank.leetcode.basicArithmetic.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ：frank
 * @date ：2019/11/5 11:14
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1,1,3,4,4};

        int i = singleNumber(nums);
        System.out.println("i = " + i);
    }

    /**
     * 执行用时 :4 ms, 在所有 java 提交中击败了38.53%的用户
     * 内存消耗 : 38.2 MB , 在所有 java 提交中击败了 96.58%的用户
     */
    private static int singleNumber(int[] nums) {

        if (nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        if (nums[0] != nums [1]){
            return nums[0];
        }
        if (nums[nums.length -1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        for (int i = 1; i < nums.length -1; i++) {
            if (nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return 0;

        //异或  1ms
//        int ans = nums[0];
//        if (nums.length > 1) {
//            for (int i = 1; i < nums.length; i++) {
//                ans = ans ^ nums[i];
//            }
//        }
//        return ans;

    }
}
