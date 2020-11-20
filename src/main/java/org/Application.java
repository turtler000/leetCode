package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offereleven.MinArray;
import org.sword.offerten.OfferTenA;
import org.sword.offerten.OfferTenB;
import org.sword.offertwelve.Exist;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
      char[][]  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
      String  word = "ABCCED";
      char[][] board1 ={{'C','A','A'},{'A','A','A'},{'B','C','D'}};
      String word1= "AAB";
System.out.println(Exist.exist_1(board1,word1));

    }
}
