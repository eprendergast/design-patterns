package com.learning.behaviour.interpreter;

import com.learning.behaviour.interpreter.model.Expression;
import com.learning.behaviour.interpreter.model.InterpreterEngine;
import com.learning.behaviour.interpreter.model.impl.AddExpression;
import com.learning.behaviour.interpreter.model.impl.MultiplyExpression;

public class Interpreter {

    private InterpreterEngine engine;

    public Interpreter(InterpreterEngine engine) {
        this.engine = engine;
    }

    public int interpret(String input) {
        Expression expression = null;

        if (input.contains("add")) {
            expression = new AddExpression(input);
        } else if (input.contains("multiply")) {
            expression = new MultiplyExpression(input);
        }

        int result = expression.interpret(engine);
        System.out.println(input);
        return result;
    }

    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter(new InterpreterEngine());

        System.out.println("Result: " + interpreter.interpret("add 15 and 25"));
        System.out.println("Result: " + interpreter.interpret("multiply " + interpreter.interpret("add 5 and 5") + " and 10"));
    }

}
