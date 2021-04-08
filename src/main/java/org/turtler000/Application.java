package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turtler000.sword.package41to60.offer_56_1.Solution;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

int[] a = {1,2,2,1,5,9};
int[] b = Solution.singleNumbers_1(a);
System.out.println(b[0]);
int x = 2;
String sx = Integer.toBinaryString(x);
String s = Integer.toBinaryString(-x);
String i = "1111111111111111111111111111110";
int sxi = Integer.parseInt(sx,2);
        int zs = Integer.parseInt("0",2);
        int is = Integer.parseInt("11111111111111111111111111111110",2);
//        int isi = Integer.parseInt(i);
System.out.println(s);
    }
// 12 22 25 1225
}

