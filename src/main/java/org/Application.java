package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offer_21.Solution;
import org.sword.offernignteen.OfferNignteen;
import org.weekends.week_218.Binary;
import org.weekends.week_218.Goal;
import org.weekends.week_218.Knum;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
int[] a= {3,1,3,4,3,3,4,2,3,7,9};
int[] b= {1,11,4};
int[] c ={8,10,3,20,12,4,10,8,4,0,5,17,7,20,3};
int[] n = Solution.exchange_1(c);
System.out.println(n);
    }
}
