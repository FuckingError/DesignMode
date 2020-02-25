package _01_紧耦合;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/25 15:10
 */
public class Customer {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        boy.BakeMutton();
        boy.BakeChickenWing();;
        boy.BakeMutton();
    }
}
