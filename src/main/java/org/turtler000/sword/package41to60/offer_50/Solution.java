package org.turtler000.sword.package41to60.offer_50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * <p>
 * 示例:
 * <p>
 * s = "abaccdeff"
 * 返回 "b"
 * <p>
 * s = ""
 * 返回 " "
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/9 14:42
 */
public class Solution {
    public static char firstUniqChar(String s) {
        if ("".equals(s)) {
            return ' ';
        }
        char[] chars = s.toCharArray();
        Map map = new HashMap();
        List list = new ArrayList();
        for (char item : chars) {
            if (map.containsKey(item)) {
                map.put(item, (int) map.get(item) + 1);
                    list.remove((Object) item);
            }else{
                map.put(item,1);
                list.add(item);
            }
        }
        if(list.size()>0) {
            return (char) list.get(0);
        }else{
            return ' ';
        }
    }
}
