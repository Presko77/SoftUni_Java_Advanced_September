package Streams_Files_And_Directories_Exercises;

import java.io.*;
import java.util.Locale;

public class P03ALL_CAPITALS {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =  new BufferedReader
                (new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));

        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        bufferedReader.lines().forEach(line -> pw.println(line.toLowerCase()));
        bufferedReader.close();
        pw.close();
    }
}
