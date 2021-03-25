package org.sword.package41to60.offer_53_2;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，
 * 并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [0,1,3]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/23 14:24
 */
public class Solution {
    public static int missingNumber(int[] nums) {
        if(nums[0]!=0){
            return 0;
        }
        for(int i =0;i<nums.length;i++){
            if(i+1!=nums.length&&nums[i+1]-nums[i]==2){
                return nums[i]+1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
