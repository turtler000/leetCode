package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerfourteen.OfferFourteen;
import org.sword.offerfourteen.OfferFourteenExt;
import org.sword.offerthirteen.OfferThirteen;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println(OfferFourteen.cuttingRope(100));
        System.out.println(OfferFourteenExt.cuttingRope(100));
        System.out.println(7412080755407364L%1000000007);
    }
}
