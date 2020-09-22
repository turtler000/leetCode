package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offerfour.ListNode;
import org.sword.offerfour.OfferFour;
import org.sword.offerthree.OfferThree;
import org.sword.offertwo.OfferTwo;

/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode_2 = new ListNode(5);
        ListNode listNode_3 = new ListNode(1);
        listNode.setNext(listNode_2);
        listNode_2.setNext(listNode_3);
        int[] nums = OfferFour.reversePrint(listNode);
        for(int item:nums) {
            System.out.println(item);
        }
    }
}
