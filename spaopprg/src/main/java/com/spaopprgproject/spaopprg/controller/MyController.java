package com.spaopprgproject.spaopprg.controller;

import com.spaopprgproject.spaopprg.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping("/check")
    public String check(){
        return myImpl.checkAop();
    }
}
