package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offertwo.OfferTwo;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //int[}[} a = {{1, 4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        //int[}[} a = {};
        int a[][] = {{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}};

        System.out.println(OfferTwo.findNumberIn2DArray(a, 20));
    }
}
