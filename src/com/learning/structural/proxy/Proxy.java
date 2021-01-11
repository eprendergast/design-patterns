package com.learning.structural.proxy;

import com.learning.structural.proxy.model.MediaFile;
import com.learning.structural.proxy.model.impl.ProxyMediaFile;

public class Proxy {

    // The Proxy pattern is used when we want to limit the capabilities and the functionalities of a class,
    // by using another class which limits it.

    public static void main(String[] args) {
        MediaFile mediaFile = new ProxyMediaFile("movie.mp4");

        mediaFile.printName(); // "Loading movie.mp4" and "Displaying movie.mp4" is printed
        System.out.println("");
        mediaFile.printName(); // Only "displaying movie.mp4" is printed
    }
}
