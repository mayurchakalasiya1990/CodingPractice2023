package datastructure.designpattern.creational.factory;

public class CarFactory {
    public static Car getCar(CarTypes type) {
        return type.getConstructor().get();
    }


}
