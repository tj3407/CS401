package com.company;

public class ArrayTest {
    String[] firstNames = { "Dennis", "Grace", "Bjarne", "James" };
    String[] lastNames = new String[firstNames.length];

    void printNames() {
        for (int i = 0; i < firstNames.length; i++) {
            System.out.println(firstNames[i] + " " + lastNames[i]);
        }
//        int i = 0;
//        System.out.println(firstNames[i]
//                + " " + lastNames[i]);
//        i++;
//        System.out.println(firstNames[i]
//                + " " + lastNames[i]);
//        i++;
//        System.out.println(firstNames[i]
//                + " " + lastNames[i]);
//        i++;
//        System.out.println(firstNames[i]
//                + " " + lastNames[i]);
    }

    public static void main (String arguments[]) {
        ArrayTest a = new ArrayTest();
        a.printNames();
        System.out.println("-----");
        a.lastNames[0] = "Ritchie";
        a.lastNames[1] = "Hopper";
        a.lastNames[2] = "Stroustrup";
        a.lastNames[3] = "Gosling";
        a.printNames();
    }
}
