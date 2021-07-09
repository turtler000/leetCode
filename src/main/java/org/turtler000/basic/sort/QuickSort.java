package org.turtler000.basic.sort;

/**
 * @author hanhuanyu
 * @date 2021/6/30 10:02
 * @description 快排
 */
public class QuickSort {
     public static void quickSort(int[] nums,int left ,int right){
        if(left>=right){
            return;
        }
        int basic = nums[left];
        int l = left;
        int r = right;
        while(left<right){
            while(nums[right]>basic&&right!=left){
                right --;
            }
            while(nums[left]<basic&&left!=right){
                left ++;
            }
            if(left!=right){
                swap(nums[left],nums[right]);
            }
        }
        swap(nums[left],basic);
        quickSort(nums,l,left-1);
        quickSort(nums,right+1,r);
    }
    public static void swap(  int a,int b){
         int temp = a;
         a = b;
         b = temp;
    }
}
