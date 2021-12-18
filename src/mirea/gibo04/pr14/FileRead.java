package mirea.gibo04.pr14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\slays\\Desktop\\Test.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line);
        }
        br.close();
    }
}
