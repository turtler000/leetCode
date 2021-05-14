package org.turtler000.leetcode.interview.interview_0102;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，
 * 确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 *
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author hanhuanyu
 * @date 2021/5/14 16:28
 * @description
 */
public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Map map = new HashMap();
        for(char c:chars1){
            if(map.containsKey(c)){
                map.put(c,(int)map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(char c:chars2){
            if(!map.containsKey(c)){
                return false;
            }else{
                map.put(c,(int)map.get(c)-1);
            }
        }
        for(Object o:map.keySet()){
            if((int)map.get(o)!=0){
                return false;
            }
        }
        return true;
    }
}
