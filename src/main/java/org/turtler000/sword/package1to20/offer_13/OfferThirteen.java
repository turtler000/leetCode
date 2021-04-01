package org.turtler000.sword.package1to20.offer_13;

/**
 * create by hanhuanyu ON 2020/12/1
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 * 提示：
 * <p>
 * 1 <= n,m <= 100
 * 0 <= k <= 20
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferThirteen {
    public static int getSum(int a) {
        int sum = 0;
        while (a != 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }

    public static int movingCount(int m, int n, int k) {
        int a[][] = new int[m][n];
        int ret = 0;
        //走路问题，使用深度遍历
        if (k == 0) {
            return 1;
        }
        count(a, 0, 0, k);
        for (int i = 0; i < m; i++) {
            for(int j =0;j<n;j++){
                if(a[i][j]==1){
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void count(int[][] count, int m, int n, int k) {
        //当前点能走且没走过
        if (getSum(m) + getSum(n) <= k && count[m][n] == 0) {
            count[m][n] = 1;
            //往上走
            if (m - 1 >= 0) {
                count(count, m - 1, n, k);
            }
            //往下走
            if (m + 1 < count.length) {
                count(count, m + 1, n, k);
            }
            //往左
            if (n - 1 >= 0) {
                count(count, m, n - 1, k);
            }
            //往右
            if (n + 1 < count[0].length) {
                count(count, m, n + 1, k);
            }
            return;
            //当前点不能走
        } else if (getSum(m) + getSum(n) > k) {
            count[m][n] = 2;
            return;
        }
    }
}
