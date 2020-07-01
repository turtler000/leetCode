package org.application;

import org.leetCode.questiontwo.ListNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.leetCode.questiontwo.Solution.addTwoNumbers;
import static org.leetCode.questiontwo.Solution.print;

/**
 * spring-boot startup
 *
 */
@SpringBootApplication
public class Application
{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ListNode l1=new ListNode(1);
        l1.setNext(new ListNode(8));
//        l1.getNext().setNext(new ListNode(3));
        ListNode l2=new ListNode(0);
//        l2.setNext(new ListNode(6));
//        l2.getNext().setNext(new ListNode(4));
        ListNode l3=addTwoNumbers(l1,l2);
       print(l3);
    }

}