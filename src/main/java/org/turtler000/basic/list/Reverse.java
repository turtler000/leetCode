package org.turtler000.basic.list;

import org.turtler000.common.ListNode;

/**
 * create by hanhuanyu ON 2021/7/1
 *
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode front = null, now = head, temp = null;
        while (now != null) {
            temp = now.next;
            now.next = front;
            front = now;
            now = temp;
        }
        return front;
    }
}
