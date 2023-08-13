package datastructure.record;

record NewVehicle(String brand, String licensePlate) {

    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }
}

public class RecordWithInstanceMethods {

    public static void main(String[] args) {
        NewVehicle vehicle=new NewVehicle("TATA","RG-05-AWSZA");
        System.out.println("Brand:"+vehicle.brandAsLowerCase());
        System.out.println("licensePlate:"+vehicle.licensePlate());
        System.out.println("Vehicle:"+vehicle.toString());
    }
}
