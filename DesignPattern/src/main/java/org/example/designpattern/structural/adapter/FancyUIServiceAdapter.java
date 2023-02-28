package org.example.designpattern.structural.adapter;

public class FancyUIServiceAdapter implements MultiRestoApp {

    FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }
    public  void displayMenu(XmlData xmlData){
        JsonData jsonData = convertXMLToJson(xmlData);
        System.out.println("Display Fancy Menus converted JSON Data...");
        fancyUIService.displayMenus(jsonData);
    }

    public void displayRecommendation(XmlData xmlData){
        JsonData jsonData=convertXMLToJson(xmlData);
        System.out.println("Display Fancy Recommendation converted to JSON Data...");
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXMLToJson(XmlData xmlData) {
        return new JsonData();
    }


}
