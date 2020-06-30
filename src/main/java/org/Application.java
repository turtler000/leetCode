package org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.leetCode.questionthree.Solution.lengthOfLongestSubstring;

/**
 * spring-boot startup
 *
 */
@SpringBootApplication
public class Application
{
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        String a ="tab";
        System.out.println(lengthOfLongestSubstring(a));
    }
}
