package com.learning.behaviour.memento;

import com.learning.behaviour.memento.model.Editor;
import com.learning.behaviour.memento.model.History;

public class Memento {

    // The Memento pattern is concerned with the previous state of objects.
    // The patten is used when we want to save some state of an object, in case we want to restore the object to that state later on

    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setState("a");
        System.out.println("The current state is " + editor.getState() + ".");
        history.push(editor.createState());

        editor.setState("b");
        System.out.println("The current state is " + editor.getState() + ".");
        history.push(editor.createState());

        editor.setState("c");
        System.out.println("The current state is " + editor.getState() + ".");

        System.out.println("Restoring state now...");
        editor.restore(history.pop());
        System.out.println("The current state is " + editor.getState() + ".");
    }
}
