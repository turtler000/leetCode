package org.leetcode.questionfour;

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
      return 1;
    }
    /**
     *
     * 初步思路：
     * 每次去掉较短数组的一半，直到递归结束
     *
     * 有点难顶，再想想办法
     *
     * 新思路：
     * 二分法，分别二分，比较两次
     * 难点在二分点
     * 二分点在lenleft+lenright=(m+n+1)/2-m,m为较短数组
     * 原因：等于求第k大小的数，每次舍弃k/2个数向下取整
     *
     * 现在思路：
     * 取第k个大小的数
     * 每次取两个数组前k/2 比较舍弃 传入新数组取第k/2个数
     *
     */
    public static int[] findMedianSortedArrays_1(int[] nums1, int[] nums2,int k) {
        if(k==1){
            int[] ret ={nums1[0],nums2[0]};
        }
        return null;
    }

}
