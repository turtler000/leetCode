package org.turtler000.huawei;


import java.util.Scanner;

/**
 * 磁盘大小排序输出
 * create by dell ON 2021/5/23
 */
public class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i]=in.next();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length; j++) {
                    if(isLarge(strings[i],strings[j])){
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
            }
        }
        for(String s:strings){
            System.out.println(s);
        }
    }

    public static boolean isLarge(Object a, Object b) {
        if (getLarge((String)a) > getLarge((String)b)) {
            return true;
        }
        return false;
    }
    public static int getLarge(String a) {
        char[] chara = a.toCharArray();
        int asize = 0;
        int begin = 0;
        for (int i = 0; i < a.length(); i++) {
            if (chara[i] == 'M') {
                asize = Integer.valueOf(a.substring(begin, i)) + asize;
                begin = i + 1;
            }
            if (chara[i] == 'G') {
                asize = Integer.valueOf(a.substring(begin, i)) * 1024 + asize;
                begin = i + 1;
            }
            if (chara[i] == 'T') {
                asize = Integer.valueOf(a.substring(begin, i)) * 1024 * 1024 + asize;
                begin = i + 1;
            }
        }
        return asize;
    }
}
