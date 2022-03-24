package com.java_learn.simple.simpleCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("input first number: ");
        float num1 = userInput.nextInt();

        System.out.print("input second number: ");
        float num2 = userInput.nextInt();

        System.out.print("input math action: ");
        String action = userInput.nextLine();
        action = userInput.nextLine();

        SimpleCalcClass calculator;
        calculator = new SimpleCalcClass();

        calculator.setFirstNumber(num1);
        calculator.setSecondNumber(num2);
        calculator.setAction(action);
        calculator.calculate();
    }
}
