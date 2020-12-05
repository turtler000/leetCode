package org;

import org.common.ListNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.offereighteen.OfferEighteen;
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

        ListNode listNode = new ListNode(4);
        listNode.setNext(new ListNode(5));
        listNode.getNext().setNext(new ListNode(1));
        listNode.getNext().getNext().setNext(new ListNode(9));
        ListNode ret = OfferEighteen.deleteNode(listNode,9);
        System.out.println(ret.getVal());
    }
}
