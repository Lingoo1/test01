package example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapBingFaDemo {
//    public static Map<String, String> maps = new HashMap<>();
//    public static Map<String, String> maps = new Hashtable<>();
    public static Map<String, String> maps = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        MyRunable target1 = new MyRunable("线程1");
        MyRunable target2 = new MyRunable("线程2");
        Thread t1 = new Thread(target1);
        Thread t2 = new Thread(target2);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(maps.size());

    }


}

//任务类
class MyRunable implements Runnable {
    public MyRunable(String name) {
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            MapBingFaDemo.maps.put(Thread.currentThread().getName() +""+ i, i+"");
        }
    }

}
