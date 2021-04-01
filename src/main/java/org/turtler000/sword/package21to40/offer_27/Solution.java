package org.turtler000.sword.package21to40.offer_27;

import org.turtler000.common.TreeNode;

/**
 * create by hanhuanyu ON 2020/12/24
 * 最近在亳州出差，很久没做题，周日也没有参加周赛
 * 在宾馆没事做做题，两周没刷题水平可能有点下降
 * <p>
 * 剑指 Offer 27. 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * <p>
 * 例如输入：
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * 镜像输出：
 * <p>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 */
public class Solution {

    public static TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        if (root.right == null && root.left == null) {
            return root;
        }else{
            TreeNode temp = mirrorTree(root.left);
            root.left = mirrorTree(root.right);
            root.right = temp;
            return root;
        }
    }
}
