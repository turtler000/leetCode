package org.turtler000;

/**
 * baidu
 * @author hanhuanyu
 * @date 2021/9/1
 * @description
 */
public class Solution {
//    public static int max(int[] nums){
//        int[] dp = new int[nums.length+1];
//        dp[0] = nums[0];
//        for(int i = 1;i<nums.length;i++){
//            if(dp[i-1]+nums[i]>=dp[i-1]){
//                dp[i] = dp[i-1]+nums[i];
//            }else if(dp[i-1]+nums[i]<dp[i-1]){
//
//            }
//        }
//    }
    public static int max_1(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int ret = 0;
        for(int item:nums){
            ret = ret+item;
        }
        int max = ret;
        while(left<right){

            if(nums[left]<=nums[right]){
                left ++;
                ret = ret-nums[left];
            }
            if(nums[left]>nums[right]){
                right --;
                ret = ret -nums[right];
            }
            if(max<ret){
                max = ret;
            }
        }
        return ret;
    }
}
