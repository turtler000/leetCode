package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turtler000.sword.package41to60.offer_59.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        int[] a = {10, 3, 4, 2, 3, 5, 9};

        int[] s = Solution.maxSlidingWindow_1(a, 3);
        System.out.println(s);
    }
// 12 22 25 1225
}

