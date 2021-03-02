package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_46.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int a = 12258;
int b = 1225;
int s = Solution.translateNum(a);
System.out.println(s);
    }
// 12 22 25 1225
}

