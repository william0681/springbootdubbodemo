package com.zx.springbootdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zx.springbootdubbocommon.model.Person;
import com.zx.springbootdubbocommon.service.IProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class PersonController {

    @Reference
    IProvider iProvider;

    @GetMapping("/person")
    public Person getPerson(@RequestParam("name")String name){
        return iProvider.getPerson(name+'1');
    }
}
