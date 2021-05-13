package org.turtler000.leetcode.sword.package1to20.offer_3;

/**
 * create by hanhuanyu ON 2020/9/22
 * <p>
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= s 的长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferThree {
/**
 * 两种方法消耗内存是一样的，没啥意思
 * @param
 * @return
 */
    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder ret = new StringBuilder();
        for (char item : chars) {
            if (Character.isSpaceChar(item)) {
                ret.append("%20");
            } else {
                ret.append(item);
            }
        }
        return ret.toString();
    }

    public static String replaceSpace_1(String s) {
        return s.replace(" ", "%20");
    }
}
