package Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P04Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }else{
                scanner.next();
            }
        }

    }
}
