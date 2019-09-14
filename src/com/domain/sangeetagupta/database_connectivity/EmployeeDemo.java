package com.domain.sangeetagupta.database_connectivity;

import java.util.ArrayList;

public class EmployeeDemo {

    private static void addRecord(Employee employee){
        PreparedEmployee preparedEmployee = new PreparedEmployee();
        preparedEmployee.insert(employee);
    }

    private static void display(){
        PreparedEmployee preparedEmployee = new PreparedEmployee();
        ArrayList<Employee> employees = preparedEmployee.getAllRecords();
        for (Employee employee:
            employees ) {
            System.out.println(employee);
        }
    }
    public static void main(String... args){
        Employee employee = new Employee(1,"Sangeeta",300);
        addRecord(employee);
        display();

//        EmpDao empDao = new EmpDaoImplementation();
//        empDao.createTable();
//        empDao.insert(employee);

    }
}
