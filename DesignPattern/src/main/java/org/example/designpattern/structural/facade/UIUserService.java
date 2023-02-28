package org.example.designpattern.structural.facade;

public class UIUserService {

    public static String getLoggedInUserId() {
        return "";
    }

    public void logIn(String username, String password) {
        System.out.println("Logging In...");
    }

    public void logout() {
        System.out.println("Logging Out...");
    }
}
