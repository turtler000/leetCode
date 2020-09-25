package org.sword.offerseven;

/**
 * create by hanhuanyu ON 2020/9/22
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * <p>
 *  
 * <p>
 * 例如，给出
 * <p>
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 5000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferServen {
    /**
     * 先回忆一下
     * 前序：中左右
     * 中序：左中右
     * 后序：左右中
     *
     * @param
     * @return
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        if (preorder.length == 1) {
            return root;
        }
        int[] preordernext = new int[preorder.length - 1];
        for (int i = 1; i < preorder.length - 1; i++) {
            preordernext[i - 1] = preorder[i];
        }
        int p = 1;
        for (int i = 0; i < inorder.length - 1; i++) {
            if (inorder[i] == rootVal) {
                p = i;
                i = inorder.length;
            }
        }
return  null;
    }
}
