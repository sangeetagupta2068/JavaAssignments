package com.domain.sangeetagupta.collection_demo;

import com.domain.sangeetagupta.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String... args) {
        Student student1 = new Student("Sangeeta", 3, 25);
        Student student2 = new Student("Dhannu", 4, 26);
        Student student3 = new Student("Mannu", 6, 28);

        TreeSet<Student> treeSet = new TreeSet<>();
        //add takes the object of a class which implements Comparable
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        System.out.println(treeSet);

        //assuming student is third party
        TreeSet<Student> treeSet2 = new TreeSet<>(new StudentNameSort());
        treeSet2.add(student1);
        treeSet2.add(student2);
        treeSet2.add(student3);

        System.out.println(treeSet2);

    }
}
