package org.turtler000.basic.sort;

/**
 * create by dell ON 2021/5/13
 */
public class QuickSort_1 {
    public static void quickSort(int[] nums,int left,int right){
        if (left >= right) {
            return;
        }
        int leftKey = left;
        int rightKey = right;
        int basic = nums[left];
        while(left<right){

            while(nums[right]>basic&&left<right){
                right--;
            }

            while(nums[left]<=basic&&left<right){
               left++;
            }
            //交换
            if(left!=right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        //汇合了，交换basic
        int temp = basic;
        nums[leftKey] = nums[left];
        nums[left] = temp;
        quickSort(nums,leftKey,left-1);
        quickSort(nums,right+1,rightKey);
    }


}
