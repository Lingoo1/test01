package example;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Meeting());
        for (int i = 0; i < 5; i++) {
            new EmployeeThread("員工" + i, cyclicBarrier).start();
        }

    }

}

class Meeting implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始召开会议");
    }
}

class EmployeeThread extends Thread {
    private String name;
    private CyclicBarrier cyclicBarrier;

    public EmployeeThread(String name, CyclicBarrier cyclicBarrier) {
        super(name);
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "进入会议室");
            cyclicBarrier.await();
        } catch (Exception ignored) {
        }
    }
}
