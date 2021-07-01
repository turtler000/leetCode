package org.turtler000.interview.huawei;

import java.util.Scanner;

/**
 * t, p里子符串位置
 * create by dell ON 2021/5/23
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        String p = in.next();
        char[] chart = t.toCharArray();
        char[] charp = p.toCharArray();
        for (int i = 0; i < chart.length; i++) {
            if (chart[i] == charp[0]) {
                for (int j = 0; j < charp.length; j++) {
                    if (i + j >= chart.length || chart[i + j] != charp[j]) {
                        j = charp.length;
                    }
                    if(j==charp.length-1&&chart[i + j] == charp[j]){
                        System.out.println(i+1);
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }
}
