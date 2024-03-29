package org.turtler000.leetcode.dynamic.leetcode_322;

/**
 * 动态规划
 * 凑零钱
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 *
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 *
 * 你可以认为每种硬币的数量是无限的。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：coins = [1, 2, 5], amount = 11
 * 输出：3
 * 解释：11 = 5 + 5 + 1
 * 示例 2：
 *
 * 输入：coins = [2], amount = 3
 * 输出：-1
 * 示例 3：
 *
 * 输入：coins = [1], amount = 0
 * 输出：0
 * 示例 4：
 *
 * 输入：coins = [1], amount = 1
 * 输出：1
 * 示例 5：
 *
 * 输入：coins = [1], amount = 2
 * 输出：2
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author hanhuanyu
 * @date 2021/8/27 16:05
 * @description
 */
public class Solution {

    public static int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        int[] dp = new int[amount+1];
        for(int item:coins){
            if(item<=amount){
                dp[item] = 1;
            }
        }
        for(int i =0;i<=amount;i++){
            for(int item:coins){
                if(i>=item){
                    if(dp[i-item]!=0){
                        if(dp[i]==0||dp[i]>dp[i-item]+1){
                            dp[i] = dp[i-item]+1;
                        }
                    }
                }
            }
        }
        if(dp[amount]==0){
            return -1;
        }
        return dp[amount];

    }
}