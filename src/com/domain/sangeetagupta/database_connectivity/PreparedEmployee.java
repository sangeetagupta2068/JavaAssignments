package com.domain.sangeetagupta.database_connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class PreparedEmployee implements PreparedEmpDao {
    @Override
    public boolean createTable() {
        return false;
    }

    @Override
    public boolean insert(Employee employee) {
        Connection connection = DBConnection.getConnection();
        String query = "insert into employee values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employee.getEmployeeId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setInt(3, employee.getSalary());

            int record = preparedStatement.executeUpdate();
            if (record == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean delete(int empno) {
        if (!check(empno)) {
            return false;
        }
        Connection connection = DBConnection.getConnection();
        String query = "delete from employee where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, empno);
            int record = preparedStatement.executeUpdate();
            if (record == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean update(int empno, int newsal) {
        if (!check(empno)) {
            return false;
        }
        Connection connection = DBConnection.getConnection();
        String query = "update employee set salary = ? where id =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, newsal);
            preparedStatement.setInt(2, empno);
            int record = preparedStatement.executeUpdate();
            if (record == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean check(int empno) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where id=?");
            preparedStatement.setInt(1, empno);
            int record = preparedStatement.executeUpdate();
            if (record == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public ArrayList<Employee> getAllRecords() {
        ArrayList<Employee> employees = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                employees.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
