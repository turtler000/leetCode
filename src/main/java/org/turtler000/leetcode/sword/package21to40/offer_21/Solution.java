package org.turtler000.leetcode.sword.package21to40.offer_21;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @param
 * @return
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *  
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 50000
 * 1 <= nums[i] <= 10000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static int[] exchange(int[] nums) {
       List<Integer> a = new ArrayList();
       List<Integer> b = new ArrayList();
       for(int i =0;i<nums.length;i++){
           if(nums[i]%2==1){
               a.add(nums[i]);
           }else{
               b.add(nums[i]);
           }
       }
       a.addAll(b);
       int[] ret = a.stream().mapToInt(Integer::valueOf).toArray();
       return  ret;
    }

    public static int[] exchange_1(int[] nums) {
        int j = nums.length-1;
        int temp;
        for(int i = 0;i<j;i++){
           if(nums[i]%2==0){
               for(int b=j;b>i;b--){
                   if(nums[b]%2==1) {
                       temp = nums[i];
                       nums[i] = nums[b];
                       nums[b] = temp;
                       j=b-1;
                       b=-1;
                   }
               }
           }
        }
        return nums;
    }
    public int[] exchange_2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
