package datastructure.designpattern.structural.adapter;

public class MultiRestoAppImpl implements  MultiRestoApp{
    @Override
    public void displayMenu(XmlData data) {
        System.out.println("Displaying Menus using XML Data");
    }

    @Override
    public void displayRecommendation(XmlData data) {
        System.out.println("Displaying Recommendation using XML Data");
    }
}
