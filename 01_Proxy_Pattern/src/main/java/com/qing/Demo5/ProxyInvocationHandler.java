/**
 * Created by 刘清 on 2019/12/17 20:30
 */

package com.qing.Demo5;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类 自动生成 代理类！
//代理调用处理程序
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    //生成 得到 代理类
    public Object getProxy(){
        //拿到 classLoader
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    //处理 代理实例 并 返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        //动态代理的本质:使用 反射机制...
        Object result = method.invoke(target,args);
        return result;
    }

    //添加功能
    public void log(String msg){
        System.out.println("执行了..."+msg+"...方法");
    }
}
