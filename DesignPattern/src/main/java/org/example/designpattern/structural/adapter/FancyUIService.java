package org.example.designpattern.structural.adapter;

public class FancyUIService {
    public void displayMenus(JsonData jsonData) {
        // Make use of the JsonData to fetch menus
        System.out.println("Display Menu UI using JSON Data");
    }

    public void displayRecommendations(JsonData jsonData) {
        // Make use of the JsonData to load recommendations
        System.out.println("Display Recommendation on UI using JSON Data");
    }
}
