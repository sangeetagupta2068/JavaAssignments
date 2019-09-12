package com.domain.sangeetagupta.demo_exception_handling;

import java.util.Scanner;

public class UserDemo {

    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);
        String username, password;

        try{
            scanner = new Scanner(System.in);
            System.out.println("Enter username");
            username = scanner.next();

            System.out.println("Enter password");
            password = scanner.next();

            User user = new User(username,password);

        }catch(InvalidUserException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
