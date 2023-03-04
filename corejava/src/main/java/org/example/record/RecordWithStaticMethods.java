package org.example.record;

record Vehicle3(String brand, String licensePlate) {

    public static String brandAsUpperCase(Vehicle3 vehicle) {
        return vehicle.brand.toUpperCase();
    }

}
public class RecordWithStaticMethods {
    public static void main(String[] args) {
        Vehicle3 vehicle=new Vehicle3("nissan","RG-05-AWSZA");
        System.out.println("Brand:"+vehicle.brand());
        System.out.println("Brand:"+Vehicle3.brandAsUpperCase(vehicle));
        System.out.println("licensePlate:"+vehicle.licensePlate());
        System.out.println("Vehicle:"+vehicle.toString());
    }
}
