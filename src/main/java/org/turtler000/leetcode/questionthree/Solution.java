package org.turtler000.leetcode.questionthree;

/**
 * 无重复字符最长子串
 * create by hanhuanyu ON 2020/6/30
 *
 * {@link org.turtler000.sword.package41to60.offer_48.Solution}
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if(chars.length==1){
            return 1;
        }
        int ret = 0;
        int flag = 0;
        int last = 1;
       for(int i = 1;i<chars.length;i++){
           for(int j =i-1;j>=flag;j--){
               if(chars[j]==chars[i]){
                   if(ret<i-j){
                       ret = i -j;
                   }
                   flag = j;
                   j = -1;
                   last =0;
               }
               if(j==flag){
                   if(flag==0){
                       if(ret<i-flag+last){
                           ret = i-flag+last;
                       }
                   }
                   if(ret<i-flag){
                       ret = i-flag;
                   }
               }
           }
       }
        return ret;
    }
}
