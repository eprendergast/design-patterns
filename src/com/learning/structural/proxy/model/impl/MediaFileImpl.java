package com.learning.structural.proxy.model.impl;

import com.learning.structural.proxy.model.MediaFile;

public class MediaFileImpl implements MediaFile {

    private String fileName;

    public MediaFileImpl(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void printName() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

}
