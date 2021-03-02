package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_42.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] a = {-2,1,-3,4,-1,2,1,-5,4};
int aa = Solution.maxSubArray(a);
System.out.println(aa);
    }

}

