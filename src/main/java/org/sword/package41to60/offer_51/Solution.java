package org.sword.package41to60.offer_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,5,6,4]
 * 输出: 5
 *  
 * <p>
 * 限制：
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 归并排序
 * @Author: hanhuanyu
 * @Date: 2021/3/9 19:09
 */
public class Solution {
    static int  ans;
    public static int reversePairs(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        ans = 0;
       mergeSort(nums);
        return ans;
    }

    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        } else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                ans++;
                return swap(nums[0], nums[1]);
            }
            return nums;
        }
        int[] ret = new int[nums.length];
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, nums.length / 2));
        int[] right = mergeSort(Arrays.copyOfRange(nums, nums.length / 2, nums.length));
        int iL = 0;
        int iR = 0;
        int i = 0;
        while (i < ret.length) {
            if (iR == right.length||(iL<left.length&&left[iL] < right[iR])) {
                ret[i] = left[iL];
                iL++;
            } else {
                ret[i] = right[iR];
                if(iL<left.length){
                    ans  = ans + left.length-iL;
                }
                iR++;
            }
            i++;
        }
        return ret;
    }

    public static int[] swap(int a, int b) {
        int[] temp = new int[2];
        temp[0] = b;
        temp[1] = a;
        return temp;
    }
}
