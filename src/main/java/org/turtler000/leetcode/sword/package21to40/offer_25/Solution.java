package org.turtler000.leetcode.sword.package21to40.offer_25;

import org.turtler000.common.ListNode;

/**
 * create by hanhuanyu ON 2020/12/10
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * <p>
 * 示例1：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1),temp = ret;
        while(l1!=null&&l2!=null) {
            if (l1.val >= l2.val) {
                ret.next = l2;
                l2 = l2.next;
                ret = ret.next;
            } else {
                ret.next = l1;
                l1 = l1.next;
                ret = ret.next;
            }
        }
            if(l1==null){
                ret.next = l2;
            }else{
                ret.next = l1;
            }
        return  temp.next;
    }

    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            pre.next = l1;
        }
        if (l2 != null) {
            pre.next = l2;
        }

        return dummyHead.next;
    }
}
