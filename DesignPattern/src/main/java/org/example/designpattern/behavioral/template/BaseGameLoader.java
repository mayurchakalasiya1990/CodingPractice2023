package org.example.designpattern.behavioral.template;

public abstract class BaseGameLoader {

    public void load(){
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract void initializeProfiles();

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);

    abstract  void downloadAdditionalFiles();

    protected void cleanTempFiles(){
        System.out.println("Cleaning temporary files...");
    }
}
