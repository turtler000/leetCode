package org.turtler000.leetcode.common.leetcode_617;

import org.turtler000.common.TreeNode;

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，
 * 那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 示例 1:
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author hanhuanyu
 * @date 2021/8/10 9:45
 * @description
 */
public class Solution {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode ret = new TreeNode(0);
        if (root1 != null && root2 != null) {
            ret.val = root1.val + root2.val;
            ret.left = mergeTrees(root1.left, root2.left);
            ret.right = mergeTrees(root1.right, root2.right);
        } else if (root1 == null && root2 != null) {
            ret.val = root2.val;
            ret.left = root2.left;
            ret.right = root2.right;
        } else if (root1 != null && root2 == null) {
            ret.val = root1.val;
            ret.left = root1.left;
            ret.right = root1.right;
        } else {
            return null;
        }
        return ret;
    }
}
