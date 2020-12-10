package org;

import org.common.ListNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_25.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(3);
        l.next.next = new ListNode(4);
        l.next.next.next = new ListNode(7);
        l.next.next.next.next = new ListNode(10);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);
        l2.next.next.next = new ListNode(8);
        ListNode s = Solution.mergeTwoLists(l,l2);
        System.out.println(s.val);
    }
}
