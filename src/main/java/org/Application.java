package org;

import org.common.ListNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_52.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

ListNode headA = new ListNode(3);
ListNode headB = new ListNode(2);
ListNode a = new ListNode(5);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(9);
        headA.next = a;
        a.next=b;
        b.next=c;
        headB.next = b;
ListNode ret = Solution.getIntersectionNode(headA,headB);
        System.out.println(ret.val);
    }
// 12 22 25 1225
}

