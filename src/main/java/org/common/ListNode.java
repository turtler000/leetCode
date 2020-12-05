package org.common;

/**
 * create by hanhuanyu ON 2020/12/5
 */
  public class ListNode {
     public  int val;
     public ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int x) { val = x; }
 }
