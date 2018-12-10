package Prototype;

import Prototype.framework.Manager;
import Prototype.framework.Product;

/**
 * Description: 测试主类
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2018/12/10 23:17
 * @version V1.0
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("Strong message", upen);
        manager.register("Warning box", mbox);
        manager.register("Slash box", sbox);

        Product p1 = manager.create("Strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("Warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("Slash box");
        p3.use("Hello, world.");
    }
}
