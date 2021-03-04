package data.jdbc.dataSource;

import com.zaxxer.hikari.util.ConcurrentBag;
import org.junit.Test;

import java.util.concurrent.SynchronousQueue;

/**
 * https://blog.csdn.net/taisenki/article/details/78329558
 *
 * {@linkplain ConcurrentBag}
 * Concurrent 并发
 * Bag  包
 * 并发处理包
 *
 * 其中方法是：
 * borrow 获取对象
 * requite 归还对象
 * add 添加对象
 * remove 删除对象
 *
 *
 * //TODO 对于具体的添加过程需要再详细看
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/4 2:56 下午
 */
public class ConcurrentBagStu {
    /**
     * 构造函数
     * 1、创建 一个队列handoffQueue {@linkplain SynchronousQueue}。保存共用的连接
     * 2、线程局部变量。threadList，是一个list。 用于保存本地的连接池
     * 3、handoffQueue 设置队列
     *
     *
     *
     *
     */
    @Test

    public void init() throws InterruptedException {

    }
}
