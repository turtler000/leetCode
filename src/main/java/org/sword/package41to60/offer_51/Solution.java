package org.sword.package41to60.offer_51;

import java.util.ArrayList;
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
 * @Author: hanhuanyu
 * @Date: 2021/3/9 19:09
 */
public class Solution {
    public int reversePairs(int[] nums) {
        int swap = 0;
        List<Integer> list = new ArrayList();
        for (int item : nums) {
            list.add(item);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                //别tm冒泡了,铁超时
            }
        }
        return 0;
    }

    public int reversePairs_1(int[] nums) {

        return 0;
    }

    public int[] mergeSort(int[] left, int[] right) {
        int[] ret = new int[left.length + right.length];
        return ret;
    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
