package org.turtler000.leetcode.sword.package21to40.offer_28;

import org.turtler000.common.TreeNode;

/**
 * create by hanhuanyu ON 2020/12/29
 * <p>
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 12/29 周二
 * <p>
 * 上周去亳州出差了，回来后过了双休，周六吃了螺狮粉，看了电影沐浴之王，周日炒了鸡胸肉吃。
 * 周一正常工作，今天正常工作。
 */
public class Solution {
    public static boolean isSymmetric(TreeNode root) {
            if(root==null){
                return true;
            }
            TreeNode right = mirror(root.right);
            return isSameTree(root.left,right);
        }
        public static TreeNode mirror(TreeNode tree){
        if(tree == null){
            return null;
        }else{
            TreeNode temp = mirror(tree.left);
            tree.left = mirror(tree.right);
            tree.right = temp;
        }
        return tree;
        }
        public static Boolean isSameTree(TreeNode treeA,TreeNode treeB){
        if(treeA==null&&treeB==null){
            return true;
        }else if(treeA==null&&treeB!=null){
            return false;
        }else if(treeA!=null&&treeB==null){
            return false;
        }  if(treeA.val == treeB.val){
                return isSameTree(treeA.left,treeB.left)&&isSameTree(treeA.right,treeB.right);
            }else{
                return false;
            }
        }
}
