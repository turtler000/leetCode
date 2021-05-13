package org.turtler000.leetcode.sword.package41to60.offer_47;

/**
 * 剑指 Offer 47. 礼物的最大价值
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 < grid.length <= 200
 * 0 < grid[0].length <= 200
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/3 15:32
 */
public class Solution {
    public static int maxValue(int[][] grid) {
        if(grid.length==0||grid[0].length==0){
            return 0;
        }
        return values(grid,0,0);
    }

    //
    public static int values(int[][] grid, int x, int y) {
        int target = grid[x][y];
        if(x==grid.length-1&&y==grid[0].length-1){
            return target;
        }
        if(x+1>=grid.length){
            return values(grid,x,y+1)+target;
        }else if(y+1>=grid[0].length){
            return values(grid,x+1,y)+target;
        }
        int next = Math.max(values(grid,x+1,y),values(grid,x,y+1));
        return next+target;
    }

    public int maxValue_1(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1]) + grid[i - 1][j - 1];
            }
        }

        return dp[n];
    }
}
