package org.example;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addNumber() {
        return num1 + num2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + calculator.addNumber());
    }

}

