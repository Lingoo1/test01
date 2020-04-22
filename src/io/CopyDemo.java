package io;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        try (
                FileInputStream is = new FileInputStream("src/os.txt");
                BufferedInputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("src/copy01.txt");
                BufferedOutputStream bos = new BufferedOutputStream(os);

        ) {
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
