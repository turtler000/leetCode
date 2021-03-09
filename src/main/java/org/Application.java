package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_50.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        String s = "abcabcbb";
        char chars = Solution.firstUniqChar(s);
        System.out.println(chars);
    }
// 12 22 25 1225
}

