package datastructure.designpattern.creational.factory;

public class App {
    public static void main(String[] args) {
        var car1 = CarFactory.getCar(CarTypes.Ford);
        var car2 = CarFactory.getCar(CarTypes.Ferrari);
        //LOGGER.info(car1.getDescription());
        //LOGGER.info(car2.getDescription());
        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
    }
}
