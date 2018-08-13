package com.start.controller;



import com.start.interfence.IMyInterfence;

import com.start.interfence.TMyInterfence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
    @Autowired
    private IMyInterfence myInterfence;
    @Autowired
    private TMyInterfence tMyInterfence;

    @RequestMapping("/test.do")
    public String getTest() {
        System.out.print("11111111112");
        String str = myInterfence.helloWord();
        System.out.print(str);
        return "welcome";
    }

    @RequestMapping("/test1.do")
    @ResponseBody
    public String getTest1() {
        String str = tMyInterfence.sayHi();
        System.out.print(str);
        return str+"zero";
    }


}

