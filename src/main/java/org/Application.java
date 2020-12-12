package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_26.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
TreeNode A = new TreeNode(1);
A.left = new TreeNode(2);
A.right = new TreeNode(3);
A.left.right = new TreeNode(4);
//A.right.left = new TreeNode(1);
//A.right.right = new TreeNode(0);
TreeNode B = new TreeNode(3);
//B.left = new TreeNode(1);
boolean x   = Solution.isSubStructure_0(A,null);
System.out.println(x);
    }
}

