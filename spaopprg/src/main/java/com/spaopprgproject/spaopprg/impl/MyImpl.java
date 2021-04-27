package com.spaopprgproject.spaopprg.impl;

import com.spaopprgproject.spaopprg.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {


    @Override
    public String checkAop() {
        System.out.println("Hiiiiiiiiii");
        return "Hello Spring Aop";
    }

}
