package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the square triangle");
            System.out.println("2. Print isosceles triangle");
            System.out.println("3. Print the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++)
                            System.out.print("* ");
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= 7-i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <=2*i-1;k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
