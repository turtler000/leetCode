package org.sword.offer_21;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int[] exchange(int[] nums) {
       List<Integer> a = new ArrayList();
       List<Integer> b = new ArrayList();
       for(int i =0;i<nums.length;i++){
           if(nums[i]%2==1){
               a.add(nums[i]);
           }else{
               b.add(nums[i]);
           }
       }
       a.addAll(b);
       int[] ret = a.stream().mapToInt(Integer::valueOf).toArray();
       return  ret;
    }

    public static int[] exchange_1(int[] nums) {
        int j = nums.length-1;
        int temp;
        for(int i = 0;i<j;i++){
           if(nums[i]%2==0){
               for(int b=j;b>i;b--){
                   if(nums[b]%2==1) {
                       temp = nums[i];
                       nums[i] = nums[b];
                       nums[b] = temp;
                       j=b-1;
                       b=-1;
                   }
               }
           }
        }
        return nums;
    }
    public static void change(int a,int b){
        int c=a;
        a=b;
        b=c;
    }
}
