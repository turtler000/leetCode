package org.sword.package41to60.offer_52;

import org.common.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 * <p>
 * 如下面的两个链表：
 * <p>
 * <p>
 * <p>
 * 在节点 c1 开始相交。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *  
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * 输出：Reference of the node with value = 2
 * 输入解释：相交节点的值为 2 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。
 *  
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * 输入：intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * 输出：null
 * 输入解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。由于这两个链表不相交，所以 intersectVal 必须为 0，而 skipA 和 skipB 可以是任意值。
 * 解释：这两个链表不相交，因此返回 null。
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/15 13:50
 */
public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 1;
        ListNode tempA = headA;
        while (tempA.next != null) {
            tempA = tempA.next;
            aLength++;
        }
        int bLength = 1;
        ListNode tempB = headB;
        while (tempB.next != null) {
            tempB = tempB.next;
            bLength++;
        }

        if (aLength < bLength) {
            tempA = headA;
            headA = headB;
            headB = tempA;
            int t = 0;
            t = aLength;
            aLength = bLength;
        }
        //现在a比较长
        int t = 0;
        while (t < aLength - bLength) {
            headA = headA.next;
            t++;
        }
        ListNode ret =null;
        while(headA.next!=null){
            if(headA==headB){
                if(ret==null){
                    ret = headA;
                }
            }else{
                ret = null;
            }
            headA=headA.next;
            headB = headB.next;
        }
        return ret;
    }
}
