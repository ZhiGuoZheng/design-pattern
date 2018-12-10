package Prototype.framework;

/**
 * Description: Prototype(原型)
 * 复制功能的接口，实现 Cloneable 接口, 可以调用 clone() 方法来自动复制实例
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @version V1.0
 * @time 2018/12/10 23:17
 */
public interface Product extends Cloneable{

    /**
     * 用于使用
     * @param s 被处理的字符串
     */
    public abstract void use(String s);

    /**
     * 用于复制实例
     * @return 所复制的实例
     */
    public abstract Product createClone();
}
