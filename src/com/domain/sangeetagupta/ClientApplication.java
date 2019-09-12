package com.domain.sangeetagupta;

import java.util.Scanner;

public class ClientApplication {

    //student list declaration
    private static Student[] students;

    //this displays all student records in the list. If list is empty, displays empty student list message
    private static void displayAllStudents() {
        if (Student.count == 0 || students == null) {
            System.out.println("Student list is empty!");
        } else {
            for (Student student : students) {
                System.out.println("Student name: " + student.getName());
                System.out.println("Student rollNo: " + student.getRollNo());
                System.out.println("Student marks: " + student.getMarks());
                student.calculateGrade();
                System.out.println("\n\n");
            }
        }
    }

    //this provides the exit statement for loop
    private static void exit() {
        System.out.println("Thank you. Bye bye.");
    }

    //this displays a particular student record
    private static void displayStudent(Student student) {
        System.out.println("Student name: " + student.getName());
        System.out.println("Student rollNo: " + student.getRollNo());
        System.out.println("Student marks: " + student.getMarks());
        student.calculateGrade();
        System.out.println("\n\n");
    }

    //this sorts student list based on name in ascending order
    private static void sortAllStudentsByName() {
        Student tempStudent;
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getName().compareTo(students[j].getName()) > 0) {
                    tempStudent = students[i];
                    students[i] = students[j];
                    students[j] = tempStudent;
                }
            }
        }
    }

    //this searches for a particular student record. If student record not found returns null
    private static Student searchStudent(int rollNo) {
        for(int i = 0; i<students.length; i++){
            if(rollNo == students[i].getRollNo()){
                return students[i];
            }
        }
        return null;
    }

    //this inserts student record to the list. If student list is full, displays overflown list message
    private static void insertStudent() {
        if (Student.count == students.length) {
            System.out.println("Student list is full!Cannot add more student records!");
            return;
        }

        //local variable declaration
        String studentName;
        float studentMarks;

        //initialization of Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        //student name initialization to user input
        System.out.println("Enter new student details: ");
        System.out.println("Student name: ");
        studentName = scanner.next();

        //student marks initialization to user input
        System.out.println("Student marks: ");
        studentMarks = scanner.nextFloat();

        //inserting student record to list
        students[Student.count] = new Student(studentName, studentMarks);
        System.out.println("Student Record Inserted!");
    }

    public static void main(String... args) {

        //initialization of local variables
        int optionValue = 0;
        Scanner scanner = new Scanner(System.in);

        //initialization of student list
        students = new Student[3];

        //this displays the menu to user in loop until user provides exit option
        while (optionValue != -1) {
            System.out.println("Welcome to Student Marks Portal!");

            System.out.println("\n\nAvailable options: ");
            System.out.println("1.Insert student record");
            System.out.println("2.Display all student records");
            System.out.println("3.Search for student record");
            System.out.println("4.Sort all students");
            System.out.println("5.Exit");

            System.out.println("\nEnter your choice: ");
            optionValue = scanner.nextInt();

            switch (optionValue) {

                case 1:
                    //this calls function for inserting student record
                    insertStudent();
                    System.out.println("Last Student record inserted: ");
                    displayStudent(students[Student.count - 1]);
                    break;

                case 2:
                    //this calls function for displaying all student records
                    displayAllStudents();
                    break;

                case 3:
                    //this asks user for the student roll number and calls search record function
                    System.out.println("Enter rollNumber: ");
                    int rollNumber = scanner.nextInt();
                    Student searchedStudent = searchStudent(rollNumber);
                    if (searchedStudent == null) {
                        System.out.println("Student record not found!");
                    } else {
                        displayStudent(searchedStudent);
                    }
                    break;
                case 4:
                    //this calls function for sorting student records and thus displays the list again
                    if (students == null) {
                        System.out.println("Student list is empty!");
                    } else {
                        sortAllStudentsByName();
                        System.out.println("Sorted student list is: ");
                        displayAllStudents();
                    }
                    break;
                case 5:
                    //this exits the loop
                    exit();
                    optionValue = -1;
                    break;

                default:
                    //this provides statement in case unrecognized option is entered
                    System.out.println("Oops! Option not available. Try again!");
                    break;

            }//switch ends
        }//while ends
    }//main ends
}//class ends
