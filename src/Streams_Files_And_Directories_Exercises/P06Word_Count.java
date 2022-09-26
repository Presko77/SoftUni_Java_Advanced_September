package Streams_Files_And_Directories_Exercises;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06Word_Count {
    public static void main(String[] args) throws IOException {

        Scanner wordScanner = new Scanner
                (new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt"));

        String[] wordsToSearch = wordScanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : wordsToSearch) {
            map.put(word, 0);
        }

        Scanner fileScanner = new Scanner(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt"));
        String singleWord = fileScanner.next();
        while (fileScanner.hasNext()) {
            if (map.containsKey(singleWord)){
                int occurences = map.get(singleWord);
                occurences++;
                map.put(singleWord, occurences);
            }
            singleWord= fileScanner.next();
        }
        PrintWriter pw = new PrintWriter(new FileWriter("result.txt"));
        map.forEach((key, value) -> pw.printf("%s - %d%n", key, value));
        fileScanner.close();
        wordScanner.close();
        pw.close();
    }
}

