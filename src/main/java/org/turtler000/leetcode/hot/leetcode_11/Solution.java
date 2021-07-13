package org.turtler000.leetcode.hot.leetcode_11;

import java.util.Arrays;

/**
 *
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author hanhuanyu
 * @date 2021/7/13 15:32
 * @description
 */
public class Solution {
    //思路：一开始左右两边，然后低的移动,用递归超时了
    public static int maxArea(int[] height) {
            if(height.length==0||height.length==1){
                return 0;
            }
            int left = height[0],right = height[height.length-1];
            int ans = (height.length-1)*Math.min(left,right);
            if(left>=right){
                return Math.max(ans,maxArea(Arrays.copyOfRange(height,0,height.length-1)));
            }else{
                return Math.max(ans,maxArea(Arrays.copyOfRange(height,1,height.length)));
            }
    }
    public static int maxArea_1(int[] height) {
        if(height.length==0||height.length==1){
            return 0;
        }
        int left = 0,right = height.length-1;
        int ans = right*Math.min(height[left],height[right]);
        while(right>left){
            if(height[left]>=height[right]){
                right--;
            }else{
                left++;
            }
            ans = Math.max(ans,(right-left)*Math.min(height[left],height[right]));
        }
        return ans;
    }
}
