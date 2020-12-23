package com.learning.behaviour.interpreter.model;

public class InterpreterEngine {

    public int add(String input) {
        String[] tokens = interpret(input);
        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[1]);
        return (num1 + num2);
    }

    public int multiply(String input) {
        String[] tokens = interpret(input);
        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[1]);
        return (num1 * num2);
    }

    private String[] interpret(String input) {
        // Replaces all non-digit characters with empty characters, and splits the input into tokens.
        String string = input.replaceAll("[^0-9]", " ");
        string = string.replaceAll("( )+", " ").trim();
        String[] tokens = string.split(" ");
        return tokens;
    }

}
