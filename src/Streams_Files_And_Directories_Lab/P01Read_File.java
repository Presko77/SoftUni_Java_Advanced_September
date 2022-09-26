package Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class P01Read_File {
    public static void main(String[] args) {

        String path = "resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int bytes = fileInputStream.read();

            while ( bytes != -1) {

                    System.out.print(Integer.toBinaryString(bytes) + " ");

                bytes = fileInputStream.read();
            }
            System.out.println();
        }catch (IOException ignored) {

        }

    }
}
