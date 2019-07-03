package com.zx.springbootdubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zx.springbootdubbocommon.model.Person;
import com.zx.springbootdubbocommon.service.IProvider;
import org.springframework.stereotype.Component;

@Service
@Component
public class IProviderImpl implements IProvider {
    @Override
    public Person getPerson(String name) {
        return new Person(1,name);
    }
}
