package org.turtler000;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.turtler000.common.ListNode;
import org.turtler000.common.TreeNode;
import org.turtler000.leetcode.common.leetcode_23.Solution;
import org.turtler000.leetcode.sword.package1to20.offer_11.MinArray;
import org.turtler000.leetcode.sword.package1to20.offer_2.OfferTwo;
import org.turtler000.leetcode.sword.package1to20.offer_7.OfferServen;
import org.turtler000.leetcode.sword.package1to20.offer_8.CQueue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {1,4};
        int c[] = {2,3,3};
ListNode l1 = new ListNode(a);
        ListNode l2 = new ListNode(b);
        ListNode l3 = new ListNode(c);
        ListNode[] test = {l1,l2,l3};
ListNode s = Solution.mergeKLists(test);
    }
}
