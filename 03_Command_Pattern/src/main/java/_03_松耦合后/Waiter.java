package _03_松耦合后;

import _02_松耦合.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:35
 */
public class Waiter {
    //Todo-key : 增加 存放 具体命令 的 容器
    private List<Command> orders = new ArrayList<Command>();

    //设置订单
    public void SetOrder(Command command){
        //如果没有货...可以拒绝...
    }

}
