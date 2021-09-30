package com.frank.leetcode.basicArithmetic.array;

import java.util.Arrays;

/**
 * @auther: zyf
 * @Date: 2021/09/30 10:52
 * @Description 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 *
 * 输入: [2,1]
 * 输出: [2,1]
 *
 *
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数
 *
 */
public class MoveZero {

    public static void main(String[] args) {
        int[] nums = {0,26,6,0,5,9,0};
//        int[] nums = {6,2,3,9};
//        int[] nums = {2,1};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    private static int[] moveZeroes(int[] nums) {

        int index = 0;
        //一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }
        //后面的都是0,
        while (index < nums.length) {
            nums[index++] = 0;
        }
//        int temp;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == 0){
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                nums[i] =  nums[nums.length - 1 - m];
//                nums[nums.length - 1 - m] = 0;
//                m++;
//            }
//        }
//        排序并且0放到最后
//        int temp;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == 0){
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                } if (nums[j] != 0 && nums[i] > nums[j]) {
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
        return nums;
    }
}
