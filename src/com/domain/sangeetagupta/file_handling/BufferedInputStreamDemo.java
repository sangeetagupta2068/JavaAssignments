package com.domain.sangeetagupta.file_handling;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String... args) {
        //one posibility : file present, if file not found then exception is thrown
        //copy jpeg file,zip file
        //meant for binary data such as images, videos etc. Can use it for TEXTUAL data provided it contains only ascii values.
        FileInputStream fileInputStream = null;

        BufferedInputStream bufferedInputStream = null;

        //file is present -> then loaded and overwritten, else new file created.
        FileOutputStream fileOutputStream = null;

        try {
            //full file path
            long startTime = System.currentTimeMillis();
            //useful for reading and writing ascii characters
            fileInputStream = new FileInputStream("/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/file_handling/panda.jpeg");
            fileOutputStream = new FileOutputStream("/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/file_handling/panda_new.jpeg");
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            int character;

            while ((character = bufferedInputStream.read()) != -1) {
                System.out.println((char) character);
            }

            System.out.println(System.currentTimeMillis() - startTime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                bufferedInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
