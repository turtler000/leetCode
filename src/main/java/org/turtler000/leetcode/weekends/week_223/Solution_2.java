package org.turtler000.leetcode.weekends.week_223;

import org.turtler000.common.ListNode;

/**
 * create by dell ON 2021/1/10
 *
 * 给你链表的头节点 head 和一个整数 k 。
 *
 * 交换 链表正数第 k 个节点和倒数第 k 个节点的值后，返回链表的头节点（链表 从 1 开始索引）。
 */
public class Solution_2 {
    public static ListNode swapNodes(ListNode head, int k) {
            ListNode kNode = head;
            ListNode kDes = head;
            for(int i = 1;i<k;i++){
                kNode = kNode.next;
            }
            ListNode kFake = kNode;
            while(kFake.next!=null){
                kFake = kFake.next;
                kDes = kDes.next;
            }
            //change
        int val = kNode.val;
            kNode.val = kDes.val;
        kDes.val = val;
            return head;

    }
}
