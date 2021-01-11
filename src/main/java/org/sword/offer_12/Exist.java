package org.sword.offer_12;

import java.util.Arrays;

/**
 * create by hanhuanyu ON 2020/11/7
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * <p>
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * <p>
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 * 提示：
 * <p>
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Exist {
    public static boolean exist(char[][] board, String word) {
        char[] a = word.toCharArray();
        char[] atemp = Arrays.copyOfRange(a , 1, a.length );
        char[][] temp;
        char token = '!';
        // 第一行最后一行 找起点
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == a[0]) {
                //找到起点
                temp = board;
                temp[0][i] = token;
                if (isExist(temp, atemp, 0, i)) {
                    return true;
                }
            }
            if (board[board.length-1][i] == a[0]) {
                //找到起点
                temp = board;
                temp[board.length-1][i] = token;
                if (isExist(temp, atemp, board.length-1, i)) {
                    return true;
                }
            }
        }
        //左边和右边一列，找起点
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == a[0]) {
                //找到起点
                temp = board;
                temp[i][0] = token;
                if (isExist(temp, atemp, i, 0)) {
                    return true;
                }
            }
            if (board[i][board[0].length-1] == a[0]) {
                //找到起点
                temp = board;
                temp[i][board[0].length-1] = token;
                if (isExist(temp, atemp, i, board[0].length-1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean exist_1(char[][] board, String word) {
        char[] a = word.toCharArray();
        char[] atemp = Arrays.copyOfRange(a , 1, a.length );
        // 找起点
        for(int i =0;i<=board.length-1;i++){
            for(int j = 0;j<=board[0].length-1;j++){
                if (board[i][j]==a[0]){
                    if (isExist(board, atemp, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
        //找到起点，图的深度遍历
    public static boolean isExist(char[][] board, char[] word, int colum, int row) {
        char temp  = board[colum][row];
        board[colum][row] = '!';
        if(word.length==0){
            return true;
        }
        char[] wordTemp = Arrays.copyOfRange(word,1,word.length);
        //上边的点
        if(colum-1>=0){
            if(board[colum-1][row]!='!'&&board[colum-1][row]==word[0]){
               if(isExist(board,wordTemp,colum-1,row)){
                   return true;
               }
            }
        }
        //下边的点
        if(colum+1<=board.length-1){
            if(board[colum+1][row]!='!'&&board[colum+1][row]==word[0]){
                if(isExist(board,wordTemp,colum+1,row)){
                    return true;
                }
            }
        }
        //左边的点
        if(row-1>=0){
            if(board[colum][row-1]!='!'&&board[colum][row-1]==word[0]){
                if(isExist(board,wordTemp,colum,row-1)){
                    return true;
                }
            }
        }
        //右边的点
        if(row+1<=board[0].length-1){
            if(board[colum][row+1]!='!'&&board[colum][row+1]==word[0]){
                if(isExist(board,wordTemp,colum,row+1)){
                    return true;
                }
            }
        }
        board[colum][row] = temp;
        return false;
    }
}
