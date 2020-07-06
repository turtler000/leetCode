package org.leetCode.questionfour;

import java.util.Arrays;

/**
 * 两个正序数组中位数
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * create by hanhuanyu ON 2020/7/4
 */
public class Questionfour {
    //初始化默认1长2短
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        if(nums1.length>=nums2.length){
            return findMedianSortedArrays_1(nums1,nums2);
        }else {
            return findMedianSortedArrays_1(nums2,nums1);
        }
    }
    /**
     *
     * 初步思路：
     * 每次去掉较短数组的一半，直到递归结束
     *
     * 有点难顶，再想想办法
     */
    public static double findMedianSortedArrays_1(int[] nums1, int[] nums2) {
        int a = nums1.length,b=nums2.length;
        //若有一方为空，直接返回另一数组中位数
        if (nums2 == null) {
            return (double)(nums1[(nums1.length - 1) / 2] + nums1[nums1.length / 2]) / 2;
        }
        //若1最小值大于2最大值或1最大值小于2最小值，则舍弃2取1的一部分
        if(nums1[0]>nums2[b-1]){
            return findMedianSortedArrays_1(Arrays.copyOfRange(nums1,0,a-b-1),null);
        }
        if(nums1[a-1]<nums2[0]){
            return findMedianSortedArrays_1(Arrays.copyOfRange(nums1,a-b-1,a-1),null);
        }
        //若有交叉，取较短数组一半，两数组同时截取

        return 0;
    }
}
