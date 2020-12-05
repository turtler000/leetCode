package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offernignteen.OfferNignteen;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Arrays.copyOfRange(null,1,1);
//        String s = "aasdfasdfasdfasdf";
//        String p = "aasdf.*asdf.*asdf.*asdf.*";
        String s = "aasdf";
        String p = "aasdf.*";
        boolean a = OfferNignteen.isMatch(s, p);
        System.out.println(a);
    }
}
