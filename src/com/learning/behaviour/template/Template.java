package com.learning.behaviour.template;

import com.learning.behaviour.template.model.Dog;
import com.learning.behaviour.template.model.impl.GoldenRetriever;
import com.learning.behaviour.template.model.impl.Terrier;

public class Template {

    public static void main(String[] args) {

        Dog retriever = new GoldenRetriever();
        Dog terrier = new Terrier();

        retriever.beingADog();
        terrier.beingADog();
    }
}
