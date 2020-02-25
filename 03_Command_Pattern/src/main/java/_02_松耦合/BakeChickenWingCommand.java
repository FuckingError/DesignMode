package _02_松耦合;

import _01_紧耦合.Barbecuer;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:23
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    public void ExecuteCommand() {
        receiver.BakeChickenWing();
    }
}
