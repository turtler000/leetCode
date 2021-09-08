package org.turtler000.leetcode.common.leetcode_45;

/**
 * leetcode_45 跳跃游戏2
 * @author hanhuanyu
 * @date 2021/9/7 16:13
 * @description
 */
public class Solution {
    //动态规划
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 0;i<nums.length;i++){
            //到当前节点最小步
            int step = nums[i];
            if(i==0||step != 0){
                for(int j = 1;j<=step;j++) {
                    if(i+j<dp.length) {
                        if (dp[i + j] > dp[i] + 1 || dp[i + j] == 0) {
                            dp[i + j] = dp[i] + 1;
                        }
                    }
                }
            }
        }
        return dp[nums.length-1];
    }
    //贪心
    public static int jump_1(int[] nums){
        int maxDistance = 0;
        int ret = 0;
        if(nums.length==0){
            return  ret;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]+i>maxDistance){
                maxDistance = nums[i]+i;

                ret++;
            }
        }
        return ret;
    }
    public static int jump_2(int[] nums){
        int curDistance = 0;    // 当前覆盖的最远距离下标
        int ans = 0;            // 记录走的最大步数
        int nextDistance = 0;   // 下一步覆盖的最远距离下标
        for (int i = 0; i < nums.length - 1; i++) { // 注意这里是小于nums.size() - 1，这是关键所在
            nextDistance = Math.max(nums[i] + i, nextDistance); // 更新下一步覆盖的最远距离下标
            if (i == curDistance) {                 // 遇到当前覆盖的最远距离下标
                curDistance = nextDistance;         // 更新当前覆盖的最远距离下标
                ans++;
            }
        }
        return ans;
    }
}
