package Iterate;

/**
 * Iterator
 *
 * @author zhiguo.zheng
 * @date 2018/11/15
 * @time 22:40
 * @description 遍历集合的接口
 */

public interface Iterator {

    /**
     * 判断是否存在下一个元素
     * @return 是否存在下一个元素
     */
    public abstract boolean hasNext();


    /**
     * 返回集合中的一个元素，并且将迭代器下移
     * @return 迭代器中的元素
     */
    public abstract Object next();
}
