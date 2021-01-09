package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_29.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int a[][] = {{2,5,8},{4,0,-1}};
        int b[][] = {{1},{2},{3}};
        int c[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int s[] = Solution.spiralOrder(c);
        System.out.println(s);
    }

}

