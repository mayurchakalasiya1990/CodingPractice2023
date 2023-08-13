package datastructure.designpattern.creational.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class Car extends Vehicle{

    public Car(Car car){
        super(car);
    }

    public Car(String carBrand, String engine, String cardModel) {
        super(carBrand,engine,cardModel);
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }


}
