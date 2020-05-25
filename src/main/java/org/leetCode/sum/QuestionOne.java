package org.leetCode.sum;


import java.util.HashMap;

/**
* 两数之和
* @Author: Han Huanyu
* @Date: 2020/5/25
*/
public class QuestionOne {
    /**
    * answer one
    * @Author: Han Huanyu
    * @Date: 2020/5/25
    */
    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int ret[]=new int[2];
                    ret[0]=i;
                    ret[1]=j;
                    return  ret;
                }
            }
        }
        return null;
    }
    /**
    * answer two using hashtable
    * @Author: Han Huanyu
    * @Date: 2020/5/25
    */
    public static int[] twoSumPlus(int[] nums, int target){
        HashMap<Integer,Integer> sum = new HashMap<Integer,Integer>();
        int ret[]=new int[2];
        for(int index=0;index<nums.length;index++){
            if(sum.containsKey(nums[index])){
                ret[0]=index;
                ret[1]= sum.get(nums[index]);
            }
            sum.put(target-nums[index],index);
        }
        return  ret;
    }

}
