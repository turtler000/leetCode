package org;

import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_28.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.right = new TreeNode(2);
        n.left = new TreeNode(2);
        n.left.left = new TreeNode(3);
        n.left.right = new TreeNode(4);
        n.right.left = new TreeNode(4);
        n.right.right = new TreeNode(3);
        boolean a = Solution.isSymmetric(n);
        System.out.println(a);
    }
}

