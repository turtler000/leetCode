package org.sword.package21to40.offer_37;

import org.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
        list.add(root.val);
        list.addAll(levelOrder(root.left));
        list.addAll(levelOrder(root.left));
        StringBuilder ret = new StringBuilder();
        ret.append("[");
        for (Object item : list) {
            ret.append(item.toString());
            ret.append(",");
        }
        ret.delete(ret.length() - 1, ret.length());
        ret.append("]");
        return ret.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String num = data.substring(1,data.length()-1);
        String[] dataArray = num.split(",");
return null;
    }

    public static List levelOrder(TreeNode root) {
        List list = new ArrayList();
        if (root == null) {
            list.add("null");
        } else {
            list.add(root.val);
            list.addAll(levelOrder(root.left));
            list.addAll(levelOrder(root.right));
        }
        return list;
    }
}
