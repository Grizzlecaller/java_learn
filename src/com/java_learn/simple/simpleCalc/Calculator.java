package com.java_learn.simple.simpleCalc;

public class Calculator {

    private float firstNumber;
    private float secondNumber;
    private String action;

    public void setFirstNumber(float firstNumber) { this.firstNumber = firstNumber; }
    public void setSecondNumber(float secondNumber) { this.secondNumber = secondNumber; }
    public void setAction(String action) { this.action = action; }

    public float getFirstNumber() { return firstNumber; }

    public float getSecondNumber() { return secondNumber; }

    public String getAction() { return action; }

    private float sum() { return firstNumber + secondNumber; }

    private float sub() { return firstNumber - secondNumber; }

    private float mul() { return firstNumber * secondNumber; }

    private float isSecondNumberNoEqualZero() { return firstNumber / secondNumber; }

    private float div() {
        if (secondNumber == 0) {
            System.out.println("You can`t divide by zero");
        } else {
            return isSecondNumberNoEqualZero();
        }
        return Float.NEGATIVE_INFINITY;
    }

    private void finalResult(float result) { System.out.println("Result is " + result); }

    public void calculate() {
        if (action.equals("+")) finalResult(sum());
        if (action.equals("-")) finalResult(sub());
        if (action.equals("*")) finalResult(mul());
        if (action.equals("/")) finalResult(div());
    }
}
