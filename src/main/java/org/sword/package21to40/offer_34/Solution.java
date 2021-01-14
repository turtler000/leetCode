package org.sword.package21to40.offer_34;

import org.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * create by hanhuanyu ON 2021/1/14
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
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
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List ret = new ArrayList();
        List<Integer> list = new ArrayList();
        int tag = 0;
        if(root==null){
            return new ArrayList<>();
        }
        List listA = new LinkedList();
        listA.add(root);
        List listB = new LinkedList();
        while(!listA.isEmpty()){
            TreeNode node = (TreeNode)listA.get(0);
            listA.remove(0);
            if(tag%2==0) {
                if (node.left != null) {
                    listB.add(node.left);
                }
                if (node.right != null) {
                    listB.add(node.right);
                }
            }else{
                if (node.right != null) {
                    listB.add(node.right);
                }
                if (node.left != null) {
                    listB.add(node.left);
                }
            }
            list.add(node.val);
            if(listA.isEmpty()){
                ret.add(list);
                list = new ArrayList<>();
                if(!listB.isEmpty()){
                    for(int i = listB.size()-1;i>=0;i--){
                        listA.add(listB.get(i));
                    }
                    listB = new LinkedList();
                    tag++;
                }else{
                    return ret;
                }
            }
        }
        return ret;
    }
}
