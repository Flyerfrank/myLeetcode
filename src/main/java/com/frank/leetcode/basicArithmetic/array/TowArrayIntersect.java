package com.frank.leetcode.basicArithmetic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：zyf
 * @date ：2019/11/13 18:59
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 *
 *
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class TowArrayIntersect {
    public static void main(String[] args) {

//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
//        int[] nums1 = {3,1,2};
//        int[] nums2 = {1,1};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
