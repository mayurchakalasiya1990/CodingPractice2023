package datastructure.record;

record Vehicle(String brand, String licensePlate) {
    public Vehicle(String brand) {
        this(brand, null);
    }
}

public class MultipleConstructorsRecord {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("BMW");
        System.out.println("Brand: "+vehicle.brand() );
        System.out.println("License Plat: "+vehicle.licensePlate() );
        System.out.println("Vehicle: "+vehicle.toString() );
    }

}
