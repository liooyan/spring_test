package javaSc.thread.lock;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写保护锁
 * {@link ReadWriteLock}
 * 在这个锁中，有read 和write 锁
 * 当进入 write 锁后，所有的read 锁将被拦截，当write 锁释放后才可以今日read锁。
 * 并且 write 和普通的lock性质相同。
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/13 9:13 下午
 */
public class ReadWriteLockTest {


    public static void main(String[] args) {
        PricesInfo pricesInfo =new PricesInfo();
        Reader  readers[] = new Reader[5];
        Thread threadReader[] = new Thread[5];
        for (int i = 0 ;i < 5 ; i++){
            readers[i] = new Reader(pricesInfo);
            threadReader[i] = new Thread(readers[i]);
        }

        Writer  writers = new Writer(pricesInfo);
        Thread threadWriter = new Thread(writers);
        for (int i = 0 ;i < 5 ; i++){
            threadReader[i].start();
        }
        threadWriter.start();
    }



    private static class PricesInfo{
        private double price1;

        private double price2;

        private ReadWriteLock readWriteLock;


        private  PricesInfo(){
            price1 = 0;
            price2 = 0;
            readWriteLock = new ReentrantReadWriteLock();
        }

        public double getPrice1() {
            readWriteLock.readLock().lock();
            double price1 = this.price1;
            readWriteLock.readLock().unlock();
            return price1;
        }

        public double getPrice2() {
            readWriteLock.readLock().lock();
            double price2 = this.price2;
            readWriteLock.readLock().unlock();
            return price2;
        }

        public void setPrice(double price1, double price2) {
            readWriteLock.writeLock().lock();
            System.out.printf("%s:PricesInfo:Write Lock Adquited.\n",new Date());
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.price1 = price1;
            this.price2 = price2;
            System.out.printf("%s:PricesInfo:Write unlock Adquited.\n",new Date());
            readWriteLock.writeLock().unlock();
        }


    }
    public static class Reader implements Runnable{

        private PricesInfo pricesInfo;

        public Reader(PricesInfo pricesInfo) {
            this.pricesInfo = pricesInfo;
        }

        @Override
        public void run() {

            for (int i = 0; i < 20 ; i ++){
                System.out.printf("%s: %s: Price1: %f\n",new Date(),Thread.currentThread().getName(),pricesInfo.getPrice1());
                System.out.printf("%s: %s: Price2: %f\n",new Date(),Thread.currentThread().getName(),pricesInfo.getPrice2());
            }

        }
    }
    public static class Writer implements Runnable{

        private PricesInfo pricesInfo;

        public Writer(PricesInfo pricesInfo) {
            this.pricesInfo = pricesInfo;
        }

        @Override
        public void run() {

            for (int i = 0; i < 3 ; i ++){
                System.out.printf("%s: Writer:Attempt to modify the prices.\n",new Date());
                pricesInfo.setPrice(Math.random()*10,Math.random()*8);
                System.out.printf("%s: Writer:Prices have been modified.\n",new Date());
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
