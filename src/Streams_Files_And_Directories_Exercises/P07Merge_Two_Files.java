package Streams_Files_And_Directories_Exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        List<String> mergedList = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader
                ("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt"));
        while (scanner.hasNextLine()) {
            mergedList.add(scanner.nextLine());
        }
        scanner = new Scanner(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt"));
        while (scanner.hasNextLine()) {
            mergedList.add(scanner.nextLine());
        }
        scanner.close();

        PrintWriter writer = new PrintWriter(new FileWriter("outputMerged.txt"));
        for (String line : mergedList) {
            writer.println(line);
        }
        writer.close();

    }
}