package org.turtler000.leetcode.interview.inteview_0106;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hanhuanyu
 * @date 2021/5/13 19:16
 * @description
 */
public class Solution {
    public boolean isUnique(String astr) {
char[] chars = astr.toCharArray();
Set set = new HashSet();
for(Character s:chars){
    if (set.contains(s)){
        return false;
    }else{
        set.add(s);
    }
}
return true;
    }
}