package org.sword.offereleven;

/**
 * create by hanhuanyu ON 2020/11/7
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：[2,2,2,0,1]
 * 输出：0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinArray {
    public static int minArray(int[] numbers) {
        int length = numbers.length;
        if(numbers[0]<numbers[length-1]||length == 1){
            return numbers[0];
        }else{
            for(int i =1;i<=length-1;i++){
                if(numbers[length-i-1]>numbers[length-i]){
                    return numbers[length-i];
                }
            }
        }
        return numbers[0];
    }
}
