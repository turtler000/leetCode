package org.turtler000.leetcode.sword.package1to20.offer_1;

import java.util.HashMap;
import java.util.Map;

/**
 * create by hanhuanyu ON 2020/9/10
 *
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferOne {
    /**
     * 使用哈希表
     * @param
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        Map  map = new HashMap();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],i);
            }
        }
        return 0;
    }
}
