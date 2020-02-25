package _02_松耦合;

import _01_紧耦合.Barbecuer;

/**
 * 具体命令类...继承自 抽象命令
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:15
 */
public class BakeMuttonCommand extends Command{
    //设置一个...烤羊肉串...的人...
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    //执行
    public void ExecuteCommand() {
        receiver.BakeMutton();
    }
}
