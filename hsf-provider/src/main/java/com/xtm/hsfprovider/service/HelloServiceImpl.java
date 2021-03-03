package com.xtm.hsfprovider.service;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.xtm.hsfapi.api.HelloService;

/**
 * @version : 1.0
 * @description: java类作用描述
 * @author: tianwen
 * @create: 2021/3/3 21:55
 **/
@HSFProvider(serviceInterface = HelloService.class, serviceVersion = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String echo(String string) {
        return null;
    }
}
