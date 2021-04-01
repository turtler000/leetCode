package org.turtler000.weekends.week_218;
/**
*
* @Author: Han Huanyu
* @Date: 2020/12/6
 *
 * 5617. 设计 Goal 解析器 显示英文描述
 * 通过的用户数801
 * 尝试过的用户数816
 * 用户总通过次数801
 * 用户总提交次数837
 * 题目难度Easy
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 *
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 *
 *
 *
 * 示例 1：
 *
 * 输入：command = "G()(al)"
 * 输出："Goal"
 * 解释：Goal 解析器解释命令的步骤如下所示：
 * G -> G
 * () -> o
 * (al) -> al
 * 最后连接得到的结果是 "Goal"
 * 示例 2：
 *
 * 输入：command = "G()()()()(al)"
 * 输出："Gooooal"
 * 示例 3：
 *
 * 输入：command = "(al)G(al)()()G"
 * 输出："alGalooG"
 *
 *
 * 提示：
 *
 * 1 <= command.length <= 100
 * command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成
*/
public class Goal {

    public static String interpret(String command) {
        char[] charc = command.toCharArray();
        int l = charc.length;
        String ret = new String();
        for(int i= 0;i<l;i++){
            if(charc[i]=='G'){
                ret=ret+"G";
            }else if(charc[i]=='('){
                if(charc[i+1] == ')'){
                    ret = ret+"o";
                    i++;
                }else{
                    ret=ret+"al";
                    i=i+3;
                }
            }
        }
return ret;
    }
}
