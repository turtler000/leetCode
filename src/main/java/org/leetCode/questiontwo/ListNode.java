package org.leetCode.questiontwo;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
    public int getVal(){
        return this.val;
    }
    public ListNode getNext(){
        return this.next;
    }
    public void setVal(int val){
        this.val = val;
    }
    public void setNext(ListNode next){
        this.next=next;
    }
}
