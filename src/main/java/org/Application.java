package org;

import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_54.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode rootL = new TreeNode(1);
        TreeNode rootR = new TreeNode(4);
        TreeNode rootLR = new TreeNode(2);
        root.left = rootL;
        root.right = rootR;
        rootL.right = rootLR;
        int ret = Solution.kthLargest(root,1);
    }
// 12 22 25 1225
}

