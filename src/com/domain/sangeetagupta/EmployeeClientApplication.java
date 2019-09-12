package com.domain.sangeetagupta;

import java.util.Scanner;

public class EmployeeClientApplication {

    //student list declaration
    private static Employee[] employees;

    //this displays all employee records in the list. If list is empty, displays empty employee list message
    private static void displayAllEmployees() {
        if (Employee.count == 0 || employees == null) {
            System.out.println("Employee list is empty!");
        } else {
            for (Employee employee : employees) {
                System.out.println("Employee name: " + employee.getName());
                System.out.println("Employee id: " + employee.getId());
                System.out.println("Employee salary: " + employee.getSalary());
                employee.calculateGrossSalary();
                System.out.println("\n\n");
            }
        }
    }

    //this provides the exit statement for loop
    private static void exit() {
        System.out.println("Thank you. Bye bye.");
    }

    //this displays a particular employee record
    private static void displayEmployee(Employee employee) {
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee id: " + employee.getId());
        System.out.println("Employee salary: " + employee.getSalary());
        employee.calculateGrossSalary();
        System.out.println("\n\n");
    }

    //this sorts employee list based on name in ascending order
    private static void sortAllEmployeesByName() {
        Employee tempEmployee;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    tempEmployee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tempEmployee;
                }
            }
        }
    }

    //this searches for a particular employee record. If employee record not found returns null
    private static Employee searchEmployee(int id) {
        for(int i = 0; i<employees.length; i++){
            if(id == employees[i].getId()){
                return employees[i];
            }
        }
        return null;
    }

    //this inserts employee record to the list. If student list is full, displays overflown list message
    private static void insertEmployee() {
        if (Employee.count == employees.length) {
            System.out.println("Employee list is full!Cannot add more student records!");
            return;
        }

        //local variable declaration
        String employeeName;
        float employeeSalary;

        //initialization of Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        //name initialization to user input
        System.out.println("Enter new employee details: ");
        System.out.println("Employee name: ");
        employeeName = scanner.next();

        //salary initialization to user input
        System.out.println("Employee salary: ");
        employeeSalary = scanner.nextFloat();

        //inserting employee record to list
        employees[Employee.count] = new Employee(employeeName, employeeSalary);
        System.out.println("Employee Record Inserted!");
    }

    public static void main(String... args) {

        //initialization of local variables
        int optionValue = 0;
        Scanner scanner = new Scanner(System.in);

        //initialization of employee list
        employees = new Employee[3];

        //this displays the menu to user in loop until user provides exit option
        while (optionValue != -1) {
            System.out.println("Welcome to Employee Portal!");

            System.out.println("\n\nAvailable options: ");
            System.out.println("1.Insert employee record");
            System.out.println("2.Display all employee records");
            System.out.println("3.Search for employee record");
            System.out.println("4.Sort all employees");
            System.out.println("5.Exit");

            System.out.println("\nEnter your choice: ");
            optionValue = scanner.nextInt();

            switch (optionValue) {

                case 1:
                    //this calls function for inserting employee record
                    insertEmployee();
                    System.out.println("Last Employee record inserted: ");
                    displayEmployee(employees[Employee.count - 1]);
                    break;

                case 2:
                    //this calls function for displaying all employee records
                    displayAllEmployees();
                    break;

                case 3:
                    //this asks user for the employee id and calls search record function
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    Employee searchedEmployee = searchEmployee(id);
                    if (searchedEmployee == null) {
                        System.out.println("Employee record not found!");
                    } else {
                        displayEmployee(searchedEmployee);
                    }
                    break;
                case 4:
                    //this calls function for sorting employee records and thus displays the list again
                    if (employees == null) {
                        System.out.println("Student list is empty!");
                    } else {
                        sortAllEmployeesByName();
                        System.out.println("Sorted employee list is: ");
                        displayAllEmployees();
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

