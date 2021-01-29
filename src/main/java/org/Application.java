package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_36.Solution;
import org.sword.package21to40.offer_36.Node;


import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
Node node = new Node(4);
node.left = new Node(2);
node.right = new Node(5);
node.left.left = new Node(1);
node.left.right = new Node(3);
Node ret = Solution.treeToDoublyList(node);
    }

}

