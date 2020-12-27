package org;

import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.weekends.week_221.Solution_1;
import org.weekends.week_221.Solution_2;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] apples = {1,2,3,5,2};
int[] days = {3,2,1,4,2};
int ans = Solution_2.eatenApples(apples,days);
System.out.println(ans);
    }
}

