package org.turtler000.interview.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 正整数num,移除n位数，最小
 * create by dell ON 2021/5/23
 */
public class Main_3 {
    public static void main_1(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();
        //获取list
        List a = new ArrayList();
        String s = String.valueOf(num);
        for(int i =0;i<s.length();i++){
             a.add(s.substring(i,i+1));
        }
        while(k>0){
            for(int j =0;j<a.size();j++){
                if(j==a.size()-1||Integer.valueOf((String)a.get(j))>Integer.valueOf((String)a.get(j+1))){
                    a.remove(j);
                    k--;
                    j = a.size();
                }
            }
        }
        for (Object i:a) {
            if(Integer.valueOf((String)i)!=0) {
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int k = in.nextInt();
        if(num.length()==k){
            System.out.println(0);
            System.exit(0);
        }
        StringBuilder s  =  new StringBuilder(num);
        for(int i = 0;i<k;i++){
            int idx = 0;
            for(int j = 1;j<s.length()&&s.charAt(j) >= s.charAt(j-1);j++){
                idx = j;
            }
            s.delete(idx,idx+1);
            while(s.length()>1&&s.charAt(0) == '0'){
                s.delete(0,1);
            }
        }
        System.out.println(s.toString());
    }
}
