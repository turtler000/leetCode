package org.sword.package41to60.offer_54;

import org.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: root = [3,1,4,null,2], k = 1
 * 3
 * / \
 * 1   4
 * \
 * 2
 * 输出: 4
 * 示例 2:
 * <p>
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 * 5
 * / \
 * 3   6
 * / \
 * 2   4
 * /
 * 1
 * 输出: 4
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/23 14:40
 */
public class Solution {
    int index = 0;

    public static int kthLargest(TreeNode root, int k) {
        List<TreeNode> list = midSortTree(root);
        return list.get(list.size()-k).val;
    }

    public static List<TreeNode> midSortTree(TreeNode root) {
        List ret = new ArrayList();
        if (root.left != null) {
            ret.addAll(midSortTree(root.left));
        }
        ret.add(root);
        if (root.right != null) {
            ret.addAll(midSortTree(root.right));
        }
        return ret;
    }

    public TreeNode kthNode(TreeNode root, int k) {
        if (root != null) { //中序遍历寻找第k个
            TreeNode node = kthNode(root.left, k);
            if (node != null) {
                return node;
            }
            index++;
            if (index == k) {
                return root;
            }
            node = kthNode(root.right, k);
            if (node != null) {
                return node;
            }
        }
        return null;
    }
}
