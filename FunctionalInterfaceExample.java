package com.example.java;

import java.util.function.*;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = (s) -> s.length() < 10;
        System.out.println(stringPredicate.test("Apple") + " Predicate take argument and returns true or false");

        Consumer<String> stringConsumer = (s) -> System.out.println(s.toLowerCase() + " Consumer take argument perform operation and return void ");
        stringConsumer.accept("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        Function<Integer, String> integerStringFunction = (num) -> Integer.toString(num);
        System.out.println("Function take argument type and return type both. " + integerStringFunction.apply(26));

        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get() + " Supplier takes nothing in argument ,supplies return value");

        UnaryOperator<String> unaryOperator = (a) -> a.toUpperCase();
        System.out.println("Takes one argument " + unaryOperator.apply("Apple"));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("Takes 2 argument " + binaryOperator.apply(10, 20));

    }
}
