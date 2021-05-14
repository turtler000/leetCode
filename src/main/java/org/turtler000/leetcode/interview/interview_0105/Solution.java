package org.turtler000.leetcode.interview.interview_0105;

/**
 * 面试题 01.05. 一次编辑
 * 字符串有三种编辑操作:
 * 插入一个字符、删除一个字符或者替换一个字符。
 * 给定两个字符串，
 * 编写一个函数判定它们是否只需要一次(或者零次)编辑。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * first = "pale"
 * second = "ple"
 * 输出: True
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * first = "pales"
 * second = "pal"
 * 输出: False
 *
 * @author hanhuanyu
 * @date 2021/5/14 17:20
 * @description
 */
public class Solution {
    public boolean oneEditAway(String first, String second) {
        int len = first.length()-second.length();
        if (len>1||len<-1) {
            return false;
        }
        int count=1;
        for (int i = 0,j=0; i < first.length()&&j < second.length(); i++,j++) {
            if (first.charAt(i)!=second.charAt(j)) {
                if (len==1) { //second要不要添加一个字符
                    j--;
                }else if (len==-1) { //second要不要删除一个字符
                    i--;
                }
                count--;
            }
            if (count<0) {//最多编辑一次
                return false;
            }
        }
        return true;
    }
}
