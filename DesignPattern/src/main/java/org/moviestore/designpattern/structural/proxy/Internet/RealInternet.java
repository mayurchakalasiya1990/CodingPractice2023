package org.example.designpattern.structural.proxy.Internet;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String url) {
        System.out.println("Connecting to %s".formatted(url));
    }
}
