package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("src/os.txt");
            BufferedReader bfr = new BufferedReader(fr);

            //傳統寫法
           /* char[] buffer = new char[1024];
            int len = 0;
            while ((len = bfr.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }*/
            //經典寫法
            String line;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
