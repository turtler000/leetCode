package org;

import org.common.ListNode;
import org.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_39.Solution;


import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
String s = "aabv";
String[] ret = Solution.permutation(s);
System.out.println(ret);
    }

}

