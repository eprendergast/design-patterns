package com.learning.behaviour.memento.model;

// Originator
public class Editor {

    // Creates and stores states in the Mementon objects

    private String state;

    public EditorState createState() {
        return new EditorState(state);
    }

    public void restore(EditorState state) {
        this.state = state.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
