package org.turtler000.design;

/**
 * @author hanhuanyu
 * @date 2021/5/10 15:44
 * @description 单例模式
 */
public class Instance {
    private volatile static Instance uniqueInstance;

    private Instance() {
    }

    public static  Instance getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Instance.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Instance();
                }
            }
        }
        return uniqueInstance;
    }

}

