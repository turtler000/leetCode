package org.weekends.week_218;

import java.util.*;

/**
* 
* @Author: Han Huanyu
* @Date: 2020/12/6
 *
 * 给你一个整数数组 nums 和一个整数 k 。
 *
 * 每一步操作中，你需要从数组中选出和为 k 的两个整数，并将它们移出数组。
 *
 * 返回你可以对数组执行的最大操作数。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4], k = 5
 * 输出：2
 * 解释：开始时 nums = [1,2,3,4]：
 * - 移出 1 和 4 ，之后 nums = [2,3]
 * - 移出 2 和 3 ，之后 nums = []
 * 不再有和为 5 的数对，因此最多执行 2 次操作。
 * 示例 2：
 *
 * 输入：nums = [3,1,3,4,3], k = 6
 * 输出：1
 * 解释：开始时 nums = [3,1,3,4,3]：
 * - 移出前两个 3 ，之后nums = [1,4,3]
 * 不再有和为 6 的数对，因此最多执行 1 次操作。
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 * 1 <= k <= 109
*/
public class Knum {
    public static int maxOperations(int[] nums, int k) {
Map<Integer,Integer> map = new HashMap();
for(int i =0;i<nums.length;i++){
    if(map.containsKey(nums[i])){
        map.put(nums[i],map.get(nums[i])+1);
    }else{
        map.put(nums[i],1);
    }
}
int ret = 0;
for(int i=0;i<nums.length;i++){
    if(map.get(nums[i])!=0) {
        if (map.containsKey(k - nums[i])) {
                if (map.get(nums[i]) >= 1 && map.get(k - nums[i]) >= 1) {
                    if (nums[i] == k - nums[i]) {
                        if (map.get(nums[i]) >= 2) {
                            map.put(nums[i], map.get(nums[i]) - 2);
                            ret++;
                        }
                    }else {
                        map.put(nums[i], map.get(nums[i]) - 1);
                        map.put(k - nums[i], map.get(k - nums[i]) - 1);
                        ret++;
                    }
                }
            }
        }
}
return ret;
    }

    public static int maxOperations_1(int[] nums, int k){
        int ret =0;
        List<Integer> numsl=new ArrayList<>();
        for(int i:nums){
            numsl.add(i);
        }
        for(int i =numsl.size()-1;i>=0;i--){
                for (int j = i-1; j >=0; j--) {
                    if ((int)numsl.get(i)+(int)numsl.get(j) == k) {
                        numsl.remove(i);
                        numsl.remove(j);
                        ret++;
                       j=0;
                       i--;
                    }
                }
        }
        return ret;
    }
}
