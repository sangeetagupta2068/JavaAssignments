package com.domain.sangeetagupta.database_connectivity;

import java.util.ArrayList;

public interface EmpDao {
    boolean createTable();
    boolean insert(Employee employee);
    boolean delete(int empno);
    boolean update(int empno,int newsal);
    boolean check(int empno);
    ArrayList<Employee> getAllRecords();
}
