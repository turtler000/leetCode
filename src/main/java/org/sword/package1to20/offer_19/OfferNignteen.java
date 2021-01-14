package org.sword.package1to20.offer_19;

/**
 * create by hanhuanyu ON 2020/12/5
 * 剑指 Offer 19. 正则表达式匹配
 * 请实现一个函数用来匹配包含'. '和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，
 * 但与"aa.a"和"ab*a"均不匹配。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * 示例 3:
 * <p>
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * 示例 4:
 * <p>
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 * 示例 5:
 * <p>
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母以及字符 . 和 *，无连续的 '*'。
 */
public class OfferNignteen {
    public static boolean isMatch(String s, String p) {
        //做空判断
        char[] chars = s.toCharArray();
        int sl = chars.length;
        char[] charp = p.toCharArray();
        int pl =charp.length;
        if(sl==0&&pl==0){
            return true;
        }else if(sl!=0&&pl==0){
            return false;
        }
        //p最后一位是'.',各去掉最后一个递归
        if(charp[pl-1]=='.'){
            if(sl==0){
                return false;
            }
            return isMatch(s.substring(0,sl-1),p.substring(0,pl-1));
        }
        //最后一位是'*'
        else if(charp[pl-1]=='*'){
            if(sl==0){
                return isMatch(s, p.substring(0, pl-2));
            }
            if(chars[sl-1]==charp[pl-2]||charp[pl-2]=='.') {
                //即使是匹配成功也有可能应该匹配失败
                return isMatch(s.substring(0, sl - 1), p.substring(0, pl))
                        ||isMatch(s.substring(0, sl), p.substring(0, pl-2));
            }else{
                return isMatch(s.substring(0, sl), p.substring(0, pl-2));
            }
        }
        //最后一位是普通字符
        else{
            if(sl==0){
                return false;
            }
            if(charp[pl-1]==chars[sl-1]){
                return isMatch(s.substring(0,sl-1),p.substring(0,pl-1));
            }else {
                return false;
            }
        }
    }
}
