package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerseven.OfferServen;
import org.sword.offerseven.TreeNode;

import java.util.Arrays;
import java.util.Random;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5};
//        int b[] = Arrays.copyOfRange(a, 2, 8);
        int preorder[] = {3,9,20,15,7};
        int inorder[] = {9,3,15,20,7};
        TreeNode treeNode = OfferServen.buildTree(preorder,inorder);
        System.out.println(treeNode.val);

    }
}
