package org.sword.package21to40.offer_24;

import org.common.ListNode;

/**
 * @Author: Han Huanyu
 * @Date: 2020/12/9
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 5000
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null, mid = head, temp = null;
        while (mid != null) {
            temp = mid.next;
            mid.next = pre;
            pre = mid;
            mid = temp;
        }
        return pre;
    }

    public static ListNode reverseList_1(ListNode head) {
       ListNode pre =null,nodeN = head,next =null;
       while(nodeN!=null){
           next = nodeN.next;
           nodeN.next=pre;
           pre = nodeN;
           nodeN = next;
       }
       return pre;
    }
    public static ListNode reverseList_2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList_2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
