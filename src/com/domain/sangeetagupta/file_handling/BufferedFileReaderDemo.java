package com.domain.sangeetagupta.file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {
    public static void main(String... args) {
        FileReader fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            //full file path
            long startTime = System.currentTimeMillis();
            //useful for reading and writing textual data(UNICODE supported)
            fileInputStream = new FileReader("/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/file_handling/source.txt");
            bufferedReader = new BufferedReader(fileInputStream);
            String string;

            //int character
//            while ((character = bufferedReader.read()) != -1);
            while ((string = bufferedReader.readLine())!= null);

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
