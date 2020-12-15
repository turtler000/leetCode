package org;

import org.common.ListNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.weekends.week_219.Solution;
import org.weekends.week_219.Solution_3;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] n = {7,90,5,1,100,10,10,2};
        System.out.println(Solution_3.stoneGameVII(n));
    }
}
