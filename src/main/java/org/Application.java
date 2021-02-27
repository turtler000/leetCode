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
        node.right.left = new TreeNode(1);
        node.right.right = new TreeNode(3);

        TreeNode node1 = Solution.deserialize("[1,3,null,null,4]");
        String ret = Solution.serialize(node1);
        System.out.println(ret);
    }

}

