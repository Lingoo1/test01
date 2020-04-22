package example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小红");
        list.add("小黑");

        //第一版
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //第二版
        list.forEach((String s) -> {
            System.out.println(s);
        });

        //第三版
        list.forEach( s-> {
            System.out.println(s);
        });

        //第四版
        list.forEach( s-> System.out.println(s));

        //第五版
        list.forEach(System.out::println);
    }
}
