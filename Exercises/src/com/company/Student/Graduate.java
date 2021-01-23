package com.company.Student;

import com.company.Student.Student;

public class Graduate extends Student {
    String thesis;
    int numOfPapers;

    Graduate(String n, int a, int s, String advisor) {
        super(n, a, s, advisor);
    }

    void PrintGradInfo() {
        System.out.println("Thesis: " + thesis);
        System.out.println(("Number of Research Papers: " + numOfPapers));
    }
}
