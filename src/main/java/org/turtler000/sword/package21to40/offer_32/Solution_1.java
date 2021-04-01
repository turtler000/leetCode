package org.turtler000.sword.package21to40.offer_32;

import org.turtler000.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * create by hanhuanyu ON 2021/1/14
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 *  
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *  
 * 2021/1/14
 *就这，就这？
 */
public class Solution_1 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List ret = new ArrayList();
        List<Integer> list = new ArrayList();
        if(root==null){
            return new ArrayList<>();
        }
        Queue queueA = new LinkedList();
        queueA.add(root);
        Queue queueB = new LinkedList();
        while(!queueA.isEmpty()){
            TreeNode node = (TreeNode)queueA.poll();
            if(node.left!=null){
                queueB.add(node.left);
            }
            if(node.right!=null){
                queueB.add(node.right);
            }
            list.add(node.val);
            if(queueA.isEmpty()){
                ret.add(list);
                list = new ArrayList<>();
                if(!queueB.isEmpty()){
                    queueA = queueB;
                    queueB = new LinkedList();
                }else{
                    return ret;
                }
            }
        }
        return ret;
    }
}
