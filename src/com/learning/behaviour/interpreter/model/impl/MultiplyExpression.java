package com.learning.behaviour.interpreter.model.impl;

import com.learning.behaviour.interpreter.model.Expression;
import com.learning.behaviour.interpreter.model.InterpreterEngine;

public class MultiplyExpression implements Expression {

    private String expression;

    public MultiplyExpression(String expression) {
        this.expression = expression;
    }

    public int interpret(InterpreterEngine engine) {
        return engine.multiply(expression);
    }

}


