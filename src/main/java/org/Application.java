package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offereight.CQueue;
import org.sword.offerseven.OfferServen;
import org.sword.offerseven.TreeNode;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        CQueue  cQueue = new CQueue();
        int a =cQueue.deleteHead();
        cQueue.appendTail(3);
        cQueue.appendTail(4);
        int b =cQueue.deleteHead();
        int c =cQueue.deleteHead();
System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
