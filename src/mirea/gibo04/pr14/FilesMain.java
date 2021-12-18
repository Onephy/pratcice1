package mirea.gibo04.pr14;

import java.io.*;
import java.io.*;
import java.util.*;

public class FilesMain {
    // запись в файл
    public static void main(String[] args) {

        Scanner reader = null;
        FileWriter writer = null;
        String inputText;

        try {

            reader = new Scanner(System.in);

            writer = new FileWriter("C:\\Users\\slays\\Desktop\\Test.txt");

            while (true) {

                inputText = reader.nextLine();

                if (inputText.equals("EXIT")) {
                    break;
                }

                writer.write(inputText);

                writer.write("\n");

            }

        } catch (IOException e) {

            System.out.println("A fatal exception occurred!");

        } finally {

            if (reader != null) {
                reader.close();
            }

            try {

                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {

                System.out.println("Closing was not successful.");

            }

        }

    }
}
