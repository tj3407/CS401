package com.company.HealthProfile;

import java.util.Scanner;

public class HealthProfileApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Gender: ");
        String gender = input.nextLine();

        System.out.print("Enter Birth Month: ");
        String month = input.nextLine();

        System.out.print("Enter Birth Day: ");
        String day = input.nextLine();

        System.out.print("Enter Birth Year: ");
        String year = input.nextLine();

        System.out.print("Enter Height (inches): ");
        String height = input.nextLine();

        System.out.print("Enter Weight (pounds): ");
        String weight = input.nextLine();

        HealthProfile person1 = new HealthProfile(firstName, lastName, gender, Integer.parseInt(month), Integer.parseInt(day), Integer.parseInt(year), Integer.parseInt(height), Integer.parseInt(weight));
        System.out.println("********************");

        System.out.println(person1.toString());
    }
}
