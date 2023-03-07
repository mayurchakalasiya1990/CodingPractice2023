package org.example.designpattern.behavioral.template;

public class App {
    public static void main(String[] args) {
        BaseGameLoader gameLoader=new DiabloLoader();
        gameLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

    }

}
