package com.lds.controller;

import com.lds.comsumer.CommonServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CommonServer server;

    @RequestMapping("/invoke")
    public String invoke(){
        return server.service();
    }
}
