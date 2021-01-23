package com.company.Student;

import com.company.Student.Student;

public class Undergrad extends Student {
    String capstone;
    int numOfInternships;

    void PrintUndergrad() {
        System.out.println("Capstone: " + capstone);
        System.out.println(("Number of internships: " + numOfInternships));
    }

    Undergrad(String n, int a, int s, String advisor) {
        super(n, a, s, advisor);
    }
}
