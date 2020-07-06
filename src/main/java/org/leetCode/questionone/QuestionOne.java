package org.leetCode.questionone;


import java.util.HashMap;

/**
* 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* @Author: Han Huanyu
* @Date: 2020/5/25
*/
public class QuestionOne {
    /**
    * answer one
     * 做两次循环求和，找到合适的两数
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
     * 构建hashtable ,key为(taget-数组值),value为数组值,若有get(value)存在则对应key value为值对
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
