package com.jetBrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Learn your squares and cubes!");
        Scanner scnr = new Scanner(System.in);
        int userInput = 0;
        int i = 0;
        String Loop = "y";
        String format = "%-16s%-16s%s%n";

        while (Loop.equals("y")) {
            System.out.println("Enter an integer:");
            userInput = scnr.nextInt();
            System.out.printf(format,"Number", "Squared", "Cubed");
            System.out.printf(format, "=======", "=======", "=======");
            for (i = 1; i < userInput + 1; i++) {
                System.out.printf(format, i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
            }

            System.out.print("Continue? (y/n): ");
            Loop = scnr.next();
            if (Loop.equals("y")) {
                continue;
            }
            else if (Loop.equals("n")) {
                System.out.println("Bye!");
                break;
            }
            while (!Loop.equals("y") && !Loop.equals("n")) {
                System.out.println("Type y or n!");
                Loop = scnr.next();
            };
        }
    }
}
