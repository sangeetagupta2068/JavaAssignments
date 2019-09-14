package com.domain.sangeetagupta.database_connectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {
    private static void update(int empno, int newsal){
        Connection connection = DBConnection.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall("{call increasesalary(?,?)}");
            callableStatement.setInt(1,empno);
            callableStatement.setInt(2,newsal);
            if(callableStatement.execute()){
                System.out.println("Updated record!");
            } //returns boolean
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displaySalary(int empno){
        Connection connection = DBConnection.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall("{call get_salary(?,?)}");
            callableStatement.setInt(1,empno);
            callableStatement.registerOutParameter(2, Types.DECIMAL);
            callableStatement.execute();

            int sal = callableStatement.getInt(2);
            System.out.println(sal);
            if(callableStatement.execute()){
                System.out.println("Updated record!");
            } //returns boolean
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String... args){
        update(1,4000);
        displaySalary(1);
    }
}
