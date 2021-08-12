package org.turtler000.leetcode.weekends.week_223;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by dell ON 2021/1/10
 * <p>
 * 给你两个整数数组 source 和 target ，长度都是 n 。还有一个数组 allowedSwaps ，
 * 其中每个 allowedSwaps[i] = [ai, bi] 表示你可以交换数组 source 中下标为 ai 和 bi（下标从 0 开始）
 * 的两个元素。注意，你可以按 任意 顺序 多次 交换一对特定下标指向的元素。
 * <p>
 * 相同长度的两个数组 source 和 target 间的 汉明距离 是元素不同的下标数量。
 * 形式上，其值等于满足 source[i] != target[i] （下标从 0 开始）的下标 i（0 <= i <= n-1）的数量。
 * <p>
 * 在对数组 source 执行 任意 数量的交换操作后，返回 source 和 target 间的 最小汉明距离 。
 *
 * todo 使用并查集
 */
public class Solution_3 {

    public static int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int swapLentgh = allowedSwaps.length;
        Map<Integer, List> map = new HashMap();
        for (int i = 0; i < swapLentgh; i++) {
            if (map.get(allowedSwaps[i][0]) == null) {
                List list = new ArrayList();
                list.add(allowedSwaps[i][1]);
                map.put(allowedSwaps[i][0], list);
            } else {
                List list = (List) map.get(allowedSwaps[i][0]);
                list.add(map.get(allowedSwaps[i][1]));
                map.put(allowedSwaps[i][0], list);
            }
        }
        int ret = 0;
        for(int i = 0;i<source.length;i++){
            int s = source[i];
            List list = map.get(i);
            if(list!=null) {
                for (int j = 0; j < list.size(); j++) {
                    if (source[i] == target[(int) list.get(j)] && source[(int) list.get(j)] == target[i]) {
                        j = list.size();
                        map.remove(i);
                        i++;
                    }else{
                        if (source[i] != target[i]) {
                            ret++;
                        }
                    }
                }
            }else {
                if (source[i] != target[i]) {
                    ret++;
                }
            }
        }
        return ret;
    }
    public static int minimumHammingDistance_1(int[] source, int[] target, int[][] allowedSwaps){
        int ret = 0;
        for(int i =0;i<allowedSwaps.length;i++){
            int a = allowedSwaps[i][0];
            int b = allowedSwaps[i][1];
            if(source[a]==target[b]||source[b]==target[a]){
                int temp = source[a];
                source[a] = source[b];
                source[b] = temp;
            }
        }
        for(int i = 0;i<target.length;i++){
            if(source[i]!=target[i]){
                ret++;
            }
        }
        return ret;
    }
}
