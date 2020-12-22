package com.learning.behaviour.state.models;

// Concrete State A
public class SelectionTool implements Tool {

    public void mouseDown() {
        System.out.println("Selection icon");
    }

    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
