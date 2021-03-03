package com.xtm.hsfconsumer;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.taobao.pandora.boot.PandoraBootstrap;
import com.xtm.hsfapi.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HsfConsumerApplication {

    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(HsfConsumerApplication.class, args);
        PandoraBootstrap.markStartupAndWait();
    }

    @HSFConsumer(clientTimeout = 3000, serviceVersion = "1.0.0")
    private HelloService helloService;

    @RequestMapping(value = "/hsf/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return helloService.echo(str);
    }

}
