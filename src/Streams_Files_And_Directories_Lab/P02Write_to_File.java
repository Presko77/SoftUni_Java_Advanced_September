package Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02Write_to_File {
    public static void main(String[] args) throws IOException {

        String path = "resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

            FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

            int bytes = fileInputStream.read();

        Set<Character> punctuationTable = Set.of(',','.' ,'!','?');

            while ( bytes != -1) {

                char symbol = (char)bytes;

                boolean isPunctuation = punctuationTable.contains(symbol);
                if (!isPunctuation){
                    outputStream.write(symbol);
                }

                bytes = fileInputStream.read();
            }

        }

    }

