package com.domain.sangeetagupta.database_connectivity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PreparedEmpDao {
    boolean createTable();
    boolean insert(Employee employee) throws SQLException;
    boolean delete(int empno);
    boolean update(int empno,int newsal);
    boolean check(int empno);
    ArrayList<Employee> getAllRecords();
}
