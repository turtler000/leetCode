package org.turtler000.sword.package61to68.offer66;


/**
 *剑指 Offer 66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，
 * 请构建一个数组 B[0,1,…,n-1]，
 * 其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
 * 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *
 *
 * 示例:
 *
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 *
 *
 * 提示：
 *
 * 所有元素乘积之和不会溢出 32 位整数
 * a.length <= 100000
 */
/**
 * @author hanhuanyu
 * @date 2021/4/29 15:08
 * @description
 */
public class Solution {
    public static int[] constructArr(int[] a) {
        int l = a.length;
        if(l==0){
            return new int[0];
        }
        int[] b = new int[l];
        b[0] =1;
        b[l-1] = 1;
        for(int i = 1;i<a.length;i++){
            b[i] = b[i-1]*a[i-1];
        }
        int temp=1;
        for(int i = a.length-2;i>=0;i--){
            temp = temp*a[i+1];
            if(i==0){
                b[i] = temp*1;
            }else {
                b[i] = temp * b[i];
            }
        }
        return b;
    }
}
