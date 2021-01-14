package org;

import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_34.Solution;

import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
TreeNode a = new TreeNode(1);
a.right = new TreeNode(2);
a.left = new TreeNode(11);
a.right.left = new TreeNode(9);
        a.right.right = new TreeNode(4);
        a.right.left.left = new TreeNode(123);
        a.right.left.right = new TreeNode(32);
        List ret = Solution.levelOrder(a);
        System.out.println(ret);
    }

}

