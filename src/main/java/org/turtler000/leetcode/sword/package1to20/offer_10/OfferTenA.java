package org.turtler000.leetcode.sword.package1to20.offer_10;

/**
 * create by hanhuanyu ON 2020/10/31
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：5
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public  class OfferTenA {

    public static int fib(int n) {
    int num1 = 0;
    int num2 = 1;
    if(n==0){
        return num1;
    }
    if(n==1){
        return num2;
    }
    for(int i =0;i<=n-2;i++){
       int num3 = num1+num2;
       num1 = num2;
       num2=num3%1000000007;
    }
    return num2;
    }

    public static int fib_1(int n) {
        int num1 = 0;
        int num2 = 1;
        if(n==0){
            return num1;
        }
        if(n==1){
            return num2;
        }
      return fib_1(n-1)+fib_1(n-2);
    }
}
