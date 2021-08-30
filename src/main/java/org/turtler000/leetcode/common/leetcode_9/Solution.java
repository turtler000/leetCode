package org.turtler000.leetcode.common.leetcode_9;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode.9回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author hanhuanyu
 * @date 2021/8/27 10:18
 * @description
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        List list = new ArrayList();
        while(x!=0){
            list.add(x%10);
            x = x/10;
        }
        int length = list.size();
        for(int i =0;i<length/2;i++){
            if(list.get(i)!=list.get(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
