package _01_紧耦合;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:08
 */
public class Barbecuer {
    //烤羊肉
    /*Todo-tip : private 是 只能类内部使用 方法一般是 public 被子类继承 用 protected*/
    public void BakeMutton(){
        System.out.println("烤羊肉！");
    }

    //烤鸡翅
    public void BakeChickenWing(){
        System.out.println("烤鸡翅!");
    }
}
