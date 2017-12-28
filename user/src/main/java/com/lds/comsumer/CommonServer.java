package com.lds.comsumer;

import com.lds.config.CommonConfigServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServer {

    @Autowired
    private CommonConfigServer configServer;

    public String service(){
       return configServer.echoConfig();
    }

}
