package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_32.Solution;



/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
TreeNode a = new TreeNode(1);
a.right = new TreeNode(2);
a.right.left = new TreeNode(9);
        a.right.right = new TreeNode(4);
        int[] ret = Solution.levelOrder(a);
        System.out.println(ret);
    }

}

