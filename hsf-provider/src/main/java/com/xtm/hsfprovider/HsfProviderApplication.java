package com.xtm.hsfprovider;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HsfProviderApplication {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(HsfProviderApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }

}
