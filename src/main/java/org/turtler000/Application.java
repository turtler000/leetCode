package org.turtler000;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.turtler000.common.ListNode;
import org.turtler000.common.TreeNode;
import org.turtler000.leetcode.common.leetcode_617.Solution;

import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
Object[] a = {1,3,2,5};
Object[] b = {2,1,3,null,4,null,7};
TreeNode treeA = new TreeNode(a);
TreeNode treeB = new TreeNode(b);
Solution.mergeTrees(treeA,treeB);
    }
}
