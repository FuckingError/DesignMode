package _02_松耦合;

import _01_紧耦合.Barbecuer;

/**
 * 抽象命令类
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:12
 */

public abstract class Command {
    /*Todo-Tip : 使用 protected 可以被 子类 调用...*/
    //Todo-key : 抽象命令类中 属性 命令接受者...
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    //执行命令
    public abstract void ExecuteCommand();
}
