package org.turtler000.sword.package41to60.offer_55_2;


import org.turtler000.common.TreeNode;

/*
输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。

 

示例 1:

给定二叉树 [3,9,20,null,null,15,7]

    3
   / \
  9  20
    /  \
   15   7
返回 true 。

示例 2:

给定二叉树 [1,2,2,3,3,null,null,4,4]

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
/*
@author hanhuanyu
@date 2021/4/1
 */
public class Solution {
    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>=2){
            return false;
        }else{
            return isBalanced(root.left)&&isBalanced(root.right);
        }
    }


    public static int maxDepth(TreeNode root){
        if(root == null) return 0;
        int nLeft = maxDepth(root.left);
        int nRight = maxDepth(root.right);
        return nLeft > nRight ? nLeft + 1 : nRight + 1;
    }


    public static int minDepth(TreeNode root){
        if(root == null) return 0;
        int nLeft = minDepth(root.left);
        int nRight = minDepth(root.right);
        return nLeft < nRight ? nLeft + 1 : nRight + 1;
    }
}
/*

 */