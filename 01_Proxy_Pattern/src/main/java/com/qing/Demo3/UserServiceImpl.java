/**
 * Created by 刘清 on 2019/12/17 19:50
 */

package com.qing.Demo3;

//真实对象
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加");
    }

    public void delete() {
        System.out.println("删除");
    }

    public void update() {
        System.out.println("修改");
    }

    public void query() {
        System.out.println("查询");
    }
}
