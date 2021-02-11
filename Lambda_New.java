package com.example.java;

public class Lambda_New {

    public static void main(String args[]) {
        //Using custom made functional Interface
        Calculate add = (a, b) -> a + b;
        Calculate substract = (a, b) -> a - b;
        Calculate multiply = (a, b) -> a * b;
        Calculate divide = (a, b) -> (b != 0 ? a / b : 0);

        System.out.println("Add Result: "+add.calculate(4,3));
        System.out.println("Multiply Result: "+multiply.calculate(4,5));
        System.out.println("Substract Result: "+substract.calculate(7,6));
        System.out.println("Divide Result: "+divide.calculate(9,3));
    }
}
