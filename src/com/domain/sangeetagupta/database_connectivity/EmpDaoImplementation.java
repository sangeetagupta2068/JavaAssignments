package com.domain.sangeetagupta.database_connectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Data access object implementation class
public class EmpDaoImplementation implements EmpDao {

    @Override
    public boolean createTable() {
        Connection connection = DBConnection.getConnection();
        try{
            Statement statement = connection.createStatement();
            String query = "create table employee(id int,name varchar(30),int salary)";
            statement.executeUpdate(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    //CRUD operations
    @Override
    public boolean insert(Employee employee) {
        Connection connection = DBConnection.getConnection();
        try{
            Statement statement = connection.createStatement();
            String query = "insert into employee values(" + employee.getEmployeeId() + ",'"+employee.getName() + "',"+employee.getSalary() + ")";
            int record = statement.executeUpdate(query);
            if(record == 1){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int empno) {
        Connection connection = DBConnection.getConnection();
        if(!check(empno)){
            return false;
        }
        try {
            Statement statement = connection.createStatement();
            String query = "delete from employee where id ="+empno;
            int record = statement.executeUpdate(query);
            if (record == 1) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int empno, int newsal) {
        if(!check(empno)){
            return false;
        }
        Connection connection = DBConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "update employee set salary="+newsal+" where id="+empno;
            int record = statement.executeUpdate(query);
            if (record == 1) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean check(int empno) {
        Connection connection = DBConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from employee where id=" + empno;
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Employee> getAllRecords() {
        Connection connection = DBConnection.getConnection();
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from employee";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                Employee employee = new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3));
                System.out.println(employee);
                employees.add(employee);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return employees;
    }
}
