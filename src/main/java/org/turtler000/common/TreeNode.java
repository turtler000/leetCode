package org.turtler000.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * create by hanhuanyu ON 2020/12/12
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(Object x) {
        if (x==null||"null".equals(x)) {
            return;
        } else {
            val = Integer.valueOf(x.toString());
        }
    }

    //根据层级遍历的构造函数,有bug,真的烦
    public TreeNode(Object[] x) {
        if (x.length == 0 || "null".equals(x[0])) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList();
        TreeNode tree = new TreeNode(x[0]);
        queue.add(tree);
        int i = 1;
        while (!queue.isEmpty() && i < x.length) {
            TreeNode temp = queue.peek();
            if(temp!=null) {
                if(x[i]==null){
                    temp.left = null;
                }else {
                    temp.left = new TreeNode(x[i]);
                }
                queue.add(temp.left);
                i++;
                if(i<x.length) {
                    if(x[i]==null){
                        temp.right=null;
                    }else {
                        temp.right = new TreeNode(x[i]);
                    }
                    queue.add(temp.right);
                    i++;
                }
            }
            queue.remove();
        }
        this.val = tree.val;
        this.right = tree.right;
        this.left = tree.left;
    }
}
