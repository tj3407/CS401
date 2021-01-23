package com.company;

public class School {
    public static void main(String[] args) {
        Undergrad undergrad = new Undergrad("John Doe", 20, 11111111, "Jane Doe");
        Graduate graduate = new Graduate("Jake Bell", 25, 222222222, "Kelly Bell");

        undergrad.capstone = "Advanced Java";
        undergrad.numOfInternships = 4;

        graduate.thesis = "AI in the workplace";
        graduate.numOfPapers = 3;

        undergrad.PrintInfo();
        undergrad.PrintUndergrad();
        System.out.println("**************");

        graduate.PrintInfo();
        graduate.PrintGradInfo();
    }
}
