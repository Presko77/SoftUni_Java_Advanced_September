package Streams_Files_And_Directories_Lab;

import java.io.*;

public class P03Copy_Bytes {
    public static void main(String[] args) throws IOException {

        String path = "resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("outputPath");
        int oneByte = inputStream.read();
        while (oneByte > -1) {
            if (oneByte != 10 && oneByte != 32) {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    outputStream.write(digits.charAt(i));
                }
            } else {
                outputStream.write((char) oneByte);
            }
            oneByte = inputStream.read();
        }
    }
}