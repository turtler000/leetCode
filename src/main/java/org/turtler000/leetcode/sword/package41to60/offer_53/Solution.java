package org.turtler000.leetcode.sword.package41to60.offer_53;

/**
 * 统计一个数字在排序数组中出现的次数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: hanhuanyu
 * @Date: 2021/3/23 14:21
 */
public class Solution {
    public int search(int[] nums, int target) {
        int ret = 0;
        for (int item : nums) {
            if(item>target){
                return ret;
            }else if(item==target){
                ret++;
            }
        }
        return ret;
    }

}
