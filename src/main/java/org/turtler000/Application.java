package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turtler000.sort.QuickSort;
import org.turtler000.sword.package61to68.offer66.Solution;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        int[] s = {4, 1, 2,6,8 , 5};
        //QuickSort.quickSort(s, 3, 5);
        QuickSort.quickSort(s, 0, s.length-1);
System.out.println(s[0]);
    }
// 12 22 25 1225
}

