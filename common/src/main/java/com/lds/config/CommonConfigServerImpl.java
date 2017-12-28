package com.lds.config;

import org.springframework.stereotype.Service;

@Service
public class CommonConfigServerImpl implements CommonConfigServer {
    @Override
    public String echoConfig() {
        return "hello lds!";
    }
}
