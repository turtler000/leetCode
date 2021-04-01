package org.turtler000.sword.package1to20.offer_10;

/**
 * create by hanhuanyu ON 2020/10/31
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：1
 */
public class OfferTenB {

    public static int fib(int n) {
        int num0 = 0;
        int num1 = 1;
        int num2 = 2;
        if(n==0){
            return num0;
        }
        if(n==1){
            return num1;
        }
        if(n==2){
            return num2;
        }
        for(int i =1;i<=n-2;i++){
            int num3 = num1+num2;
            num1 = num2;
            num2=num3%1000000007;
        }
        return num2;
    }
}
