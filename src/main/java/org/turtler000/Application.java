package org.turtler000;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.turtler000.common.ListNode;
import org.turtler000.common.TreeNode;
import org.turtler000.leetcode.common.leetcode_78.Solution;

import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] nums = {1,2,3};
        List s = Solution.subsets(nums);
    }
}
