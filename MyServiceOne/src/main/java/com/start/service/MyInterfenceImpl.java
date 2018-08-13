package com.start.service;

import com.start.interfence.IMyInterfence;
import org.springframework.stereotype.Service;


@Service("myInterfence")
public class MyInterfenceImpl implements IMyInterfence {

    public String helloWord() {
        return "MyInterfenceOne";
    }
}
