package org.turtler000.leetcode.common.leetcode_21;

import org.turtler000.common.ListNode;

/**
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * @author hanhuanyu
 * @date 2021/8/4 16:47
 * @description
 */
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root  = new ListNode(0);
        ListNode ret = root;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
               root.next = l1;
               root = root.next;
               l1 = l1.next;
            }else if(l2.val<l1.val){
                root.next = l2;
                root = root.next;
                l2 = l2.next;
            }
        }
        if(l1==null){
            root.next = l2;
        }else{
            root.next=l1;
        }
        return ret.next;
    }
}
