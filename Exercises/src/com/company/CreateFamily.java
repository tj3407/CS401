package com.company;

public class CreateFamily {

    public static void main(String[] args) {
	// write your code here
        Family f1, f2;

        f1 = new Family();
        f1.firstname = "jack";
        f1.age = 99;
        System.out.println(f1.firstname + " " + f1.lastname + " is " + f1.age + " years old");

        f2 = new Family();
        f2.firstname = "sally";
        f2.lastname = "Field";
        f2.age = 39;
        System.out.println(f2.firstname + " " + f2.lastname + " is " + f2.age + " years old");
    }
}
