package com.example.common.proxy.staticproxy;

/**
 * @author: lingjun.jlj
 * @date: 2018-12-14 09:59
 * @description: 静态代理具体实现类
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String hi(String msg) {
        return "Hi, " + msg;
    }
}
