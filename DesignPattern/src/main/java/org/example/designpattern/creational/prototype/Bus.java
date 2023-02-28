package org.example.designpattern.creational.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class Bus extends Vehicle{

    public Bus(Bus bus) {
        super(bus);
    }

    public Bus(String carBrand, String engine, String cardModel) {
        super(carBrand,engine,cardModel);
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
