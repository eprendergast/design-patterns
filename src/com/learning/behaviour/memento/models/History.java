package com.learning.behaviour.memento.models;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History {

    // Takes care of the restoration process

    private List<EditorState> states = new ArrayList<EditorState>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }

}
