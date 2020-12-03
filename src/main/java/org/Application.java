package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerfourteen.OfferFourteen;
import org.sword.offerthirteen.OfferThirteen;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println(OfferFourteen.cuttingRope(8));

    }
}
