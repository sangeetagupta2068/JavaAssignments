package com.domain.sangeetagupta;

public class Student implements Comparable<Student>{

    public static int count = 0;

    private String name;
    private int rollNo;
    private int age;
    private float marks;

    public Student() {
        count = count + 1;
        this.rollNo = count;
    }

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;

        count = count + 1;
        this.rollNo = count;
    }

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        if(age >=20 && age<=25) {
            this.age = age;
        }else{
            System.out.println("Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("Rollno" + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String toString(){
        return name + " " + marks + " " + age;
    }

    public void calculateGrade() {
        if (marks <= 100.0f && marks >= 80.0f) {
            System.out.println("Student Grade : A");
        } else {
            if (marks <= 79.0f && marks >= 60.0f) {
                System.out.println("Student Grade : B");
            } else {
                if (marks <= 59.0f && marks >= 40.0f) {
                    System.out.println("Student Grade : C");
                } else {
                    System.out.println("Student Grade : Failed");
                }
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
}
