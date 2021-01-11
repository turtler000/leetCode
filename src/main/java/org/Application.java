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
int[] source = {5,1,2,4,3};
int[] target = {1,5,4,2,3};

//[5,1,2,4,3]
//[1,5,4,2,3]
//[[0,4],[4,2],[1,3],[1,4]]
int[][] allowedSwaps = {{0,1},{2,3}};
int ret = Solution_3.minimumHammingDistance_1(source,target,allowedSwaps);
System.out.println(11);
    }

}

