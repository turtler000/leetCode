package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerfifteen.OfferFifteen;
import org.sword.offerfourteen.OfferFourteen;
import org.sword.offerfourteen.OfferFourteenExt;
import org.sword.offerthirteen.OfferThirteen;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
String a = "11111111111111111111111111111101";
System.out.println(Integer.valueOf(a,10));
      System.out.println(OfferFifteen.hammingWeight(8));
    }
}
