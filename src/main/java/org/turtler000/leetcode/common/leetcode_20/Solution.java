package org.turtler000.leetcode.common.leetcode_20;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hanhuanyu
 * @date 2021/7/31 14:58
 * @description
 */
public class Solution {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for(int i  =0;i<chars.length;i++){
            if(chars[i]=='{'||chars[i]=='['||chars[i]=='('){
                stack.push(chars[i]);
            }else{
                if(chars[i]=='}'&&(Character)stack.peek()=='{'){
                    stack.pop();
                }else if(chars[i]==']'&&(Character)stack.peek()=='['){
                    stack.pop();
                }else if(chars[i]==')'&&(Character)stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
