package datastructure.designpattern.structural.adapter;

public class App {
    public static void main(String[] args) {

        MultiRestoApp multiRestoApp=new MultiRestoAppImpl();
        multiRestoApp.displayMenu(new XmlData());
        multiRestoApp.displayRecommendation(new XmlData());

        System.out.println("========================================");

        MultiRestoApp fancyUIServiceAdapter=new FancyUIServiceAdapter();
        fancyUIServiceAdapter.displayMenu(new XmlData());
        fancyUIServiceAdapter.displayRecommendation(new XmlData());
    }
}
