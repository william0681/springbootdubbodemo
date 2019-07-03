package com.zx.springbootdubbocommon.service;


import com.zx.springbootdubbocommon.model.Person;

public interface IProvider {

    public Person getPerson(String name);
}
