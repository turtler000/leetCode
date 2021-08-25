package org.turtler000.leetcode.sword.package1to20.offer_5;

/**
 * 替换空格
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
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hanhuanyu
 * @date 2021/8/24 11:18
 * @description
 */
public class Solution {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char item : chars){
            if(item == ' '){
                builder.append("%20");
            }else{
                builder.append(item);
            }
        }
        return builder.toString();
    }
}
