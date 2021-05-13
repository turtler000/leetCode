package org.turtler000.leetcode.sword.package41to60.offer_58_1;

import java.util.ArrayList;
import java.util.List;

/*
剑指 Offer 58 - I. 翻转单词顺序
输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
为简单起见，标点符号和普通字母一样处理。
例如输入字符串"I am a student. "，则输出"student. a am I"。

示例 1：

输入: "the sky is blue"
输出: "blue is sky the"
示例 2：

输入: "  hello world!  "
输出: "world! hello"
解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
示例 3：

输入: "a good   example"
输出: "example good a"
解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class Solution {
    public static String reverseWords(String s) {
        if("".equals(s)){
            return s;
        }
        char[] chars = s.toCharArray();
        List<List> list = new ArrayList<>();
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                list.add(charList);
                charList = new ArrayList<>();
            } else {
                    charList.add(chars[i]);
            }
        }
        if(charList.size()!=0) {
            list.add(charList);
        }
        StringBuffer ret = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).size()!=0) {
                for (Object object : list.get(i)) {
                    ret.append(object);
                }
                ret.append(' ');
            }
        }
        if(ret.length()!=0) {
            ret.deleteCharAt(ret.length() - 1);
        }
        return ret.toString();
    }
}
