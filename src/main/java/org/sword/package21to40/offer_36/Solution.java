package org.sword.package21to40.offer_36;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * create by hanhuanyu ON 2021/1/22
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。
 * 要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * <p>
 * 为了让您更好地理解问题，以下面的二叉搜索树为例：
 * <p>
 * <p>
 * 我们希望将这个二叉搜索树转化为双向循环链表。
 * 链表中的每个节点都有一个前驱和后继指针。
 * 对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。
 * <p>
 * 下图展示了上面的二叉搜索树转化成的链表。“head” 表示指向链表中有最小元素的节点。
 * <p>
 * <p>
 * 特别地，我们希望可以就地完成转换操作。
 * 当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。
 * 还需要返回链表中的第一个节点的指针。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public Node treeToDoublyList(Node root) {
        List<Node> list = new ArrayList();
        Stack<Node> stack = new Stack();
        Node node = root;
        while(!stack.empty()&&node!=null){
            if(stack.empty()){
                stack.push(node);
            }else{
                list.add(stack.pop());
            }
        }
        return null;
    }
}
