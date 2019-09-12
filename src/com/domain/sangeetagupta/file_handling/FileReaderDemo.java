package com.domain.sangeetagupta.file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String... args) {
        FileReader fileInputStream = null;

        try {
            //full file path
            long startTime = System.currentTimeMillis();
            //useful for reading and writing textual data(UNICODE supported)
            fileInputStream = new FileReader("/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/file_handling/source.txt");
            int character;

            while ((character = fileInputStream.read()) != -1);

            System.out.println(System.currentTimeMillis()-startTime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
