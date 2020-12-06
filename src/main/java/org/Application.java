package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
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
int n = Knum.maxOperations(a,5);
System.out.println(n);
    }
}
