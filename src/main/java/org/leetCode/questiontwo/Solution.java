package org.leetCode.questiontwo;

import org.leetCode.questiontwo.ListNode;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2,int n) {
        if(l1==null||l2==null){
            if(n!=0) {
                ListNode list = new ListNode(n);
                return list;
            }
            return null;
        }else {
            int ans = l1.val + l2.val + n;
            ListNode list = new ListNode(n);
            if (ans >= 10) {
                list = new ListNode(ans - 10);
                n = 1;
            } else {
                list = new ListNode(ans);
                n = 0;
            }
            if (l2.next != null && l2.next != null) {
                list.next = addTwoNumbers(l1.next, l2.next, n);
            }else if(n!=0){
                list.next=addTwoNumbers(null,null,n);
            }
            return list;
        }
    }
    public static void print(ListNode listNode){
        System.out.println(listNode.getVal());
        if(listNode.getNext()!=null){
            print(listNode.getNext());
        }
    }
}
