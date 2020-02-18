/**
 * Created by 刘清 on 2019/12/17 20:39
 */

package com.qing.Demo4;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有...  通过代理程序  生成 代理类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过 调用程序处理角色 来 处理我们要调用的 接口对象

        //设置 被代理的类
        pih.setRent(host);

        //拿到代理类
        Rent proxy = pih.getProxy();

        //通过 代理角色 执行 rent 方法
        proxy.rent();
    }
}
