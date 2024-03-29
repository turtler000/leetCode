package org.turtler000.leetcode.sword.package1to20.offer_7;

import org.turtler000.common.TreeNode;

import java.util.Arrays;

/**
 * create by hanhuanyu ON 2020/9/22
 *
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
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

    /**
     * 写了一半有事情，这次一定一次写完
     * @param preorder
     * @param inorder
     * @return
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0){
           return null;
        }
        int root = preorder[0];
        TreeNode nodeRoot = new TreeNode(root);
        if(preorder.length==1){
            return nodeRoot;
        }
        int inorderRoot = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root) {
                inorderRoot = i;
                i = inorder.length;
            }
        }
        //拆分,左闭右开
        int[] preorderLeft = Arrays.copyOfRange(preorder,1,inorderRoot+1);
        int[] preorderRight = Arrays.copyOfRange(preorder,inorderRoot+1,preorder.length);
        int[] inorderLeft = Arrays.copyOfRange(inorder,0,inorderRoot);
        int[] inorderRight = Arrays.copyOfRange(inorder,inorderRoot+1,preorder.length);
        nodeRoot.left = buildTree(preorderLeft,inorderLeft);
        nodeRoot.right = buildTree(preorderRight,inorderRight);
        return nodeRoot;
    }
    public static TreeNode buildTree_1(int[] preorder, int[] inorder) {
        if(inorder.length==0||preorder.length==0){
            return null;
        }

        int headVal = preorder[0];
        TreeNode head = new TreeNode(headVal);
        int i = 0;
        while(inorder[i]!=headVal&&i<inorder.length){
            i++;
        }
        head.left = buildTree_1(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i+1));
        head.right = buildTree_1(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        return head;
    }

    public TreeNode buildTree_2(int[] preorder, int[] inorder) {
        if(preorder.length == 0||inorder.length==0){
            return null;
        }
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        int mid = 0;
        for(int item: inorder){
            if(item == rootVal){
                break;
            }
            mid++;
        }
        root.left =  buildTree_2(Arrays.copyOfRange(preorder,1,mid+1),Arrays.copyOfRange(inorder,0,mid));
        root.right =  buildTree_2(Arrays.copyOfRange(preorder,mid+1,preorder.length),Arrays.copyOfRange(inorder,mid+1,inorder.length));
        return root;
    }
}
