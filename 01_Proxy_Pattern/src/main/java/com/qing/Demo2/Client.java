/**
 * Created by 刘清 on 2019/12/17 19:37
 */

package com.qing.Demo2;

public class Client {
    public static void main(String[] args) {
        //Todo-key : 代理角色 里面 可以有一些 附属操作
        //房东要租房子
        Host host = new Host();
        //代理 中介帮房东租房子 但是 代理角色会有一些 附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东 直接找中介租房
        proxy.rent();
    }
}
