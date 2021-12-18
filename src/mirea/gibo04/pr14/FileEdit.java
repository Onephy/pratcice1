package mirea.gibo04.pr14;

import java.io.*;
import java.nio.file.*;

public class FileEdit {
    public static void main(String[] args) {
        String filePath = "/home/user/Desktop/project/src/myfile.txt";
        String text = "Hello world!\n";

        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
