package org.leetCode.questionfive;

import org.apache.tomcat.util.buf.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * 通过次数339,112提交次数1,081,613
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * create by hanhuanyu ON 2020/7/6
 */
public class Questionfive {
    public static String longestPalindrome(String s) {
        if("".equals(s)){
            return "";
        }
        char[] a = s.toCharArray();
        int aLength = a.length;
        List<Character> ret = new ArrayList();
        List<Character> temp = new ArrayList();
        //左循环
        for (int i = 0; i < aLength; i++) {
            int left = i;
            //右循环
            for (int right = aLength - 1; right > left; right--) {
                int lefttag = left;
                int righttag = right;
                //若相等，进入左右相遇循环
                while (a[lefttag] == a[righttag]) {
                    temp.add(a[lefttag]);
                    //左右为一个，奇数回文
                    if (righttag - lefttag == 0) {
                        temp = getPalindromeList(temp, 1);
                        if (ret == null || ret.size() <= temp.size()) {
                            ret.clear();
                            ret.addAll(temp);
                        }
                        break;
                    } else if (righttag - lefttag == 1) {
                        temp = getPalindromeList(temp, 0);
                        if (ret == null || ret.size() <= temp.size()) {
                            ret.clear();
                            ret.addAll(temp);
                        }
                        break;
                    }
                    lefttag++;
                    righttag--;
                }
                temp.clear();
            }

        }
        StringBuilder retS = new StringBuilder();
        for (char item : ret) {
            retS.append(item);
        }
        return retS.toString();
    }

    public static List getPalindromeList(List list, int tag) {
        //偶数
        if (tag == 0) {
            for (int i = list.size() - 1; i >= 0; i--) {
                list.add(list.get(i));
            }
        }
        //奇数
        if (tag == 1) {
            for (int i = list.size() - 2; i >= 0; i--) {
                list.add(list.get(i));
            }
        }
        return list;
    }
}


