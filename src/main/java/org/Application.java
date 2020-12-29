package org;

import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_26.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(3);
        A.right = new TreeNode(4);
        A.left = new TreeNode(5);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(2);
//        n.right.left = new TreeNode(4);
//        n.right.right = new TreeNode(3);
        TreeNode B = new TreeNode(5);
        B.left = new TreeNode(1);
        boolean a = Solution.isSubStructure(A,B);
        System.out.println(a);
    }
}

