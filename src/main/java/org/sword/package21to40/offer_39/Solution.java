package org.sword.package21to40.offer_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 剑指 Offer 38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * <p>
 * <p>
 * <p>
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 * <p>
 * create by dell ON 2021/2/18
 */
public class Solution {
    public static String[] permutation(String s) {
        if ("".equals(s) && s == null) {
            return null;
        }
        char[] charS = s.toCharArray();
        List charList = new ArrayList();
        for (char item : charS) {
            charList.add(item);
        }
        List<String> permutation = getPermutation(charList);
        return permutation.toArray(new String[permutation.size()]);
    }

    public static List getPermutation(List charList) {
        List<String> ret = new ArrayList<>();
        if (charList.size() == 1) {
            ret.add(String.valueOf(charList.get(0)));
            return ret;
        }
        List flag = new ArrayList();
        for (int i = 0; i < charList.size(); i++) {
            Character now = (Character) charList.get(i);
            if (flag.contains(now)) {
                continue;
            }
            flag.add(now);
            List tempList = new ArrayList(charList);
            tempList.remove(now);
            List list = getPermutation(tempList);
            for (Object stringItem : list) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(now);
                stringBuilder.append(stringItem.toString());
                ret.add(stringBuilder.toString());
            }
        }
        return ret;
    }
}
