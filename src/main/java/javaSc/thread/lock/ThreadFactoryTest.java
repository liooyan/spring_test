package javaSc.thread.lock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * 线程工厂
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/8 2:37 下午
 */
public class ThreadFactoryTest {


    public static class MyThreadFactory implements ThreadFactory {

        private int counter;
        private String name;
        private List<String> stats;

        public MyThreadFactory(String name) {
            counter = 0;
            this.name = name;
            stats = new ArrayList<>();
        }


        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, name + "Thread_" + counter);
            counter++;
            stats.add(String.format("Created thread%d with name %s on %s\n", t.getId(), t.getName(), new Date()));
            return t;
        }
    }


}
