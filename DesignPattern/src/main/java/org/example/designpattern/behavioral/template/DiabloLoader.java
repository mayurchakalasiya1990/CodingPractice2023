package org.example.designpattern.behavioral.template;

public class DiabloLoader extends BaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Diablo files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Diablo objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading Diablo sounds...");
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading Diablo profiles...");
        // Some Diablo Code...
    }
}
