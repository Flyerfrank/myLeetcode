package com.frank.leetcode.basicArithmetic.array;

/**
 * Created  zyf in 2019/9/27 15:53
 * 从排序数组中删除重复项
 */
public class Array {

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = removeDuplicates(nums);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    private static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
           if (nums[i] != nums[j]){
               j++;
               nums[j] = nums[i];
           }
        }
        return j+1;
    }
}
