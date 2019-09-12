package com.domain.sangeetagupta.demo_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceDemo {
    public static void main(String... args) {
        //Exception happens or not, this resource will be closed (Java 1.7)
        try(FileInputStream fileInputStream = new FileInputStream("/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/" +
                "domain/sangeetagupta/file_handling/source.txt")) {
            //full file path
            long startTime = System.currentTimeMillis();
            //useful for reading and writing ascii characters
            int character;

            while ((character = fileInputStream.read()) != -1);

            System.out.println(System.currentTimeMillis()-startTime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
