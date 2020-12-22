package com.learning.behaviour.state;

import com.learning.behaviour.state.models.BrushTool;
import com.learning.behaviour.state.models.Canvas;
import com.learning.behaviour.state.models.SelectionTool;

public class State {

    // Used when a specific object needs to change its behavior, based on its state.

    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        System.out.println("Setting current tool to Selection...");
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("Setting current tool to Brush...");
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }

}
