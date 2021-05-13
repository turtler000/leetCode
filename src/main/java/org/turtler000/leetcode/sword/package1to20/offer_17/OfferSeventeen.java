package org.turtler000.leetcode.sword.package1to20.offer_17;

/**
 * create by hanhuanyu ON 2020/12/4
 * 剑指 Offer 17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 * <p>
 * <p>
 * 说明：
 * <p>
 * 用返回一个整数列表来代替打印
 * n 为正整数
 * 通过次数69,996提交次数89,352
 */
public class OfferSeventeen {
    public static int[] printNumbers(int n) {
        int m = (int)Math.pow(10,n);
        int[] ret = new int[m-1];
        for(int i=1;i<m;i++){
            ret[i-1] = i;
        }
return ret;
    }
}
