package org;

import org.common.ListNode;
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
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(8);
        tree.left.left = new TreeNode(11);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.right = new TreeNode(2);
        tree.right.left = new TreeNode(13);
        tree.right.right = new TreeNode(4);
        tree.right.right.left = new TreeNode(5);
        tree.right.right.right = new TreeNode(1);
        TreeNode treeb = new TreeNode(-2);
        treeb.right = new TreeNode(-3);
       List ret = Solution.pathSum_1(treeb,-5);
       System.out.println(11);
    }

}

