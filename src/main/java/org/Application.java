package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_47.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        int[][] b = {};
        int x = Solution.maxValue(a);
        System.out.println(x);
    }
// 12 22 25 1225
}

