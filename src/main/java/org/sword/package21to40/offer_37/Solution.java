package org.sword.package21to40.offer_37;

import org.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: hanhuanyu
 * @Date: 2021/2/2 19:14
 * <p>
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 * <p>
 * 示例: 
 * <p>
 * 你可以将以下二叉树：
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * <p>
 * 序列化为 "[1,2,3,null,null,4,5]"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        List list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            queue.remove();
            if (node != null) {
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else {
                list.add(null);
            }
        }
        while (list.get(list.size() - 1) == null) {
            list.remove(list.size() - 1);
        }
        StringBuilder ret = new StringBuilder();
        ret.append("[");
        for (Object item : list) {
            if (item != null) {
                ret.append(item.toString());
                ret.append(",");
            } else {
                ret.append("null");
                ret.append(",");
            }
        }
        ret.delete(ret.length() - 1, ret.length());
        ret.append("]");
        return ret.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if ("[]".equals(data) || null == data) {
            return null;
        }
        String num = data.substring(1, data.length() - 1);
        String[] dataArray = num.split(",");
        List<TreeNode> nodeList = new ArrayList();
        TreeNode root = new TreeNode(Integer.valueOf(dataArray[0]));
        Queue queue = new LinkedList<>();
        queue.add(root);
        int flag = 1;
        while (!queue.isEmpty()) {
            TreeNode temp = (TreeNode) queue.remove();
            if(temp==null){
                continue;
            }
            if(flag<dataArray.length) {
                if("null".equals(dataArray[flag])){
                    queue.add(null);
                    temp.left = null;
                    flag++;
                }else {
                    TreeNode left = new TreeNode(Integer.valueOf(dataArray[flag]));
                    queue.add(left);
                    temp.left = left;
                    flag++;
                }
            }
            if(flag<dataArray.length) {
                if("null".equals(dataArray[flag])){
                    queue.add(null);
                    temp.right = null;
                    flag++;
                }else {
                    TreeNode right = new TreeNode(Integer.valueOf(dataArray[flag]));
                    queue.add(right);
                    temp.right = right;
                    flag++;
                }
            }
        }
        return root;
    }

}
