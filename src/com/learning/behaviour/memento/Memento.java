package com.learning.behaviour.memento;

import com.learning.behaviour.memento.model.Editor;
import com.learning.behaviour.memento.model.History;

public class Memento {

    // The Memento pattern is concerned with the previous state of objects/
    // This means that the patten is used when we want to save some state of an object, in case we want to restore the object to that state later on

    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.restore(history.pop());

        // resulting content is "b"
        System.out.println(editor.getContent());
    }
}
