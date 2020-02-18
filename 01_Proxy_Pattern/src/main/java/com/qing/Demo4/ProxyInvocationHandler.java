/**
 * Created by 刘清 on 2019/12/17 20:30
 */

package com.qing.Demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类 自动生成 代理类！
//代理调用处理程序
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

    //生成 得到 代理类
    public Rent getProxy(){
        //拿到 classLoader
        return (Rent) Proxy.newProxyInstance(Rent.class.getClassLoader(),
                new Class<?>[] { Rent.class },
                this);
    }

    //处理 代理实例 并 返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的本质:使用 反射机制...
        Object result = method.invoke(rent,args);
        fare();
        return result;
    }

    //额外功能
    public void seeHouse(){
        System.out.println("中介带看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
