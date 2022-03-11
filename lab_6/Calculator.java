package lab_6;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scan = new Scanner(System.in);
       System.out.println("enter the first number");
       num1 = scan.nextInt();
       System.out.println("enter the operator");
       operator = scan.nextLine();
       System.out.println("enter the second number");
       num2 = scan.nextInt();
       
        switch(operator) {
        case "+":
        	add(num1, num2);
        }
    }

    public String add(int a, int b) {
        /**
         * Enter logic
         */
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
    }
}