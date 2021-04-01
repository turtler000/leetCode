package org.turtler000.sword.package21to40.offer_34;

import org.turtler000.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * create by hanhuanyu ON 2021/1/15
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 * <p>
 *  
 * <p>
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * 返回:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 */
public class Solution {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List ret = new ArrayList();
        if (root == null) {
            return new ArrayList<>();
        }
        int rootValue = root.val;
        if (sum < rootValue) {
            return new ArrayList<>();
        } else if (sum == rootValue) {
            if (root.left == null && root.right == null) {
                List listInt = new ArrayList();
                listInt.add(rootValue);
                ret.add(listInt);
                return ret;
            } else {
                return new ArrayList<>();
            }
        }
        List<List<Integer>> leftList = pathSum(root.left, sum - rootValue);
        List<List<Integer>> rightList = pathSum(root.right, sum - rootValue);
        if (leftList != null) {
            for (List<Integer> listInt : leftList) {
                listInt.add(0, rootValue);
                ret.add(listInt);
            }
        }
        if (rightList != null) {
            for (List<Integer> listInt : rightList) {
                listInt.add(0, rootValue);
                ret.add(listInt);
            }
        }
        return ret;
    }

    public static List<List<Integer>> pathSum_1(TreeNode root, int sum) {
        List<List<Integer>> ret = getRout(root);
        for (int i = ret.size()-1;i>=0;i--) {
            int n = 0;
            for (int integer : ret.get(i)) {
                n = n + integer;
            }
            if (sum != n) {
                ret.remove(i);
            }
        }
        return ret;
    }

    public static List<List<Integer>> getRout(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List ret = new ArrayList();
        List listInt =new ArrayList();
        listInt.add(root.val);
        if(root.right==null&&root.left==null){
            ret.add(listInt);
            return ret;
        }
        List<List<Integer>> leftList = getRout(root.left);
        List<List<Integer>> rightList = getRout(root.right);
        for (List<Integer> listL : leftList) {
            listInt= new ArrayList();
            listInt.add(root.val);
            listInt.addAll(listL);
            ret.add(listInt);
        }
        for (List<Integer> listR : rightList) {
            listInt = new ArrayList();
            listInt.add(root.val);
            listInt.addAll(listR);
            ret.add(listInt);
        }
        return ret;
    }
}
