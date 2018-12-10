package Prototype.framework;

import java.util.HashMap;

/**
 * Description: Client(使用者)
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2018/12/10 23:21
 * @version V1.0
 */
public class Manager {

    /** 保存 实例 和 名字 之间的对应关系 **/
    private HashMap showCase = new HashMap();

    /**
     * 将收到的一组名字和实例注册到 showCase 中
     * @param name 名字
     * @param proto 实例
     */
    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    /**
     * 通过既有实例复制生成新实例
     * @param protoName 实例名称
     * @return 复制的实例
     */
    public Product create(String protoName) {
        Product p = (Product) showCase.get(protoName);
        return p.createClone();
    }
}
