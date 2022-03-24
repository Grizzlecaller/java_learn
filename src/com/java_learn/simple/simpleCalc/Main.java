package com.java_learn.simple.simpleCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("input first number: ");
        calculator.setFirstNumber(userInput.nextInt());

        System.out.print("input second number: ");
        calculator.setSecondNumber(userInput.nextInt());

        System.out.print("input math action: ");
        String action = userInput.nextLine();
        action = userInput.nextLine();
        calculator.setAction(action);

        calculator.calculate();
    }
}
