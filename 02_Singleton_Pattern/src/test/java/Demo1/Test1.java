package Demo1;

import com.qing.Demo1.Singleton;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/19 0:58
 */
public class Test1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.GetInstance();
        Singleton instance2 = Singleton.GetInstance();
        System.out.println(instance1==instance2);
    }
}
