package org.turtler000.interview.Boss;

/**
 * create by dell ON 2021/5/11
 * 轮流打印大小写字母，并分别打印耗时
 */
public class Solution {
    private static final Object lock = new Object();
    private static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        long totalStart = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            long thread1Start = System.currentTimeMillis();
            for (int i = 0; i < 26;) {
                synchronized (lock) {
                    if (flag) {
                        System.out.print((char)('a' + i));
                        flag = false;
                        i++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            long thread1Cost = System.currentTimeMillis() - thread1Start;
            System.out.println();
            System.out.println("thread1Cost " + thread1Cost);
        });
        Thread thread2 = new Thread(() -> {
            long thread2Start = System.currentTimeMillis();
            for (int i = 0; i < 26;) {
                synchronized (lock) {
                    if (!flag) {
                        System.out.print((char)('A' + i));
                        flag = true;
                        i++;
                        lock.notify();
                    } else {
                        if (i != 25) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
            long thread2Cost = System.currentTimeMillis() - thread2Start;
            System.out.println();
            System.out.println("thread2Cost " + thread2Cost);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long totalCost = System.currentTimeMillis() - totalStart;
        System.out.println("totalCost " + totalCost);
    }

}
