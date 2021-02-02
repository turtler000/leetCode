package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_37.Solution;


import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
node.left = new TreeNode(2);
node.right = new TreeNode(5);
node.left.left = new TreeNode(1);
node.left.right = new TreeNode(3);
String ret = Solution.serialize(node);
System.out.println(ret);
    }

}

