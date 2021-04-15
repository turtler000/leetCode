package org.turtler000.sword.package41to60.offer_59;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*/
剑指 Offer 59 - I. 滑动窗口的最大值
给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

示例:

输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7]
解释:

  滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7


提示：

你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。

注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/
 */
public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (!queue.isEmpty() && i - queue.peek() >= k) {
                queue.poll();
            }
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offer(i);
            if (i >= k - 1) {
                res[j++] = nums[queue.peek()];
            }
        }
        return res;
    }

    public static int[] maxSlidingWindow_1(int[] nums, int k) {
        if(nums.length==0){
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i =0;i<nums.length;i++){
            while(!queue.isEmpty()&&i-queue.peekFirst()>=k){
                queue.remove();
            }
            while(!queue.isEmpty()&&nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            if(i>=k-1) {
                res[i - k + 1] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
