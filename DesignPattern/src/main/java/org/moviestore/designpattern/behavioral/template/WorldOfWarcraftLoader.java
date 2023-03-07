package org.example.designpattern.behavioral.template;

public class WorldOfWarcraftLoader extends BaseGameLoader {
    @Override
    void initializeProfiles() {
        System.out.println("Loading WoW profiles...");
    }

    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local WoW files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating WoW objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading WoW sounds...");
    }
}
