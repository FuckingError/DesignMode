package com.qing.Demo1;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/19 0:54
 */
public class Singleton {
    //Todo-key : 类保存该实例 全局变量->静态变量   私有化该实例
    private static Singleton instance;

    //Todo-key 构造方法 私有化 --> 外界不能创建该实例
    private Singleton(){
    }

    //Todo-key 获取本类 实例的 唯一 全局访问点
    public static Singleton GetInstance(){
        if(instance==null) instance = new Singleton();
        return instance;
    }
}
