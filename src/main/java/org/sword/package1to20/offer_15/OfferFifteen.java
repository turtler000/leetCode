package org.sword.package1to20.offer_15;

/**
 * create by hanhuanyu ON 2020/12/4
 * 请实现一个函数，输入一个整数（以二进制串形式），
 * 输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，
 * 有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * 示例 2：
 * <p>
 * 输入：00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 * 示例 3：
 * <p>
 * 输入：11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 *  
 * <p>
 * 提示：
 * <p>
 * 输入必须是长度为 32 的 二进制串 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferFifteen {
    // you need to treat n as an unsigned value
    //todo 大意了，没考虑负数
    public static int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        int ret = 0;
        while(n!=0){
            ret = ret+n%2;
            n = n/2;
        }
        return ret;
    }
    //不讲武德
    public static int hammingWeight_1(int n) {
        return Integer.bitCount(n);
    }
}
