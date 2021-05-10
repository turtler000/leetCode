package org.turtler000;

import org.turtler000.common.TreeNode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turtler000.sword.package61to68.offer66.Solution;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
Map map = new HashMap();
map.put(new String("a"),"df");
map.put(new String("a"),"dfa");
List list = (List)map.get("a");
System.out.println(list.get(0));
        Lock lock = new ReentrantLock();
        ThreadLocal threadLocal ;

    }
// 12 22 25 1225
}

