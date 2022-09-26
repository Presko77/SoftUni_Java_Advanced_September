package Streams_Files_And_Directories_Lab;

import java.io.File;

public class P07List_Files {
    public static void main(String[] args) {


        String address = "resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams";
        File file = new File(address);

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n", f.getName(), f.length());
                    }
                }
            }
        }
    }
}