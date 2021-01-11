package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_31.Solution;
import org.weekends.week_223.Solution_2;
import org.weekends.week_223.Solution_3;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] pushed = {1,0};
int[] poped = {1,0};
boolean boo = Solution.validateStackSequences(pushed,poped);
System.out.println(11);
    }

}

