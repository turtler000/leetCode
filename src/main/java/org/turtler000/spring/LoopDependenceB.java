package org.turtler000.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hanhuanyu
 * @date 2021/8/12 15:37
 * @description
 */
@Component
public class LoopDependenceB implements LoopDependenceBInterface{
    @Autowired
    LoopDependenceAInterface loopDependenceA;
}
