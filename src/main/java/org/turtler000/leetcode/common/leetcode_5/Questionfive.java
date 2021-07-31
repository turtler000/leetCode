package org.turtler000.leetcode.common.leetcode_5;

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
    /**
     * 著名的马拉车算法，表示尊敬方法名开头大写
     * @param
     * @return
     */
    public static String Manacher(String s){
        if (s.length() < 2) {
            return s;
        }
        // 第一步：预处理，将原字符串转换为新字符串
        String t = "$";
        for (int i=0; i<s.length(); i++) {
            t += "#" + s.charAt(i);
        }
        // 尾部再加上字符@，变为奇数长度字符串
        t += "#@";
        // 第二步：计算数组p、起始索引、最长回文半径
        int n = t.length();
        // p数组
        int[] p = new int[n];
        int id = 0, mx = 0;
        // 最长回文子串的长度
        int maxLength = -1;
        // 最长回文子串的中心位置索引
        int index = 0;
        for (int j=1; j<n-1; j++) {
            // 参看前文第五部分
            p[j] = mx > j ? Math.min(p[2*id-j], mx-j) : 1;
            // 向左右两边延伸，扩展右边界
            while (t.charAt(j+p[j]) == t.charAt(j-p[j])) {
                p[j]++;
            }
            // 如果回文子串的右边界超过了mx，则需要更新mx和id的值
            if (mx < p[j] + j) {
                mx = p[j] + j;
                id = j;
            }
            // 如果回文子串的长度大于maxLength，则更新maxLength和index的值
            if (maxLength < p[j] - 1) {
                // 参看前文第三部分
                maxLength = p[j] - 1;
                index = j;
            }
        }
        // 第三步：截取字符串，输出结果
        // 起始索引的计算参看前文第四部分
        int start = (index-maxLength)/2;
        return s.substring(start, start + maxLength);
    }
}


