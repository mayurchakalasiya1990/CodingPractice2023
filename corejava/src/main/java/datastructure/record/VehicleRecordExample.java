package datastructure.record;

/*
Record:
- A Java Record consist of one or more data fields which corresponds to member variables in a regular Java class.
- The Java compiler auto generates getter methods, toString(), hashcode() and equals() methods for these data fields,
so you don't have to write that boilerplate code yourself.
- Since a Java Record is immutable, no setter methods are generated.
- A Record type definition is final, meaning you cannot create subclasses (subrecords) of a Java Record type.


 */

public class VehicleRecordExample {
    record Vehicle(String brand, String licensePlate) {}

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");

        System.out.println( vehicle.brand() );
        System.out.println( vehicle.licensePlate() );

        System.out.println( vehicle.toString() );
    }
}
