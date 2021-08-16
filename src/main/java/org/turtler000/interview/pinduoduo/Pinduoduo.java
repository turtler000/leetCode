package org.turtler000.interview.pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 有效括号长度
 * @author hanhuanyu
 * @date 2021/8/16
 * @description
 *
 * 第一遍没考虑左括号，倒过来再来一遍不就行了？
 * 彩笔、
 *
 */
public class Pinduoduo {
    public static int Solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack();
        int ret = 0;
        List<Integer> list = new ArrayList();
        stack.push(-1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            }
            if (chars[i] == ')') {
                if (stack.size()!=1) {
                    stack.pop();
                    list.add(i-stack.peek());
                }else{
                    stack.pop();
                    stack.push(i);
                }

            }
        }
            ret = 0;
            for (int item : list) {
                if (item > ret) {
                    ret = item;
                }
            }
            return ret;
        }
}
