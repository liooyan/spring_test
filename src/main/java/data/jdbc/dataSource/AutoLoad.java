package data.jdbc.dataSource;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 *
 * 关于jdbc 自动加载过程
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/4 11:46 上午
 */
public class AutoLoad {

    /**
     *
     * 通过 conn = DriverManager.getConnection(url, username, password); 获取连接
     * 1、执行DriverManager 中的 staic 方法。执行 {@linkplain DriverManager#loadInitialDrivers()} 方法
     *
     * 2、 通过 ServiceLoader<Driver> loadedDrivers = ServiceLoader.load(Driver.class);
     *          获取到所有在META-INF 下文件名为范型类的文件名内容的class。
     *    之后 iterator 执行next 会 new 出该对象。
     *
     * 3、在 static 方法中： 执行 java.sql.DriverManager.registerDriver(new Driver());
     *
     * 4、这样在 {@linkplain DriverManager#registeredDrivers} 中就会有对于的对象
     *
     * @param args
     */
    public static void main(String[] args) {

        ServiceLoader<Driver> loadedDrivers = ServiceLoader.load(Driver.class);
        final Iterator<Driver> driversIterator = loadedDrivers.iterator();
        try{
            while(driversIterator.hasNext()) {
                driversIterator.next();
            }
        } catch(Throwable t) {
            // Do nothing
        }
    }




}
