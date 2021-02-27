package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_39.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int[] a = {1,1,2,2};
        int aa = Solution.majorityElement(a);
        System.out.println(aa);
    }

}

