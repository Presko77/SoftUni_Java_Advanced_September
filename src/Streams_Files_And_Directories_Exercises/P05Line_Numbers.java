package Streams_Files_And_Directories_Exercises;

import java.io.*;

public class P05Line_Numbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader
                ("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt"));
        PrintWriter wr = new PrintWriter(new FileWriter("output.txt"));
        String line = br.readLine();
        int counter = 1;
        while (line != null) {
            wr.println(counter + ". " + line);
            counter++;
            line = br.readLine();
        }
        br.close();
        wr.close();
    }
}
