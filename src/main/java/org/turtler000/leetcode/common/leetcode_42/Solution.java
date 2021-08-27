package org.turtler000.leetcode.common.leetcode_42;

import java.util.Stack;

/**
 * leetcode_42 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
 * 计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 *
 * @author hanhuanyu
 * @date 2021/8/19 14:28
 * @description
 */
public class Solution {
    public static int trap(int[] height) {
        int max = height[0];
        int mid = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                mid = i;
            }
        }
        int trap = 0;
        int temp = height[0];
        for (int i = 0; i < mid; i++) {
                if(temp>height[i]){
                    trap = trap+(temp - height[i]);
                }else{
                    temp = height[i];
                }
        }
        temp = height[height.length-1];
        for(int i = height.length-1;i>mid;i--){
        if(temp>height[i]){
            trap = trap+(temp - height[i]);
        }else{
            temp = height[i];
        }
    }
        return trap;
    }

}
