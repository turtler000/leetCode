package org;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sword.package21to40.offer_40.Solution;
import org.sword.package41to60.offer_41.MedianFinder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(12);
        medianFinder.addNum(10);
        medianFinder.addNum(13);
        medianFinder.addNum(11);
        medianFinder.addNum(5);
        medianFinder.addNum(15);
        medianFinder.addNum(1);
        medianFinder.addNum(11);
        medianFinder.addNum(6);
        medianFinder.addNum(17);
        medianFinder.addNum(14);
        medianFinder.addNum(8);
        medianFinder.addNum(17);
        medianFinder.addNum(6);
        medianFinder.addNum(4);
        medianFinder.addNum(16);
        medianFinder.addNum(8);
        medianFinder.addNum(10);
        double a = medianFinder.findMedian();
        System.out.println(a);
    }

}

