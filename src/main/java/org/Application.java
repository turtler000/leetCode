package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerfifteen.OfferFifteen;
import org.sword.offerfourteen.OfferFourteen;
import org.sword.offerfourteen.OfferFourteenExt;
import org.sword.offerseventeen.OfferSeventeen;
import org.sword.offersixteen.OfferSixteen;
import org.sword.offerthirteen.OfferThirteen;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

//      System.out.println(OfferSixteen.myPow(3,-4));
//      double a =0.012345679012345678;
//      System.out.println(1/a);
        int[] ret = OfferSeventeen.printNumbers(1);
        System.out.println(ret.length);
    }
}
