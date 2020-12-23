package com.learning.behaviour.state.model.impl;

import com.learning.behaviour.state.model.Tool;

// Concrete State A
public class SelectionTool implements Tool {

    public void mouseDown() {
        System.out.println("Selection icon");
    }

    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
