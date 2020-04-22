package example;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(1);
        new MyThread1(c).start();
        new MyThread2(c).start();

    }
}

class MyThread1 extends Thread {
    private CountDownLatch c;
    public MyThread1(CountDownLatch c) {
        this.c = c;
    }


    @Override
    public void run() {
        System.out.println("A");
        try {
            c.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}

class MyThread2 extends Thread {
    private CountDownLatch c;
    public MyThread2(CountDownLatch c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println("B");
        c.countDown();
    }
}
