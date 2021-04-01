package org.turtler000.sword.package21to40.offer_39;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 *
 *
 * 限制：
 *
 * 1 <= 数组长度 <= 50000
 *
 * @Author: hanhuanyu
 * @Date: 2021/2/27 11:57
 *
 */
public class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return 0;
    }
}
