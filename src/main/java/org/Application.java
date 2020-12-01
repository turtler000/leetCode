package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerthirteen.OfferThirteen;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int a = 739;
        System.out.println(OfferThirteen.movingCount(3,1,0));

    }
}
