package org.turtler000.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hanhuanyu
 * @date 2021/8/12 15:48
 * @description
 */
@Controller
@RequestMapping
public class TestController {
    @Autowired
    LoopDependenceAInterface loopA;

    @GetMapping
    @ResponseBody
    public int ret(){
        loopA.print(123);
        return 11;
    }
}
