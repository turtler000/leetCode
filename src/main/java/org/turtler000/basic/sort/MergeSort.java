package org.turtler000.basic.sort;

import java.util.Arrays;

import static org.turtler000.common.Util.swap;

/**
 * create by dell ON 2021/5/13
 */
public class MergeSort {

    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        } else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
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
                }
                iR++;
            }
            i++;
        }
        return ret;
    }


    public static void quickSort_1(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;
        int right = rightIndex;
        //待排序的第一个元素作为基准值
        int key = arr[left];

        //从左右两边交替扫描，直到left = right
        while (left < right) {
            while (right > left && arr[right] >= key) {
                //从右往左扫描，找到第一个比基准值小的元素
                right--;
            }

            //找到这种元素将arr[right]放入arr[left]中
            arr[left] = arr[right];

            while (left < right && arr[left] <= key) {
                //从左往右扫描，找到第一个比基准值大的元素
                left++;
            }

            //找到这种元素将arr[left]放入arr[right]中
            arr[right] = arr[left];
        }
        //基准值归位
        arr[left] = key;
        //对基准值左边的元素进行递归排序
        quickSort_1(arr, leftIndex, left - 1);
        //对基准值右边的元素进行递归排序。
        quickSort_1(arr, right + 1, rightIndex);
    }

}
