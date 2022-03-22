package com.java_learn.simple.simpleCalc;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float result = 0;

        System.out.print("input first number: ");
        float num1 = userInput.nextInt();

        System.out.print("input second number: ");
        float num2 = userInput.nextInt();

        System.out.print("input math action: ");
        String action = userInput.nextLine();
        action = userInput.nextLine();

        switch (action) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) System.out.println("ALARM!");
                else result = num1 / num2;
                break;
            default:
                System.out.println("LOL");
        }
        System.out.print(result);
    }
}
