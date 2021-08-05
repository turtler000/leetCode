package org.turtler000.leetcode.common.leetcode_23;

import org.turtler000.common.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * 23. 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 * <p>
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 * @author hanhuanyu
 * @date 2021/8/5 15:24
 * @description
 */
public class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode root = new ListNode(-1);
        ListNode ret = root;
        boolean flag = true;
        if (lists.length == 0) {
            return null;
        }
        while (flag) {
            int min = -1, local = -1;
            //找到最小节点
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (local == -1) {
                        min = lists[i].val;
                        local = i;
                    } else {
                        if (lists[i].val < min) {
                            min = lists[i].val;
                            local = i;
                        }
                    }
                }
            }
            if (local == -1) {
                flag = false;
            }else {
                root.next = lists[local];
                lists[local] = lists[local].next;
                root = root.next;
            }
        }
        return ret.next;
    }
}
