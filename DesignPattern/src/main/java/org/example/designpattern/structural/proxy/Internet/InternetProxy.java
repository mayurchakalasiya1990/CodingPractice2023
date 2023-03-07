package org.example.designpattern.structural.proxy.Internet;

import java.util.LinkedList;

public class InternetProxy implements Internet{

    Internet internet=new RealInternet();
    static final LinkedList<String> blockedURLs ;
    static {
        blockedURLs = new LinkedList<>();
        blockedURLs.add("www.bannedurl.com");
    }

    @Override
    public void connectTo(String url) {
        if (blockedURLs.contains(url)){
             throw new IllegalArgumentException(" Website is banned...");
        }else{
            internet.connectTo(url);
        }
    }
}
