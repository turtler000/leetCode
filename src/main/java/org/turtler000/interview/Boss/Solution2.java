package org.turtler000.interview.Boss;

import java.math.BigDecimal;

/**
 * create by dell ON 2021/5/11
 * 1-100 素数阶乘之和
 */
public class Solution2 {
    public static void main(String[] args) {
        //temp存储上一个质数的阶乘，避免重复运算
        BigDecimal temp = new BigDecimal(1);
        BigDecimal answer = new BigDecimal(0);
        int prime = 1;
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                BigDecimal s = new BigDecimal(1);
                for (int j = prime + 1; j <= i; j++) {
                    BigDecimal j_value = new BigDecimal(j);
                    s = s.multiply(j_value);
                }
                s = s.multiply(temp);
                temp = s;
                prime = i;
                answer = answer.add(s);
            }
        }
        System.out.println(answer);
    }
    //是否为质数
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
