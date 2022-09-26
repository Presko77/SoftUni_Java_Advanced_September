package Streams_Files_And_Directories_Lab;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class P08Nested_Folders {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File root = new File("resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;

        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] filesList = current.listFiles();
            if (filesList != null) {
                for (File file : filesList) {
                    if (file.isDirectory()) dirs.offer(file);
                }
            }
            System.out.println(current.getName());
            count++;
        }
        System.out.println(count + " folders");
    }
}

