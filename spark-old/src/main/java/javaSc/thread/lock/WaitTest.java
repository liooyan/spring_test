package javaSc.thread.lock;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 * object 类上关于线程的几个类
 * wait()
 * notify()
 * notifyAll()
 * 这些方法必须在以调用对象为锁的 同步块中。
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/9 4:35 下午
 */
public class WaitTest {


    public static void main(String[] args) {
        EventStorage eventStorage = new EventStorage();
        Generant generant = new Generant(eventStorage);
        Consumer consumer = new Consumer(eventStorage);
        new Thread(generant).start();
        new Thread(consumer).start();

    }
    public static class EventStorage {
        private int maxSize = 10;
        private Queue<Date> queue = new LinkedList<>();

        private synchronized void set() {
            while (queue.size() == maxSize) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.offer(new Date());
            System.out.printf("Set: %d\n", queue.size());

            notify();
        }

        private synchronized void get() {
            while (queue.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            final Date poll = queue.poll();
            System.out.printf("Get: %d %s\n", queue.size(),poll.toString());

            notify();
        }

    }


    public static class  Consumer implements  Runnable{
        EventStorage eventStorage;

        public Consumer(EventStorage eventStorage) {
            this.eventStorage = eventStorage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i ++){
                eventStorage.get();
            }
        }
    }

    public static class  Generant implements  Runnable{
        EventStorage eventStorage;

        public Generant(EventStorage eventStorage) {
            this.eventStorage = eventStorage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i ++){
                eventStorage.set();
            }

        }
    }
}
