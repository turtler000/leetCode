package org.turtler000.leetcode.common.leetcode_143;

import org.turtler000.common.ListNode;

/**
 *
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 *
 *  L0 → L1 → … → Ln-1 → Ln 
 * 请将其重新排列后变为：
 *
 * L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 *
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 重排链表
 *
 * 先分割，后半部分倒转，插入
 * @author hanhuanyu
 * @date 2021/8/26 11:25
 * @description
 */
public class Solution {
    public static void reorderList(ListNode head) {
        int length = 1;
        ListNode temp  = head;
        while(temp.next!=null){
            temp =temp.next;
            length++;
        }
        ListNode mid = head;
        for(int i = 0;i<length/2;i++){
            mid = mid.next;
        }
        //fanzhuan mid
        temp = null;
        while(mid!=null){
            ListNode next = mid.next;
            mid.next = temp;
            temp = mid;
            mid = next;
        }
        mid = temp;
        //charu
        temp = head;
        while(mid.next!=null){
            ListNode headN = head.next;
            head.next = mid;
            ListNode midN = mid.next;
            mid.next = headN;
            head = headN;
            mid = midN;
        }
        head = temp;
    }
}