package com.qing.Demo1;

import com.qing.Demo1.Proxy;
import com.qing.Demo1.SchoolGirl;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/18 17:46
 */
public class MyTest {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("小小");

        //代理
        Proxy proxy = new Proxy(girl);

        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }
}
