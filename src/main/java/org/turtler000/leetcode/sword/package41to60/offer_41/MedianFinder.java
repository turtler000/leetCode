package org.turtler000.leetcode.sword.package41to60.offer_41;

import java.util.LinkedList;
import java.util.List;

/**
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * <p>
 * 例如，
 * <p>
 * [2,3,4] 的中位数是 3
 * <p>
 * [2,3] 的中位数是 (2 + 3) / 2 = 2.5
 * <p>
 * 设计一个支持以下两种操作的数据结构：
 * <p>
 * void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 * 示例 1：
 * <p>
 * 输入：
 * ["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
 * [[],[1],[2],[],[3],[]]
 * 输出：[null,null,null,1.50000,null,2.00000]
 * 示例 2：
 * <p>
 * 输入：
 * ["MedianFinder","addNum","findMedian","addNum","findMedian"]
 * [[],[2],[],[3],[]]
 * 输出：[null,null,2.00000,null,2.50000]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: hanhuanyu
 * @Date: 2021/2/27 17:03
 */
public class MedianFinder {
    List list;
    double median;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        this.list = new LinkedList();
    }

    public void addNum(int num) {
        if (this.list.size() == 0) {
            this.list.add(num);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (num < (int) list.get(i)) {
                 list.add(i, num);
                 break;
                }else if(i==list.size()-1||num<=(int)list.get(i+1)){
                    list.add(i+1,num);
                    break;
                }
            }
        }
        if(this.list.size()%2==0){
            Double left = Double.valueOf((int)list.get(list.size()/2-1));
            Double right = Double.valueOf((int)list.get(list.size()/2));
            this.median = (left+right)/2;
        }else{
            this.median=Double.valueOf((int)list.get(list.size()/2));
        }
    }

    public double findMedian() {
        return this.median;
    }
}
