package com.learning.behaviour.state.model.impl;

import com.learning.behaviour.state.model.Tool;

// Concrete State B
public class BrushTool implements Tool {

    public void mouseDown() {
        System.out.println("Brush icon");
    }

    public void mouseUp() {
        System.out.println("Draw a line");
    }

}
