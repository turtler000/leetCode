package org.sword.offereight;

import java.util.LinkedList;
import java.util.Stack;

/**
 * create by hanhuanyu ON 2020/10/31
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 *
 *
 * 头栈负责删除，尾栈负责新增，每次操作都清空一个栈(每次都倒腾累不累啊，待优化）
 */
public class CQueue {
   private LinkedList<Integer> stackHead ;
    private LinkedList<Integer> stackTail ;
    public CQueue() {
        this.stackHead = new LinkedList();
        this.stackTail = new LinkedList();

    }
    public void appendTail(int value) {
        //遍历头栈，放到尾栈里
          while(stackHead.size()!=0){
              stackTail.push(stackHead.pop());
          }
          stackTail.push(value);
    }

    public int deleteHead() {
      //空队列返回-1
        if (stackHead.size()==0&&stackTail.size()==0){
            return -1;
        }
        //遍历尾栈，放到头栈里
            while(stackTail.size()!=0){
                stackHead.push(stackTail.pop());
            }
        return (int)stackHead.pop();
    }
}
