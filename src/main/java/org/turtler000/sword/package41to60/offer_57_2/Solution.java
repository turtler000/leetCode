package org.turtler000.sword.package41to60.offer_57_2;

import java.util.LinkedList;
import java.util.List;

/*
输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

 

示例 1：

输入：target = 9
输出：[[2,3,4],[4,5]]
示例 2：

输入：target = 15
输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 

限制：

1 <= target <= 10^5

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> ans = new LinkedList<>();
        // [left,right)
        int left = 1, right = 1, sum = 0;
        for (int i = 1; i <= target / 2 + 1; i++) {
            sum += i;
            right++;
            while (sum > target && left < right) {
                sum -= left;
                left++;
            }
            if (sum == target) {
                int[] tmp = new int[right - left];
                int count = 0;
                for (int j = left; j < right; j++) {
                    tmp[count++] = j;
                }
                ans.add(tmp);
            }
        }
        int[][] ansArray = new int[ans.size()][];
        int count = 0;
        for (int[] item : ans) {
            ansArray[count++] = item;
        }
        return ansArray;
    }

    public static int[][] findContinuousSequence_1(int target) {
        List<int[]> ret = new LinkedList<>();
        for (int a = 1; a <= target - 1; a++) {
            int ans = a;
           for(int b = a+1;b<=target;b++){
               ans = ans+b;
               if(ans>target){
                   b=target+1;
               }
               if(ans == target){
                   int[] tmp = new int[b - a+1];
                   for(int i =0;i<=b-a;i++){
                       tmp[i] =a+i;
                   }
                   ret.add(tmp);
                   b=target+1;
               }
           }
        }
        int[][] ansArray = new int[ret.size()][];
        int count = 0;
        for (int[] item : ret) {
            ansArray[count++] = item;
        }
        return ansArray;
    }
}
