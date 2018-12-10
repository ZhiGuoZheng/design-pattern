package Prototype;

import Prototype.framework.Product;

/**
 * Description: ConcretePrototype(具体的原型)
 * 用字符作为下划线修饰字符串
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2018/12/10 23:31
 * @version V1.0
 */
public class UnderlinePen implements Product {

    /** 下划线字符 **/
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
