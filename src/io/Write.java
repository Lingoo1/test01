package io;

import java.io.*;

public class Write {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("src/os.txt");
        BufferedWriter bfw = new BufferedWriter(fr);
        bfw.write("我是天才！！！");
        bfw.write("4ooop");
        bfw.close();
    }
}
