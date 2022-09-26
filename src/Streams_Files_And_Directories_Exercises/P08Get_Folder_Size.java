package Streams_Files_And_Directories_Exercises;

import java.io.File;

public class P08Get_Folder_Size {
    public static void main(String[] args) {

        String folderPath = "resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources";
        long folderSize = getDirectorySize(new File(folderPath));
        System.out.printf("Folder size: %d", folderSize);
    }

    public static long getDirectorySize(File dir) {

        long length = 0;
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile())
                    length += file.length();
                else
                    length += getDirectorySize(file);
            }
        }
        return length;
    }
}