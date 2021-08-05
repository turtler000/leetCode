package org.turtler000.leetcode.common.leetcode_461;

/**
 *
 * 461. 汉明距离
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 * @author hanhuanyu
 * @date 2021/8/5 16:17
 * @description
 */
public class Solution {
    public static int hammingDistance(int x, int y) {
        int sum = x^y;
        int ret = 0;
        while(sum!=0){
            if(sum%2==1){
                ret++;
            }
            sum = sum >>1;
        }
        return ret;
    }
}
