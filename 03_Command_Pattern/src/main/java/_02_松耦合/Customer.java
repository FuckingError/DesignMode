package _02_松耦合;

import _01_紧耦合.Barbecuer;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:25
 */
public class Customer {
    public static void main(String[] args) {
        //开店前...
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        //开门
        girl.SetOrder(bakeMuttonCommand1);
        girl.Notify();
        girl.SetOrder(bakeMuttonCommand2);
        girl.Notify();
        girl.SetOrder(bakeChickenWingCommand1);
        girl.Notify();
    }
}
