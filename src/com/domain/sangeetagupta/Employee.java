package com.domain.sangeetagupta;

public class Employee {
    private int id;
    public static int count = 0;
    private String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;

        count = count + 1;
        id = count;
    }

    public Employee() {
        count = count + 1;
        id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public void calculateGrossSalary() {
        float grossSalary = (0.10f * salary) + (0.07f * salary) + (0.08f * salary) + salary;
        System.out.println("Employee Gross salary: " + grossSalary);
    }

}
