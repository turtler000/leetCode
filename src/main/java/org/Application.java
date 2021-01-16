package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_35.Solution;
import org.sword.package21to40.offer_35.Node;


import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
Node node = new Node(1);
node.next = new Node(2);
node.next.next = new Node(3);
node.random = node.next.next;
node.next.random = node.next;
Node ret = Solution.copyRandomList_1(node);
System.out.println(111);
    }

}

