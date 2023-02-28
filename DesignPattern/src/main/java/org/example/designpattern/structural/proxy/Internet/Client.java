package org.example.designpattern.structural.proxy.Internet;

public class Client {
    public static void main(String[] args) {
        Internet internet=new InternetProxy();
        internet.connectTo("www.google.com");
        internet.connectTo("www.bannedurl.com");
    }

}
