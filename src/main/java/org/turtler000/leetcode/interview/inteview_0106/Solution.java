package org.turtler000.leetcode.interview.inteview_0106;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 面试题 01.06. 字符串压缩
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 * <p>
 * 示例1:
 * <p>
 * 输入："aabcccccaaa"
 * 输出："a2b1c5a3"
 * 示例2:
 * <p>
 * 输入："abbccd"
 * 输出："abbccd"
 * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 *
 * @author hanhuanyu
 * @date 2021/5/13 19:16
 * @description
 */
public class Solution {
    public String compressString(String S) {
        char[] charS = S.toCharArray();
        char temp = ' ';
        int times = 0;
        List charList = new ArrayList();
        for (char c : charS) {
            if (temp == ' ') {
                temp = c;
                times++;
                charList.add(c);
            }else {
                if (c == temp) {
                    times++;
                } else {
                    charList.add(times);
                    times=0;
                    temp = c;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Object o:charList){
            stringBuilder.append(o);
        }
        String ret = stringBuilder.toString();
        if(ret.length()>S.length()){
            return S;
        }
        return ret;
    }
}
