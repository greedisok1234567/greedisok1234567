package com.start.service;

import com.start.interfence.TMyInterfence;
import org.springframework.stereotype.Service;

@Service("TMyInterfaceImpl")
public class TMyInterfenceImpl implements TMyInterfence {
    public String sayHi() {
        return "serviceZero";
    }
}
