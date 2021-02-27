package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_40.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int[] a = {0,0,1,2,4,2,2,3,1,4};
        int[] aa = Solution.getLeastNumbers(a,8);
        System.out.println(aa);
    }

}

