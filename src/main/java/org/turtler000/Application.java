package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turtler000.sword.package61to68.offer66.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        int[] a = {2,3,1,6,2};
       //boolean s = Solution.isStraight(a);
        int[] s = Solution.constructArr(a);
        System.out.println(s);
    }
// 12 22 25 1225
}

