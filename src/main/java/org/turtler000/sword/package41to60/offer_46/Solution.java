package org.turtler000.sword.package41to60.offer_46;

import java.util.Arrays;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * 示例 1:
 * <p>
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= num < 231
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/2 14:47
 */
public class Solution {
    public static int translateNum(int num) {
        char[] numChar = String.valueOf(num).toCharArray();
        if(numChar.length==1){
            return 1;
        }
        int[] nums = new int[numChar.length];
        for (int i = 0; i < numChar.length; i++) {
            nums[i] = Integer.valueOf(String.valueOf(numChar[i]));
        }
            return translateNUms(nums);
    }

    public static int translateNUms(int[] nums) {
        if (nums.length == 0||nums.length==1) {
            return 1;
        }
        int x = nums[nums.length - 1];
        int y = nums[nums.length - 2];
        if ((y * 10 + x) >= 26&&y!=0) {
            return translateNUms(Arrays.copyOfRange(nums, 0, nums.length - 1));
        } else {
            return translateNUms(Arrays.copyOfRange(nums, 0, nums.length - 1))
                    + translateNUms(Arrays.copyOfRange(nums, 0, nums.length - 2));
        }
    }
}
