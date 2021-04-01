package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
        TreeNode rootItem = new TreeNode(33);
    }
// 12 22 25 1225
}

