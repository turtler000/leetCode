package org.turtler000;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.turtler000.common.TreeNode;
import org.turtler000.leetcode.hot.leetcode_11.Solution;
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
int[] a = {1,8,6,2,5,4,8,3,7};
int b = Solution.maxArea(a);
System.out.println(b);
    }
}
