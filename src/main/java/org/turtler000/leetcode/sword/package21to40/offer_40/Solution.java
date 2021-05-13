package org.turtler000.leetcode.sword.package21to40.offer_40;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 * <p>
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: hanhuanyu
 * @Date: 2021/2/27 14:08
 */
public class Solution {
    public static int[] getLeastNumbers(int[] arr, int k) {
        List<Integer> ret = new ArrayList();
        for (int i = 0; i < k; i++){
            int tag = arr[0];
            int location = 0;
            for(int j=0;j<arr.length-1;j++){
                if(tag>arr[j+1]){
                    tag=arr[j+1];
                    location = j+1;
                }
            }
            arr[location]=10001;
            ret.add(tag);
        }
        return ret.stream().mapToInt(Integer::valueOf).toArray();
    }
}
