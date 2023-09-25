package com.mycompany.practice;

import java.util.Scanner;

/**
 *
 * @author singo pfano
 */
public class MyCalculator {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to my Calculator");
    System.out.println("Enter two numbers:");

    // Input the first number
    System.out.print("Number 1: ");
        double num1 = input.nextDouble();

        // Input the second number
    System.out.print("Number 2: ");
        double num2 = input.nextDouble();
        
    System.out.println("Choose an operation:");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");
        
        // Input the operation choice
    System.out.print("Enter the operation (1/2/3/4): ");
        int choice = input.nextInt();

        double result = 0;
        
        // Perform the selected operation
    switch (choice) {
        case 1:
    result = num1 + num2;
        break;
        case 2:
    result = num1 - num2;
        break;
        case 3:
    result = num1 * num2;
        break;
        case 4:
        if (num2 != 0) {
    result = num1 / num2;
      } else {
    System.out.println("Error: Division by zero");
    System.exit(1);
                }
        break;
          default:
    System.out.println("Invalid operation choice");
    System.exit(1);
       }

    System.out.println("Result: " + result);



    }
}
