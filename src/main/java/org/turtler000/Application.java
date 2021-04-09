package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turtler000.sword.package41to60.offer_56_2.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

int[] a = {1,1,1,2};
int b = Solution.singleNumber(a);
System.out.println(b);
    }
// 12 22 25 1225
}

