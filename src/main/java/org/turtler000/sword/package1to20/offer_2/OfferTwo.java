package org.turtler000.sword.package1to20.offer_2;

/**
 * create by hanhuanyu ON 2020/9/19
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例:
 * <p>
 * 现有矩阵 matrix 如下：
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * <p>
 * 给定 target = 20，返回 false。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferTwo {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //从左上角开始找
        return findNumber(matrix, 0, matrix[0].length-1, target);
    }

    public static boolean findNumber(int[][] matrix, int i, int j, int target) {
        int row = matrix.length;
        int colume = matrix[0].length;
        if(matrix[i][j]==target){
        return true;
        }else if(matrix[i][j]<target){
            //往下一个
            if(i>=row-1){
                return false;
            }else {
                return findNumber(matrix, i + 1, j, target);
            }
        }else if(matrix[i][j]>target){
            //往左一个
            if(j==0){
                return false;
            }else {
                return findNumber(matrix,i,j-1,target);
            }
        }
return false;
    }
}
