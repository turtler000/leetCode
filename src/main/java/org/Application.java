package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.leetcode.questionfive.Questionfive.Manacher;
import static org.sword.offerone.OfferOne.findRepeatNumber;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] a={3,5,3,2,3,6,9};
System.out.println(findRepeatNumber(a));
    }
}
