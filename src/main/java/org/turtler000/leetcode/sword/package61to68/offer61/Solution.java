package org.turtler000.leetcode.sword.package61to68.offer61;

import java.util.Arrays;

/**
 * @author hanhuanyu
 * @date 2021/4/27 14:35
 * @description 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，
 * 而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: True
 *  
 * <p>
 * 示例 2:
 * <p>
 * 输入: [0,0,1,2,5]
 * 输出: True
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int king = 0;
        if (nums[0] == 0) {
            king = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                king++;
                continue;
            }
            if (nums[i] - nums[i - 1] == 1 || nums[i - 1] == 0) {
                continue;
            }
            if (nums[i] - nums[i - 1] > king + 1 || nums[i] - nums[i - 1] <= 0) {
                return false;
            }
            king = king - nums[i] + nums[i - 1] + 1;
        }
        return true;
    }
}
