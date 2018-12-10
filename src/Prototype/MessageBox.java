package Prototype;

import Prototype.framework.Product;

/**
 * Description: ConcretePrototype(具体的原型)
 * 将字符串放入方框中并显示出来
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2018/12/10 23:26
 * @version V1.0
 */
public class MessageBox implements Product {

    /** 所环绕的字符 **/
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
