package org.turtler000.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hanhuanyu
 * @date 2021/8/12 14:56
 * @description
 */
public class ProxyTargetHandler implements InvocationHandler {
    private Object object;
    public ProxyTargetHandler(Object object){
        if(this.object==null) {
            this.object = object;
        }
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke "  + method.getName());
        method.invoke(object, args);
        System.out.println("After invoke " + method.getName());
        return null;
    }
}
