package org.sword.offerfourteen;

/**
 * create by hanhuanyu ON 2020/12/4
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m - 1] 。
 * 请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 *  
 *
 * 提示：
 *
 * 2 <= n <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferFourteenExt {
    public static int cuttingRope(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        long ret = 1L;
        while(n!=0) {
            if (n != 4&&n!=2) {
                ret = ret * 3;
                n = n - 3;
            } else if (n  == 4) {
                ret = ret * 4;
                n = 0;
            } else if(n == 2){
                ret = ret*2;
                n=0;
            }
            ret = ret%1000000007;
        }
        return  (int)ret;
    }
}
