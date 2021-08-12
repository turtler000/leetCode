package org.turtler000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.turtler000.common.ListNode;
import org.turtler000.common.TreeNode;
import org.turtler000.common.proxy.ProxyTargetHandler;
import org.turtler000.common.proxy.TargetInterface;
import org.turtler000.common.proxy.TargetObject;
import org.turtler000.leetcode.common.leetcode_617.Solution;
import org.turtler000.spring.LoopDependenceA;
import org.turtler000.spring.LoopDependenceAInterface;

import java.util.List;


/**
 * spring-boot startup
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
