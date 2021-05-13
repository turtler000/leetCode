package org.turtler000.leetcode.sword.package21to40.offer_33;

import java.util.Arrays;

/**
 * create by hanhuanyu ON 2021/1/15
 * <p>
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 * <p>
 *  
 * <p>
 * 参考以下这颗二叉搜索树：
 * <p>
 * 5
 * / \
 * 2   6
 * / \
 * 1   3
 * 示例 1：
 * <p>
 * 输入: [1,6,3,2,5]
 * 输出: false
 * 示例 2：
 * <p>
 * 输入: [1,3,2,6,5]
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * 本科不努力，社畜徒伤悲
 */
public class Solution {
    public static boolean verifyPostorder(int[] postorder) {
        int length = postorder.length;
        if(length<=1){
            return true;
        }
        int pre = -1;
        for (int i = length - 2; i >= 0; i--) {
            if (postorder[i] < postorder[length - 1]) {
                pre = i;
                i = -1;
            }
        }
        int[] left = Arrays.copyOfRange(postorder,0,pre+1);
        int[] right = Arrays.copyOfRange(postorder,pre+1,length-1);
        for(int leftVal :left){
            if(leftVal>postorder[length-1]){
                return false;
            }
        }
        return verifyPostorder(left)&& verifyPostorder(right);
    }
}
