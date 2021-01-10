package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.weekends.week_223.Solution;
import org.weekends.week_223.Solution_2;
import org.weekends.week_223.Solution_3;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] source = { 1,2,3,4};
int[] target = {2,1,4,5};
int[][] allowedSwaps = {{0,1},{2,3}};
int ret = Solution_3.minimumHammingDistance(source,target,allowedSwaps);
System.out.println(11);
    }

}

