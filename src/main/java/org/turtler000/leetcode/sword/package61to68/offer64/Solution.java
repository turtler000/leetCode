package org.turtler000.leetcode.sword.package61to68.offer64;


/**
 *
 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case
 等关键字及条件判断语句（A?B:C）。



 示例 1：

 输入: n = 3
 输出: 6
 示例 2：

 输入: n = 9
 输出: 45


 限制：

 1 <= n <= 10000
 */
/**
 * @author hanhuanyu
 * @date 2021/4/28 17:22
 * @description
 */
public class Solution {
    public int sumNums(int n) {
return (n+1)*n/2;
    }
}
