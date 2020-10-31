package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerten.OfferTenA;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

System.out.println(OfferTenA.fib(99));
  //      System.out.println(OfferTenA.fib_1(50));

    }
}
