package org.turtler000.leetcode.questiontwo;

/**
 *链表 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    //初始化target值
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        return addTwoNumbers_1(l1,l2,0);
    }
   //target为父节点value的进位，递归即可
    public static  ListNode addTwoNumbers_1(ListNode l1, ListNode l2,int target) {
        if(l1==null&&l2==null){
            if(target!=0) {
                ListNode list = new ListNode(target);
                return list;
            }
            return null;
        }else if(l1==null&&l2!=null){
            l1 =new ListNode(0);
        }else if(l1!=null&&l2==null){
            l2 =new ListNode(0);
        }
            int ans = l1.val + l2.val + target;
            ListNode list ;
            if (ans >= 10) {
                list = new ListNode(ans - 10);
                target = 1;
            } else {
                list = new ListNode(ans);
                target = 0;
            }
            if (l1.next != null || l2.next != null) {
                list.next = addTwoNumbers_1(l1.next, l2.next, target);
            }else if(target!=0){
                list.next=addTwoNumbers_1(null,null,target);
            }
            return list;
    }
    public static void print(ListNode listNode){
        System.out.println(listNode.getVal());
        if(listNode.getNext()!=null){
            print(listNode.getNext());
        }
    }
}
