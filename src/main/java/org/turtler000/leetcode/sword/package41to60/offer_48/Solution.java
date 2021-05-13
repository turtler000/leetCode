package org.turtler000.leetcode.sword.package41to60.offer_48;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * <p>
 * 提示：
 * <p>
 * s.length <= 40000
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/8 13:46
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if("".equals(s)){
            return 0;
        }
        char[] chars = s.toCharArray();
        Map map = new HashMap<>();
        int ret = 0;
        //最近的重复字符串位置
        int last = -1;
        for (int i = 0; i < chars.length; i++) {
            //当前字符串长度
            if(map.containsKey(chars[i])) {
                last = Math.max((int) map.get(chars[i]), last);
            }
            int temp = i-last;
            map.put(chars[i],i);
            ret = Math.max(temp,ret);
        }
        return ret;
    }
    public static int answer(String s){
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
