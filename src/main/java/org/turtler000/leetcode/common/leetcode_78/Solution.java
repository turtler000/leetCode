package org.turtler000.leetcode.common.leetcode_78;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hanhuanyu
 * @date 2021/8/6 10:44
 * @description
 */
public class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List ret = new ArrayList();
        if(nums.length==1){
            List list2 = new ArrayList();
            list2.add(nums[0]);
            ret.add(new ArrayList());
            ret.add(list2);
        }else{
            List<List<Integer>> list2 = subsets(Arrays.copyOfRange(nums,0,nums.length-1));
            for(List item:list2){
                ret.add(new ArrayList(item));
                item.add(nums[nums.length-1]);
                ret.add(item);
            }
        }
        return ret;
    }
}
