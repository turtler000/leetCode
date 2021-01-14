package org.sword.package21to40.offer_22;

import org.common.ListNode;

/**
*
* @Author: Han Huanyu
* @Date: 2020/12/8
 *
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
 * 本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，
 * 从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 *
 *  
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 *
 * 返回链表 4->5.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
public class Solution {

    public static ListNode getKthFromEnd(ListNode head, int k) {
ListNode p1 = head;
ListNode p2 = head;
for(int i =1;i<k;i++){
    p2 = p2.next;
}
while(p2.next!=null){
    p1=p1.next;
    p2=p2.next;
}
return p1;
    }
}
