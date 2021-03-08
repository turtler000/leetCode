package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package41to60.offer_48.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        String s = "abcabcbb";
        int x = Solution.lengthOfLongestSubstring(s);
        int y = Solution.answer(s);
        System.out.println(x);
    }
// 12 22 25 1225
}

