package org.turtler000.sword.package21to40.offer_29;

import java.util.ArrayList;
import java.util.List;

/**
 * create by hanhuanyu ON 2021/1/5
 * 2021/1/5 周二
 * 经历了元旦假期，现在开始做rabbitmq相关工作
 * <p>
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class Solution {
    //每次搞一圈，直到搞完
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int row = matrix.length;
        if (row == 0) {
            return new int[0];
        }
        int colum = matrix[0].length;
        if (colum == 0) {
            return new int[0];
        }
        List<Integer> ret = new ArrayList();
        for (int i = 0; i < (Math.min(row, colum) + 1) / 2; i++) {
            ret.addAll(circle(matrix, i));
        }
        return ret.stream().mapToInt(Integer::intValue).toArray();
    }

    public static List circle(int[][] matrix, int m) {
        List<Integer> ret = new ArrayList();
        int row = matrix.length;
        int colum = matrix[0].length;
        //上
        for (int i = 0; i < colum - 2 * m; i++) {
            ret.add(matrix[m][m + i]);
        }
        if (row - 2 * m == 1) {
            return ret;
        }
        //右
        for (int i = 0; i < row - 2 * m - 2; i++) {
            ret.add(matrix[m + 1 + i][colum - m  - 1]);
        }
        //下
        for (int i = 0; i < colum - 2 * m; i++) {
            ret.add(matrix[row - m -1][colum - m - i]);
        }
        //左
        if (colum - 2 * m > 1) {
            for (int i = 0; i < row - 2 * m - 2; i++) {
                ret.add(matrix[row - m - i - 2][m]);
            }
        }
        return ret;
    }
}
