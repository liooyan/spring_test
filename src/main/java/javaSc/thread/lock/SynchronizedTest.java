package javaSc.thread.lock;

import java.util.concurrent.TimeUnit;

/**
 * synchronized 已同步
 * 停车厂用例。
 * 在停车厂中，可以停摩托车与汽车。
 *
 * 说明：
 * 1、在方法上使用synchronized 是当前 this。
 * 2、在静态方法上使用synchronized 是当前 class方法。
 * 3、其他情况需要传一个对象进来，其中：对于不停资源需要添加各自的锁。
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/9 4:08 下午
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        Payer payer = new Payer();
        ParkingStats parkingStats = new ParkingStats(payer);

        int numberSensors = 2 * Runtime.getRuntime().availableProcessors();
        Thread threads[] = new Thread[numberSensors];
        for (int i = 0; i < numberSensors; i++) {
            threads[i] = new Thread(new Sensor(parkingStats));
            threads[i].start();

        }
        for (int i = 0; i < numberSensors; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Number of cars:%d\n", parkingStats.getNumCar());
        System.out.printf("Number of motorcycles:%d\n", parkingStats.getNumMotorcycle());
        System.out.printf("收费:%d\n", payer.cash);


    }


    /**
     * 停车费计数器。
     */
    public static class Payer {
        private int cost = 2;
        private int cash = 0;

        public synchronized void pay() {
            cash += cost;
        }
    }

    /**
     * 停车计数器
     */
    public static class ParkingStats {
        private int numCar;
        private int numMotorcycle;
        private Payer payer;
        private Object carLock = new Object();
        private Object motorcycleLock = new Object();

        public ParkingStats(Payer payer) {
            this.payer = payer;
        }

        public void inCar() {
            synchronized (carLock) {
                numCar++;
            }
        }

        public void inMotorcycle() {
            synchronized (motorcycleLock) {
                numMotorcycle++;
            }
        }

        public void outCar() {
            synchronized (carLock) {
                numCar--;
            }
            payer.pay();

        }

        public void outMotorcycle() {
            synchronized (motorcycleLock) {
                numMotorcycle--;
            }
            payer.pay();
        }

        public int getNumCar() {
            return numCar;
        }

        public void setNumCar(int numCar) {
            this.numCar = numCar;
        }

        public int getNumMotorcycle() {
            return numMotorcycle;
        }

        public void setNumMotorcycle(int numMotorcycle) {
            this.numMotorcycle = numMotorcycle;
        }

        public Payer getPayer() {
            return payer;
        }

        public void setPayer(Payer payer) {
            this.payer = payer;
        }
    }

    /**
     * 执行器
     * Sensor 传感器
     */
    public static class Sensor implements Runnable {
        private ParkingStats parkingStats;

        public Sensor(ParkingStats parkingStats) {
            this.parkingStats = parkingStats;
        }

        @Override
        public void run() {
            parkingStats.inCar();
            parkingStats.inCar();

            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            parkingStats.inMotorcycle();
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            parkingStats.outCar();
            parkingStats.outCar();
            parkingStats.outMotorcycle();

        }
    }


}
