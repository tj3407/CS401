package com.company.ComputerAssist;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssist {
    private static final SecureRandom randomNum = new SecureRandom();
    private static int random1;
    private static int random2;
    private static enum Feedback { GOOD, EXCELLENT, NICE, KEEPUP };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char selection = 'y';

        do {
            random1 = randomNum.nextInt(10);
            random2 = randomNum.nextInt(10);
            generateQuestion(random1, random2);
            int answer = input.nextInt();
            while (answer != random1 * random2) {
                generateIncorrectResponse();
                answer = input.nextInt();
            }

            generateCorrectResponse();
            System.out.println("Want to try again?");
            selection = input.next().charAt(0);
        } while (selection != 'n');

        System.out.println("Thanks for playing. Goodbye!");
    }

    public static void generateCorrectResponse() {
        switch (randomNum.nextInt(4)) {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public static void generateIncorrectResponse() {
        switch (randomNum.nextInt(4)) {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void generateQuestion(int x, int y) {
        System.out.println("How much is " + x + " times " + y);
    }
}
