package com.java_learn.simple.simpleCalc;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("input first number: ");
        float num1 = userInput.nextInt();

        System.out.print("input second number: ");
        float num2 = userInput.nextInt();

        System.out.print("input math action: ");
        String action = userInput.nextLine();
        action = userInput.nextLine();

        if (action.equals("+")) finalResult(sum(num1, num2));
        if (action.equals("-")) finalResult(sub(num1, num2));
        if (action.equals("*")) finalResult(mul(num1, num2));
        if (action.equals("/")) finalResult(div(num1, num2));
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static void finalResult(float result) {
        System.out.println("Result is " + result);
    }
}
