package org.turtler000.sword.package41to60.offer_55;

import org.turtler000.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
输入一棵二叉树的根节点，求该树的深度。从根节点到
叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。

例如：

给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/*
@author hanhuanyu
@data 2021/3/31
@description 新电脑代码风格就这样，没时间修改了，凑合看吧
 */
public class Solution {
    public static int maxDepth(TreeNode root) {
        int ret = 0;
        if(root==null){
            return ret;
        }
        List<List> levelList = new ArrayList();
        List level1 = new ArrayList();
        level1.add(root);
        levelList.add(level1);
        while (levelList.size() != 0) {
            List<TreeNode> level = levelList.get(0);
            List list = new ArrayList();
            for (TreeNode item : level) {
                if (item.left != null) {
                    list.add(item.left);
                }
                if (item.right != null) {
                    list.add(item.right);
                }
            }
            if (list.size() != 0) {
                levelList.add(list);
            }
            levelList.remove(0);
            ret++;
        }
        return ret;
    }
    public int maxDepth_1(TreeNode root) {
        if(root == null) return 0;
        int nLeft = maxDepth_1(root.left);
        int nRight = maxDepth_1(root.right);
        return nLeft > nRight ? nLeft + 1 : nRight + 1;
    }
    public int maxDepth_2(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int cursize = queue.size();
            for(int i = 0; i < cursize; i++){
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            depth++;
        }
        return depth;
    }
}
