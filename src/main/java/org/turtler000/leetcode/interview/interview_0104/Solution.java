package org.turtler000.leetcode.interview.interview_0104;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * <p>
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * <p>
 * 回文串不一定是字典当中的单词。
 * <p>
 *  
 * <p>
 * 示例1：
 * <p>
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hanhuanyu
 * @date 2021/5/14 16:44
 * @description
 */
public class Solution {
    public static boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        Set set = new HashSet();
        for(char c:chars){
            if(set.contains(c)){
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.size()==0||set.size()==1){
            return true;
        }
        return false;
    }

}
