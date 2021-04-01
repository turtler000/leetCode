package org.turtler000.sword.package21to40.offer_32;

import org.turtler000.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * create by hanhuanyu ON 2021/1/14
 * <p>
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回：
 * <p>
 * [3,9,20,15,7]
 *  
 * <p>
 * 提示：
 * <p>
 * 节点总数 <= 1000
 */
public class Solution {
    public static int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        List<Integer> retList = new ArrayList();
        Queue queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = (TreeNode)queue.poll();
            retList.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return retList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
