package com.domain.sangeetagupta.file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String... args) {
        FileInputStream fileInputStream = null;

        try {
            //full file path
            long startTime = System.currentTimeMillis();
            //useful for reading and writing ascii characters
            fileInputStream = new FileInputStream("/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/" +
                    "domain/sangeetagupta/file_handling/source.txt");
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
