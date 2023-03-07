package org.example.multithreading.immutable;

/*
there is no setter method. O
nce an ImmutableValue instance is created you cannot change its value.
It is immutable.
 */
public class ImmutableValue {
    private int value = 0;

    public ImmutableValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    /*
        Notice how the add() method returns a new ImmutableValue instance with the result of the add operation,
        rather than adding the value to itself.
     */
    public ImmutableValue add(int valueToAdd){
        return new ImmutableValue(this.value + valueToAdd);
    }

}
