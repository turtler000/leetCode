package org.sword.offereighteen;

import org.common.ListNode;

/**
 * create by hanhuanyu ON 2020/12/5
 */
public class OfferEighteen {
    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        } else {
            ListNode temp = head;
            while (temp.next.val != val) {
                temp = temp.next;
            }
            if(temp.next.next!=null){
             temp.next = temp.next.next;
            }else{
                temp.next=null;
            }
        }
        return head;
    }
}
