package Iterate;

/**
 * Aggregate
 *
 * @author zhiguo.zheng
 * @date 2018/11/15
 * @time 22:39
 * @description 表示集合的接口
 */

public interface Aggregate {

    /**
     * 生成一个用于遍历集合的迭代器
     * @return 一个迭代器
     */
    public abstract Iterator iterator();
}
