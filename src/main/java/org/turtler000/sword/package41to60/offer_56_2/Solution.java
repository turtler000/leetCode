package org.turtler000.sword.package41to60.offer_56_2;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

/*
剑指 Offer 56 - II. 数组中数字出现的次数 II
在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。



示例 1：

输入：nums = [3,4,3,3]
输出：4
示例 2：

输入：nums = [9,1,7,9,7,9,7]
输出：1
 */
public class Solution {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                if(map.get(num)==2){
                    map.remove(num);
                }else{
                    map.put(num,map.get(num)+1);
                }
            }else{
                map.put(num,1);
            }
        }
        return (int)map.keySet().toArray()[0];
    }
}
