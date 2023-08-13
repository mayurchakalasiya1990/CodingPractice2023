package datastructure.functional;

import java.util.function.Supplier;

public class SupplierExample {



    public static void main(String[] args) {
        Supplier supplier= () -> "Supplier example";
        System.out.println(supplier.get());
    }

}
