package org.turtler000.leetcode.sword.package41to60.offer_59_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*
请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。

若队列为空，pop_front 和 max_value 需要返回 -1

示例 1：

输入:
["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
[[],[1],[2],[],[],[]]
输出: [null,null,null,2,1,2]
示例 2：

输入:
["MaxQueue","pop_front","max_value"]
[[],[],[]]
输出: [null,-1,-1]
 

限制：

1 <= push_back,pop_front,max_value的总操作数 <= 10000
1 <= value <= 10^5

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> max;

    public MaxQueue() {
        this.queue = new ArrayDeque<>();
        this.max = new ArrayDeque<>();
    }

    public int max_value() {
        if (max.isEmpty()) {
            return -1;
        }
        return max.peek();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!max.isEmpty() && max.peekLast() < value) {
            max.pollLast();
        }
        max.add(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }else{
            if(max.peek().equals(queue.peek())){
                max.poll();
            }
            return queue.poll();
        }

    }
}
