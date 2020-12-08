package org;

import org.common.ListNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_22.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
ListNode l = new ListNode(5);
l.next=new ListNode(4);
l.next.next=new ListNode(3);
l.next.next.next=new ListNode(2);
l.next.next.next.next = new ListNode(1);
ListNode s = Solution.getKthFromEnd(l,5);
System.out.println(s.val);
    }
}
