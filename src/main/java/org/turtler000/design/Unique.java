package org.turtler000.design;

/**
 * @author hanhuanyu
 * @date 2021/6/30 16:11
 * @description
 */
public class Unique {
    private volatile static Unique uniqueInstance;

    private Unique() {
    }

    public static Unique getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Unique.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Unique();
                }
            }
        }
        return uniqueInstance;
    }
}
