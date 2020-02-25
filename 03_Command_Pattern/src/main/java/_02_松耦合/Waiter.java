package _02_松耦合;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:23
 */
public class Waiter {
    private Command command;

    //设置订单...这里可以用到多态...抽象类 = 子类...
    public void SetOrder(Command command){
        this.command = command;
    }

    //通知执行
    public void Notify(){
        command.ExecuteCommand();
    }
}
