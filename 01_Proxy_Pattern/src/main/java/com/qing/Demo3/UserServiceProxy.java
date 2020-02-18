/**
 * Created by 刘清 on 2019/12/17 19:53
 */

package com.qing.Demo3;

//代理角色 目的：不改变原来的真实角色 UserServiceImpl  在UserServiceProxy中 添加新功能

//添加一个 log 方法
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //日志 方法
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    };

    //在公司中 修改原有代码是 大忌！ 正确的应该是 使用代理去 添加功能
}
