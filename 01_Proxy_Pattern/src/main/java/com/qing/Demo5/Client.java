package com.qing.Demo5;

import com.me.demo02.UserService;
import com.me.demo02.UserServiceImpl;

/**
 * Created by 刘清 on 2019/12/31 14:43.
 * demo2...的动态代理
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色 不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);//设置要代理的对象
        //动态 生成 代理类
        UserService proxy = (UserService)pih.getProxy();

        proxy.add();

    }
}
