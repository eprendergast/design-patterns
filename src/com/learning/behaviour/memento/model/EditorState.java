package com.learning.behaviour.memento.model;

// Memento
public class EditorState {

    // Contains a state that we wish to save for later use

    private String state;

    public EditorState(String content) {
        this.state = content;
    }

    public String getState() {
        return state;
    }

}
