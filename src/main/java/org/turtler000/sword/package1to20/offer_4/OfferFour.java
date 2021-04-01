package org.turtler000.sword.package1to20.offer_4;

/**
 * create by hanhuanyu ON 2020/9/22
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class OfferFour {

    public static int[] reversePrint(ListNode head) {
        if (head==null){
            return new int[0];
        }
        ListNode node = head;
        int count = 0;
        while (node.next != null) {
            count++;
            node = node.next;
        }
        node = head;
        int[] nums = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }
}
