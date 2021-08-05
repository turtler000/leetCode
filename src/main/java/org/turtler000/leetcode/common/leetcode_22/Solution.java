package org.turtler000.leetcode.common.leetcode_22;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，
 * 请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 爬，烦死了，不会做
 *
 * @author hanhuanyu
 * @date 2021/8/5 15:19
 * @description
 */
public class Solution {
    public static List<String> generateParenthesis(int n) {
        if (n == 1) {
            String ret = "()";
            List retO = new ArrayList();
            retO.add(ret);
            return retO;
        }
        List<String> list = generateParenthesis(n-1);
        for(String item:list){

        }
        return null;
    }
}
