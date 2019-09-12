package com.domain.sangeetagupta.file_handling;


import java.io.*;

public class BookDemo {
    public static void main(String... args) {
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/sangeetagupta/IdeaProjects/" +
                    "JavaAssignments/src/com/domain/sangeetagupta/file_handling/book.dat"));

            //objects which exist in memory
            Book book1 = new Book(1, "Java", 300.0f);
            Book book2 = new Book(2, "C", 400.0f);
            Book book3 = new Book(3, "Python", 500.0f);

            objectOutputStream.writeObject(book1);
            objectOutputStream.writeObject(book2);
            objectOutputStream.writeObject(book3);

        } catch (FileNotFoundException e) {
            //subclass of IOException. Hence handled first
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //One way
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("/Users/sangeetagupta/IdeaProjects/" +
                    "JavaAssignments/src/com/domain/sangeetagupta/file_handling/book.dat"));

            //object input stream doesn't give EOF marker, hence can't use the conventional style
            //buffered reader null
            //will throw EOFException
            Object object;
            while ((object = objectInputStream.readObject()) != null) {
                Book book = (Book) object;
                book.display();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
//            e.printStackTrace();
            System.out.println("All objects read!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Second way (Preferrable)
        ObjectInputStream objectInputStream2 = null;
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream("/Users/sangeetagupta/IdeaProjects/" +
                    "JavaAssignments/src/com/domain/sangeetagupta/file_handling/book.dat");
            objectInputStream2 = new ObjectInputStream(fileInputStream);

            //object input stream doesn't give EOF marker, hence can't use the conventional style
            //buffered reader null
            //will throw EOFException
            Object object;
            while (fileInputStream.available() > 0) {
                object = objectInputStream2.readObject();
                //because price is transient, hence 0.0 would be displayed as price for all
                ((Book) object).display();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //file input stream automatically closed.
            try {
                objectInputStream2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
