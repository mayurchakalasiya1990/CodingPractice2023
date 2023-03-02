package org.example.multithreading.volatileex;

public class Counter {

    private volatile int count = 0;

    public boolean inc(){
        if(this.count == 10){
            return false;
        }
        /*
            Increment operation of volatile variable is not atomic operation.
                1. read of variable
                2. increment of variable
                3. write of variable to main memory
             To make is atomic We should use AmoticInteger or other utility.
         */

        this.count++;
        return false;
    }
}
