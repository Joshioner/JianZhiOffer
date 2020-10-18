package com.example.davie.code.setExample;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int sex;

    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        Student s1 = new Student();
        Student s2 = new Student();
        set.add(s1);
        set.add(s2);
        System.out.println(set.toArray().toString());
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }
}
