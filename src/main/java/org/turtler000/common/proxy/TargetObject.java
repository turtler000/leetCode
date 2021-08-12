package org.turtler000.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author hanhuanyu
 * @date 2021/8/12 14:48
 * @description
 */
public class TargetObject implements TargetInterface{

    int num;
 public TargetObject(int num){
     this.num = num;
 }
    @Override
    public void print(int num){
        System.out.println(num);
    }

    public void invoke(InvocationHandler handler){
      TargetInterface target = (TargetInterface)  Proxy.newProxyInstance(this.getClass().getClassLoader(), this.getClass().getInterfaces(), handler);
      target.print(this.num);
    }
}
