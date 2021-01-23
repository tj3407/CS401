package com.company.Student;

public class Student {
    String Name;
    int age;
    int SSNum;
    String Advisor;

    public Student(String n, int a, int s, String advisor) {
        Name = n;
        age = a;
        SSNum = s;
        Advisor = advisor;
    }

    public  Student() {

    }

    void PrintInfo() {
        System.out.println("Name: " + Name);
        System.out.println("age: " + age);
        System.out.println("SS# : " + SSNum);
        System.out.println("Advisor: " + Advisor);
    }
}
