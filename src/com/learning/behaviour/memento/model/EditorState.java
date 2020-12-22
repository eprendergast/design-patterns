package com.learning.behaviour.memento.model;

// Memento
public class EditorState {

    private String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
